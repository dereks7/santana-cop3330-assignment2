package ex38;

import java.util.Objects;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Derek Santana
 */

/*
Enter a list of numbers, separated by spaces: 1 2 3 4 5 6 7 8
The even numbers are 2 4 6 8.
 */

public class App
{
    public static void main( String[] args )
    {
        System.out.println("Enter a list of numbers, separated by spaces: ");
        Scanner in1 = new Scanner(System.in);
        String list = in1.nextLine();
        String[] array=list.split(" ");

        System.out.printf("The even numbers are");

        for(int i=0;i<array.length;i++)
        {
            int yo = filterEvenNumbers(array[i]);
            if(yo==0)
            {
                continue;
            }
            else
            {
                System.out.printf(" %d",yo);
            }

        }
        System.out.printf(".");
    }
    public static int filterEvenNumbers(String array)
    {
        int r = Integer.parseInt(array);

        if(r%2!=0)
        {
            return 0;
        }
        else
        {
            return r;
        }
    }
}
