package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatPattTest {
    RepeatPatt patt;

    @Before
    public void setUp() throws Exception {
        patt = new RepeatPatt();
    }

    @After
    public void tearDown() throws Exception {
        patt=null;
    }

    @Test
    public void pattern() {

        String expected="saurabhrabhrabhrabhrabh";
        String actual = patt.Pattern("saurabh",4);
        assertEquals(expected,actual);
    }
    @Test
    public void pattern1() {

        String expected="stackrouterouterouterouterouteroute";
        String actual = patt.Pattern("stackroute",5);
        assertEquals(expected,actual);
    }
}