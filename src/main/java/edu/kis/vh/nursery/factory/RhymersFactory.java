package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.StackCountingOutRhymer;

public interface RhymersFactory {

    public StackCountingOutRhymer GetStandardRhymer();

    public StackCountingOutRhymer GetFalseRhymer();

    public StackCountingOutRhymer GetFIFORhymer();

    public StackCountingOutRhymer GetHanoiRhymer();

}
