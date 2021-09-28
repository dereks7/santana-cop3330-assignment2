package ex35;

import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Derek Santana
 */
/*
Enter a name: Homer
Enter a name: Bart
Enter a name: Maggie
Enter a name: Lisa
Enter a name: Moe
Enter a name:
The winner is... Maggie.
 */
public class App
{
    public static void main( String[] args )
    {
        String n="hi";
        int i=0;

        while(!n.equals(""))
        {
            Scanner in1 = new Scanner(System.in);
            String[] names= new String[100];
            System.out.printf("Enter a name: ");
            names[i]=in1.nextLine();
            while(!names[i].equals(""))
            {
                if(names[i].equals(""))
                {
                    n="";
                }
                else
                {
                    i++;
                    System.out.printf("Enter a name: ");
                    names[i]=in1.nextLine();
                }
            }
            Random rand = new Random();
            int rnum = rand.nextInt(i-1);
            System.out.printf("The winner is... %s",names[rnum]);
            n="";
        }

    }
}
