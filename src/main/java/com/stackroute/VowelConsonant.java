package com.stackroute;

public class VowelConsonant
{
    public static String isVowelConsonant(String s)
    {
        String result="";
        char arr[] = s.toCharArray();
        for(char c: arr)
        {
            if(c =='a' || c =='e' || c == 'i' || c =='o' || c == 'u')
            {
                System.out.println("Vowel");
                result += "Vowel";
            }else
            {
                System.out.println("Consonant");
                result += "Consonant";
            }
        }
        return result;
    }
}
