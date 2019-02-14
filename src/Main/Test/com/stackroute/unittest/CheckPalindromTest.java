package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPalindromTest {
    CheckPalindrom chkpal;
    @Before
    public void setUp() throws Exception {
       chkpal = new CheckPalindrom();
    }

    @After
    public void tearDown() throws Exception {
        chkpal=null;
    }

    @Test
    public void palindrom() {

        //Arrange
        long expected = 121;
        long actual = chkpal.Palindrom(121);
        assertEquals(expected,actual);
//        assertEquals(2468642,c.Palindrom(2468642));
//        assertEquals(12345654321l,c.Palindrom(12345654321l));
    }
    @Test
    public void palindrom1() {

        //Arrange
        long expected = 2468642;
        long actual = chkpal.Palindrom(2468642);
        assertEquals(expected, actual);
    }
    @Test
    public void palindrom2() {

        //Arrange
        long expected = 12345654321l;
        long actual = chkpal.Palindrom(12345654321l);
        assertEquals(expected, actual);
    }

}