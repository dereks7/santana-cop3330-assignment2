package ex32;

import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Derek Santana
 */
/*
Let's play Guess the Number!

Enter the difficulty level (1, 2, or 3): 1
I have my number. What's your guess? 5
Too low. Guess again: 7
Too low. Guess again: 9
You got it in 3 guesses!

Do you wish to play again (Y/N)? y

Enter the difficulty level (1, 2, or 3): 3
I have my number. What's your guess? 500
Too low. Guess again: 750
Too high. Guess again: 600
Too low. Guess again: 700
Too low. Guess again: 725
Too high. Guess again: 715
Too high. Guess again: 710
Too high. Guess again: 705
Too high. Guess again: 701
Too low. Guess again: 702
You got it in 10 guesses!

Do you wish to play again (Y/N)? n
 */

public class App
{
    public static void main( String[] args )
    {
        Random rand = new Random();
        int rnum=0;

        System.out.printf("Let's play Guess the Number!\n\n");

        String play="";

        while(!Objects.equals(play, "n")||!Objects.equals(play, "N"))
        {
            System.out.printf("Enter the difficulty level (1, 2, or 3): ");
            Scanner in1 = new Scanner(System.in);
            if(in1.hasNextInt())
            {
                int count=0;
                int lvl = in1.nextInt();
                if(lvl==1)
                {
                    rnum = rand.nextInt(10);
                }
                else if(lvl==2)
                {
                    rnum = rand.nextInt(100);
                }
                else if(lvl==3)
                {
                    rnum = rand.nextInt(1000);
                }
                System.out.printf("I have my number. What's your guess?");
                int gue=0;
                while(rnum!=gue)
                {

                    Scanner guess = new Scanner(System.in);
                    if(guess.hasNextInt())
                    {
                        gue = guess.nextInt();

                        if(gue<rnum)
                        {
                            System.out.printf("Too low. Guess again:");
                            count++;
                            continue;
                        }
                        else if(gue>rnum)
                        {
                            System.out.printf("Too high. Guess again:");
                            count++;
                            continue;
                        }
                        else if(gue==rnum)
                        {
                            count++;
                            System.out.printf("You got it in %d guesses!\n\n",count);
                        }
                    }
                    else
                    {
                        System.out.printf("Enter a number\n");
                        continue;
                    }
                }
            }
            else
            {
                System.out.printf("Enter an integer 1-3\n");
                continue;
            }
            System.out.printf("Do you wish to play again (Y/N)? ");
            Scanner yn = new Scanner(System.in);
            String yorn = yn.nextLine();
            if(yorn.equals("y")||yorn.equals("Y"))
            {
                continue;
            }
            else if(yorn.equals("n")||yorn.equals("N"))
            {
                break;
            }
        }
    }
}
