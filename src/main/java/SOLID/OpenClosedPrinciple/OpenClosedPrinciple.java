package SOLID.OpenClosedPrinciple;

import SOLID.OpenClosedPrinciple.sortmethods.InsertionSort;
import SOLID.OpenClosedPrinciple.sortmethods.MergeSort;
import SOLID.OpenClosedPrinciple.sortmethods.SelectionSort;

public class OpenClosedPrinciple {

    public static void main(String[] args) {
        SorterProcessor.process(new MergeSort());
        SorterProcessor.process(new SelectionSort());
        SorterProcessor.process(new InsertionSort());
    }
}
