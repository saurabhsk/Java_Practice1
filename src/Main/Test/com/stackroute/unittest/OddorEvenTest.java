package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddorEvenTest {

    OddorEven oddeven;
    @Before
    public void setUp() throws Exception {
        oddeven = new OddorEven();
    }

    @After
    public void tearDown() throws Exception {
        oddeven=null;
    }

    @Test
    public void tomJerry() {
        String expected = "Tom";
        String actual = oddeven.tomJerry(23);
        assertEquals(expected,actual);
    }
    @Test
    public void tomJerry1() {
        String expected = "Jerry";
        String actual = oddeven.tomJerry(26);
        assertEquals(expected,actual);
    }
}