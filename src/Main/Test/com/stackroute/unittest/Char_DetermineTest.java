package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Char_DetermineTest {
    Char_Determine character;

    @Before
    public void setUp() throws Exception {
        character = new Char_Determine();
    }

    @After
    public void tearDown() throws Exception {
        character = null;
    }

    @Test
    public void characterDet() {
        boolean expected = true;
        boolean actual = character.characterDet('A');
        assertEquals(expected,actual);
    }
    @Test
    public void characterDet1() {
        boolean expected = true;
        boolean actual = character.characterDet('!');
        assertEquals(expected,actual);
    }
}