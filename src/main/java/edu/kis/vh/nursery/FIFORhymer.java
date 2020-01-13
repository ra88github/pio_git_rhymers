package edu.kis.vh.nursery;

public class FIFORhymer extends StackCountingOutRhymer {

    private StackCountingOutRhymer temp = new StackCountingOutRhymer();

    @Override
    public int countOut() {
        while (!isEmpty()) {
            temp.countIn(super.countOut());
        }

        int ret = temp.countOut();

        while (!temp.isEmpty()) {
            countIn(temp.countOut());
        }

        return ret;
    }
}
