package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SeriesTest {
    Series series;

    @Before
    public void setUp() throws Exception {
        series = new Series();
    }

    @After
    public void tearDown() throws Exception {
        series = null;
    }

    @Test
    public void seriesPatt() {
        boolean expected=true;
        boolean actual = series.seriesPatt(5);
        assertEquals(expected,actual);
    }
}