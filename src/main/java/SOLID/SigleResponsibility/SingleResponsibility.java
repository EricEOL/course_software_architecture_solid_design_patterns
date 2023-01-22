package SOLID.SigleResponsibility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SingleResponsibility {

    public static final int THRESHOLD = 5;

    public static void main(String[] args) {

        System.out.println("Welcome to the Application!");

        List<Integer> nums = inputNumbers();

        sortList(nums);

        for(int num : nums)
            System.out.print(num+" ");
    }

    public static List<Integer> inputNumbers() {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter 5 valid integers in the range [0, 10]");

        while(nums.size() < THRESHOLD) {

            String s = scanner.nextLine();

            if(!checkInteger(s) || !checkRange(s)) {
                continue;
            }

            int num = Integer.parseInt(s);

            nums.add(num);
        }

        scanner.close();

        return nums;
    }

    public static boolean checkInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return false;
        }
    }

    public static boolean checkRange(String s) {
        int num = Integer.parseInt(s);

        if(num<0 || num > 10) {
            System.out.println("Invalid range! Try again!");
            return false;
        }
        return true;
    }

    public static void sortList(List<Integer> nums) {
        Collections.sort(nums);
    }
}

/*

** SINGLE RESPONSIBILITY PRINCIPLE **

EXERCISE:
In the previous lecture we have seen how to create
distinct classes to represent independent behaviors
and operations. In this exercise you have to do
the same - but instead of creating classes you have
to handle methods.

public static final int THRESHOLD = 5;

public static void main(String[] args) {

        System.out.println("Welcome to the Application!");

        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter 5 valid integers in the range [0, 10]");

        while(nums.size() < THRESHOLD) {

            String s = scanner.nextLine();

            try {
                Integer.parseInt(s);
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid! Try again!");
                continue;
            }

            int num = Integer.parseInt(s);

            if(num<0 || num > 10) {
                System.out.println("Invalid range! Try again!");
                continue;
            }

            nums.add(num);
        }

        scanner.close();

        Collections.sort(nums);

        for(int num : nums)
            System.out.print(num+" ");
    }

So this application is waiting for 5 integers - in the
range [0,10] - from the user. Then the application
sorts the integers and show the result.

Let's create independent methods for the independent
operations!

 */
