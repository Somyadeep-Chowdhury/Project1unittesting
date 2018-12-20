package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    @Test
    public void checkpalindrome1()
    {
        assertEquals(321,PalindromeChecker.checkpalindrome(123));
    }

    @Test
    public void checkpalindrome2()
    {
        assertEquals(121,PalindromeChecker.checkpalindrome(121));
    }

    @Test
    public void checkpalindrome3()
    {
        assertEquals(1468641,PalindromeChecker.checkpalindrome(1468641));
    }

}