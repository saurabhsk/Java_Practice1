package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Const_VowTest {
    Const_Vow convow;

    @Before
    public void setUp() throws Exception {
        convow = new Const_Vow();
    }

    @After
    public void tearDown() throws Exception {
        convow = null;
    }

    @Test
    public void consOrvow() {
        boolean expected = true;
        boolean actualValue=convow.consOrvow("Saurabh");
        assertEquals(expected,actualValue);
    }
    @Test
    public void consOrvow1() {
        boolean expected = false;
        boolean actualValue=convow.consOrvow("@123");
        assertEquals(expected,actualValue);
    }
}