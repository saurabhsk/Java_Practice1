package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatPattTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void pattern() {
        RepeatPatt p = new RepeatPatt();
        assertEquals("saurabhrabhrabhrabhrabh",p.Pattern("saurabh",4));
    }
}