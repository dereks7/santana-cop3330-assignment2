package ex29;

import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Derek Santana
 */
/*
What is the rate of return? 0
Sorry. That's not a valid input.
What is the rate of return? ABC
Sorry. That's not a valid input.
What is the rate of return? 4
It will take 18 years to double your initial investment.

years = 72 / r
 */

public class App
{
    public static void main( String[] args )
    {
        System.out.println("What is the rate of return? ");
        Scanner in1 = new Scanner(System.in);
        String rate = in1.nextLine();
        int n=1;
        while(n!=rate.length()+1)
        {

            for (int i=0;i<rate.length();i++)
            {
                if(!rate.equals("0") && Character.isDigit(rate.charAt(i)))
                {
                    n++;
                }
            }
            if(n==rate.length()+1)
            {
                break;
            }
            System.out.printf("Sorry. That's not a valid input.\n");
            in1 = new Scanner(System.in);
            rate = in1.nextLine();
        }

        int r = Integer.parseInt(rate);
        int yr = 72/r;
        System.out.printf("It will take %d years to double your initial investment.",yr);
    }
}
