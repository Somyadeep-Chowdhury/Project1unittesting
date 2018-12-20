package com.stackroute;

public class PalindromeChecker
{
    public static int checkpalindrome(int n)
    {
        int rev, sum=0, temp, add=0;
        temp = n;
        while(n!=0)
        {
            rev = n % 10;
            sum = sum * 10 + rev;
            n = n / 10;
        }
        if (sum == temp)
        {
            while(temp>0)
            {
                if ((temp%10)%2==0)
                {
                    add=add+(temp%10);
                }
                temp/=10;
            }
            if (add>25) {
                System.out.println("is palindrome and greater than 25");
            }
            else
                {
                System.out.println("is palindrome and less than 25");
                }
        }else
        {
            System.out.println("Not Palindrome");
        }
        return sum;
    }
}
