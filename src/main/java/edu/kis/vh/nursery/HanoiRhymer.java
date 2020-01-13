package edu.kis.vh.nursery;

public class HanoiRhymer extends StackCountingOutRhymer {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!isEmpty() && in > peek())
            totalRejected++;
        else
            super.countIn(in);
    }
}
