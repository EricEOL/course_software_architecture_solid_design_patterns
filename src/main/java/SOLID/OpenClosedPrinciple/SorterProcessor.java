package SOLID.OpenClosedPrinciple;

import SOLID.OpenClosedPrinciple.sortmethods.ISort;

public class SorterProcessor {

    public static void process(ISort sortMethod) {
        sortMethod.sort();
    }
}
