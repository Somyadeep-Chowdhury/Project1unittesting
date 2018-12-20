package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyPatternTest {

    @Test
    public void iteration1()
    {
        assertEquals("122",MyPattern.iteration(2));
    }

    @Test
    public void iteration2()
    {
        assertEquals("122333",MyPattern.iteration(3));
    }

    @Test
    public void iteration3()
    {
        assertEquals("1223334444",MyPattern.iteration(4));
    }
}