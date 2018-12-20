package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class TomJerryTest {

    @Test
    public void isEvenOdd1()
    {
        assertEquals("Jerry",TomJerry.isEvenOdd(25));
    }

    @Test
    public void isEvenOdd2()
    {
        assertEquals("Tom",TomJerry.isEvenOdd(28));
    }

    @Test
    public void isEvenOdd3()
    {
        assertEquals("not in range",TomJerry.isEvenOdd(5));
    }




}