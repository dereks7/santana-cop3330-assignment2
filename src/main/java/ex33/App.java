package ex33;

import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Derek Santana
 */

/*
What's your question?
> Will I be rich and famous?

Ask again later.
 */

public class App
{
    public static void main( String[] args )
    {
        Random rand = new Random();
        int rnum = rand.nextInt(3);
        String[] ans =  {
                "Yes",
                "No",
                "Maybe",
                "Ask again later"
        };
        System.out.printf("What's your question?\n> ");
        Scanner in1 = new Scanner(System.in);
        String que = in1.nextLine();
        System.out.printf("\n%s",ans[rnum]);

    }
}
