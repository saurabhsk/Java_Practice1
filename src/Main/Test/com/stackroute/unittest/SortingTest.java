package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {
    Sorting sortVariable;
    @Before
    public void setUp() throws Exception {
        sortVariable=new Sorting();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sort() {
        boolean expected=true;
        boolean actual=sortVariable.sort(12345);
        assertEquals(expected,actual);

        boolean expected1=true;
        boolean actual2=sortVariable.sort(2446682);
        assertEquals(expected1,actual2);
    }
}