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
        System.out.println(isPolindrom("4444444"));
        System.out.println(isPolindrom(""));
    }

    private static boolean isPolindrom(String s)
    {

        int last = s.length() - 1;
        for (int first = 0; first < s.length()-1; first++)
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
            if (first>=last)
                return true;
        }
        return true;
    }
}
