package com.techyourchance.unittestingfundamentals.exercise2;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringDuplicatorTest {

    StringDuplicator SUT;

    @Before
    public void setUp() throws Exception {
        SUT = new StringDuplicator();
    }

    @Test
    public void duplicate_emptyString_emptyString() {
        String res = SUT.duplicate("");
        assertThat(res, is(""));
    }

    @Test
    public void duplicate_hello_hello() {
        String res = SUT.duplicate("hello");
        assertThat(res, is("hellohello"));
    }
}