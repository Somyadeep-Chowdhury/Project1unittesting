package com.stackroute;

public class TomJerry
{
    public static String isEvenOdd(int n)
    {
        String s = "not in range";
        while(n>20 && n<30)
        {
            if(n%2 == 0)
            {
                s= "Tom";
                break;
            }else
            {
                s= "Jerry";
                break;
            }
        }
        return s;
    }
}
