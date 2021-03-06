package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString rev;

    @Before
    public void setUp() throws Exception {
        rev = new ReverseString();
    }

    @After
    public void tearDown() throws Exception {
        rev = null;
    }

    @Test
    public void revstr() {
        String expected="nodnol";
        String actual = rev.Revstr("london");
        assertEquals(expected,actual);
    }
    @Test
    public void revstr1() {
        String expected="hbaruas";
        String actual = rev.Revstr("saurabh");
        assertEquals(expected,actual);
    }
}