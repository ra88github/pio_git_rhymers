package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int EMPTY_VALUE = -1;
    private static final int EMPTY_INDEX = -1;
    private static final int NUMBERS_COUNT = 12;

    private final int[] numbers = new int[NUMBERS_COUNT];
    public int currentNumberIndex = EMPTY_INDEX;

    public void countIn(int in) {
        if (!isFull())
            numbers[++currentNumberIndex] = in;
    }

    public boolean isEmpty() {
        return currentNumberIndex == EMPTY_INDEX;

    }

    public boolean isFull() {
        return currentNumberIndex == NUMBERS_COUNT-1;
    }

    protected int peekaboo() {
        if (isEmpty())
            return DefaultCountingOutRhymer.EMPTY_VALUE;
        return numbers[currentNumberIndex];
    }

    public int countOut() {
        if (isEmpty())
            return DefaultCountingOutRhymer.EMPTY_VALUE;
        return numbers[currentNumberIndex--];
    }

}
