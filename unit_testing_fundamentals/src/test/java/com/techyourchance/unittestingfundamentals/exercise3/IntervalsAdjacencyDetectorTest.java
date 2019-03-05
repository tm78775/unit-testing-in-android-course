package com.techyourchance.unittestingfundamentals.exercise3;

import com.techyourchance.unittestingfundamentals.example3.Interval;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntervalsAdjacencyDetectorTest {

    IntervalsAdjacencyDetector SUT;

    @Before
    public void setUp() throws Exception {
        SUT = new IntervalsAdjacencyDetector();
    }

    @Test
    public void isAdjacent_intervalIsAdjacent_trueReturned() {
        Interval i1 = new Interval(2, 7);
        Interval i2 = new Interval(8, 12);
        boolean res = SUT.isAdjacent(i1, i2);
        Assert.assertThat(res, CoreMatchers.is(true));
    }

    @Test
    public void isAdjacent_intervalIsNotAdjacent_falseReturned() {
        Interval i1 = new Interval(2, 7);
        Interval i2 = new Interval(10, 12);
        boolean res = SUT.isAdjacent(i1, i2);
        Assert.assertThat(res, CoreMatchers.is(false));
    }

    @Test
    public void isAdjacent_intervalOverlaps_falseReturned() {
        Interval i1 = new Interval(2, 7);
        Interval i2 = new Interval(6, 12);
        boolean res = SUT.isAdjacent(i1, i2);
        Assert.assertThat(res, CoreMatchers.is(false));
    }

    @Test
    public void isAdjacent_intervalIsAdjacentTwoBeforeOne_trueReturned() {
        Interval i1 = new Interval(2, 7);
        Interval i2 = new Interval(0, 1);
        boolean res = SUT.isAdjacent(i1, i2);
        Assert.assertThat(res, CoreMatchers.is(true));
    }
}