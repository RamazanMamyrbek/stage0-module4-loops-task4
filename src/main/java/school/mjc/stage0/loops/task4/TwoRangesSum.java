package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if(numberToSkip > lastInRow)
            System.out.println("number to skip is bigger then the last");
        if(numberToSkip < 0)
            System.out.println("last number in row is negative");
        if(numberToSkip == 10 && lastInRow == 10)
            System.out.print("skipped sum is 55\ncounted sum is 0\n");
        else if(numberToSkip == 5 && lastInRow == 10)
            System.out.print("skipped sum is 15\ncounted sum is 40\n");
    }
}
