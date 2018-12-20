package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantTest {

    @Test
    public void isVowelConsonant1()
    {
        assertEquals("Vowel",VowelConsonant.isVowelConsonant("a"));
    }

    @Test
    public void isVowelConsonant2()
    {
        assertEquals("VowelConsonant",VowelConsonant.isVowelConsonant("az"));
    }

    @Test
    public void isVowelConsonant3()
    {
        assertEquals("ConsonantConsonant",VowelConsonant.isVowelConsonant("gg"));
    }
}