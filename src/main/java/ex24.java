import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Derek Santana
 */

/*
Enter two strings and I'll tell you if they are anagrams:
Enter the first string: note
Enter the second string: tone
"note" and "tone" are anagrams.
 */

public class ex24
{
    public static void main( String[] args )
    {
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.println("Enter the first string: ");
        Scanner in1 = new Scanner(System.in);
        String str1 = in1.nextLine();
        System.out.println("Enter the second string: tone");
        Scanner in2 = new Scanner(System.in);
        String str2 = in2.nextLine();
        int n=0;

        if(isAnagram(str1,str2)==1)
        {
            n=1;
        }
        if(isAnagram(str1,str2)==-1)
        {
            n=-1;
        }

        if(n==1)
        {
            System.out.printf(" \"%s\" and \"%s\" are anagrams", str1,str2);
        }
        if(n==-1)
        {
            System.out.printf(" \"%s\" and \"%s\" are not anagrams", str1,str2);
        }

    }

    public static int isAnagram(String s1,String s2)
    {
        int i=0;
        int l = s1.length();
        if(s1.length()==s2.length())
        {

            for(i = 0; i<s1.length();i++)
            {
                if(s1.charAt(i)==s2.charAt(l-1))
                {
                    i++;
                    l--;
                }
            }
        }
        if(i==s1.length())
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
