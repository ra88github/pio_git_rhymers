package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.StackCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.RhymersFactory;

public class DefaultRhymersFactory implements RhymersFactory {

    @Override
    public StackCountingOutRhymer GetStandardRhymer() {
        return new StackCountingOutRhymer();
    }

    @Override
    public StackCountingOutRhymer GetFalseRhymer() {
        return new StackCountingOutRhymer();
    }

    @Override
    public StackCountingOutRhymer GetFIFORhymer() {
        return new FIFORhymer();
    }

    @Override
    public StackCountingOutRhymer GetHanoiRhymer() {
        return new HanoiRhymer();
    }

}
