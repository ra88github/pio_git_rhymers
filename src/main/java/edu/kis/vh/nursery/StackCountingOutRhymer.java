//komentarz na temat działania alt + strzałki, przesuwam się po między plikami otwartymi w eclipsie
package edu.kis.vh.nursery;

public class StackCountingOutRhymer {

    private static final int NUMBERS_MAX_SIZE = 12;
    private static final int NUMBERS_EMPTY_INDEX = -1;
    private static final int EMPTY_DEFAULT_RETURN_VALUE = -1;
    private int[] numbers = new int[NUMBERS_MAX_SIZE];

    public int currentNumberIndex = NUMBERS_EMPTY_INDEX;

    public void countIn(int newNumber) {
        if (!isFull())
            numbers[++currentNumberIndex] = newNumber;
    }

    public int countOut() {
        if (isEmpty())
            return EMPTY_DEFAULT_RETURN_VALUE;
        return numbers[currentNumberIndex--];
    }

    public boolean isFull() {
        return currentNumberIndex == NUMBERS_MAX_SIZE - 1;
    }

    public boolean isEmpty() {
        return currentNumberIndex == NUMBERS_EMPTY_INDEX;
    }

    protected int peek() {
        if (isEmpty())
            return EMPTY_DEFAULT_RETURN_VALUE;
        return numbers[currentNumberIndex];
    }


}
