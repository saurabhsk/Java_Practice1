package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPalindromTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void palindrom() {
        CheckPalindrom c = new CheckPalindrom();
        //Arrange
        assertEquals(121,c.Palindrom(121));
    }

}