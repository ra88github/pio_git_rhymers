package edu.kis.vh.nursery;

public class HanoiRhymer extends StackCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!isEmpty() && in > peek())
            totalRejected++;
        else
            super.countIn(in);
    }
}
