package ex30;

import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Derek Santana
 */

public class App
{
    public static void main( String[] args )
    {
        for(int i=1;i<13;i++)
        {
            for(int j=1;j<13;j++)
            {
                System.out.printf("%5d",j*i);
            }
            System.out.printf("\n");
        }
    }
}
