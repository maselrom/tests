package com.javarush.test.polindromTest;

/**
 * Created by roman_ma on 01.07.2016.
 */
public class PolindromTest
{
    public static void main(String[] args)
    {
        System.out.println(isPolindrom("cggc"));
        System.out.println(isPolindrom("cghgc"));
        System.out.println(isPolindrom(" 444444444444444444444  cghgc   "));
        System.out.println(isPolindrom(" 4444 44444444444444444  cghgc    706957096794749"));
        System.out.println(isPolindrom("cffc "));
        System.out.println(isPolindrom(" cfhkfc "));
    }

    private static boolean isPolindrom(String s)
    {
        int polindromLength = 0;
        int polindromCenter = 0;
        //search gor a polindrom length except digits
        for (int i = 0; i < s.length(); i++)
        {
            if (!Character.isDigit(s.charAt(i)))
                polindromLength++;
        }
        //search for a polindrom center
        int i = 0;
        for (int y = 0; y < s.length(); y++)
        {
            if (!Character.isDigit(s.charAt(y)))
            {
                polindromCenter = y;
                i++;
                if (i == polindromLength / 2 + 1)
                    break;
            }
        }

        //checking
        int last = s.length() - 1;
        for (int first = 0; first < polindromCenter; first++)
        {
            if (!Character.isDigit(s.charAt(first)))
            {
                while (Character.isDigit(s.charAt(last)))
                {
                    last--;
                }
                if (s.charAt(last) != s.charAt(first))
                    return false;
                else
                    last--;
            }
        }
        return true;
    }
}
