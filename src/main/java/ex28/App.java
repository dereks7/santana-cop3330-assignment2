package ex28;

import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Derek Santana
 */
/*
Enter a number: 1
Enter a number: 2
Enter a number: 3
Enter a number: 4
Enter a number: 5
The total is 15.
 */
public class App
{
    public static void main( String[] args )
    {
        int val=0;
        for(int i=0; i < 5; i++)
        {
            System.out.println("Enter a number: ");
            Scanner in1 = new Scanner(System.in);
            int n1 = in1.nextInt();
            val += n1;
        }
        System.out.printf("The total is %d.",val);
    }
}
