package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNoTest {
    GuessNo number;

    @Before
    public void setUp() throws Exception {
        number= new GuessNo();
    }

    @After
    public void tearDown() throws Exception {
        number = null;
    }

    @Test
    public void game() {
        boolean expected = true;
        boolean actual = number.game(23,23);
        assertEquals(expected,actual);
    }
    @Test
    public void game1() {
        boolean expected = true;
        boolean actual = number.game(23,45);
        assertEquals(expected,actual);
    }
    @Test
    public void game2() {
        boolean expected = false;
        boolean actual = number.game(23,122);
        assertEquals(expected,actual);
    }

}