import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Derek Santana
 */
/*
There are 5 employees:
John Smith
Jackie Jackson
Chris Jones
Amanda Cullen
Jeremy Goodwin

Enter an employee name to remove: Chris Jones

There are 4 employees:
John Smith
Jackie Jackson
Amanda Cullen
Jeremy Goodwin
 */
public class ex34
{
    public static void main( String[] args )
    {
        String[] names =  {
                "John Smith",
                "Jackie Jackson",
                "Chris Jones",
                "Amanda Cullen",
                "Jeremy Goodwin"
        };
        System.out.printf("There are 5 employees:\n");
        int numemp=5;
        for(int i=0;i<numemp;i++)
        {
            System.out.printf("%s\n",names[i]);
        }
        System.out.printf("\n");
        System.out.printf("Enter an employee name to remove: ");
        Scanner in1 = new Scanner(System.in);
        String rem = in1.nextLine();
        System.out.printf("\n");
        int index=10;
        int a=5;
        for (int i=0; i<numemp;i++)
        {
            if(names[i].equals(rem))
            {
                index = i;
                a = numemp-1;
            }
            else
            {
                continue;
            }
        }
        System.out.printf("There are %d employees:\n",a);
        for(int j=0;j<numemp;j++)
        {

            if(j==index)
            {
                continue;
            }
            else
            {
                System.out.printf("%s\n",names[j]);
            }
        }
    }
}
