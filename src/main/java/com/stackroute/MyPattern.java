package com.stackroute;

public class MyPattern
{
    public static String iteration(int n)
    {
        int result=0;
        String s = "";
        for (int i=0; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                s += i;
            }
        }
        return s;
    }
}
