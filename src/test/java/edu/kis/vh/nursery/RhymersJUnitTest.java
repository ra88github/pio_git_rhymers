package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    @Test
    public void testCountIn() {
        StackCountingOutRhymer rhymer = new StackCountingOutRhymer();
        int testValue = 4;
        rhymer.countIn(testValue);

        int result = rhymer.peek();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheck() {
        StackCountingOutRhymer rhymer = new StackCountingOutRhymer();
        boolean result = rhymer.isEmpty();
        Assert.assertEquals(true, result);

        rhymer.countIn(888);

        result = rhymer.isEmpty();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        StackCountingOutRhymer rhymer = new StackCountingOutRhymer();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertEquals(false, result);
            rhymer.countIn(888);
        }

        boolean result = rhymer.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPeekaboo() {
        StackCountingOutRhymer rhymer = new StackCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.peek();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.peek();
        Assert.assertEquals(testValue, result);
        result = rhymer.peek();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCountOut() {
        StackCountingOutRhymer rhymer = new StackCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.countOut();
        Assert.assertEquals(testValue, result);
        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}
