package ex37;

import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Derek Santana
 */
/*
What's the minimum length? 8
How many special characters? 2
How many numbers? 2
Your password is aurn2$1s#
 */

public class App
{
    public static void main( String[] args )
    {
        System.out.println("What's the minimum length? ");
        Scanner in1 = new Scanner(System.in);
        int len = in1.nextInt();
        System.out.println("How many special characters? ");
        Scanner in2 = new Scanner(System.in);
        int sc = in2.nextInt();
        System.out.println("How many numbers? ");
        Scanner in3 = new Scanner(System.in);
        int nums = in3.nextInt();
        Random rand = new Random();
        int leng = rand.nextInt((30-len)+len);

        String a = "abcdefghijklmnopqrstuvwxyz";
        String n = "0123456789";
        String s = "~!@#$%^&*()_-";
        String[] al = a.split("");
        String[] ns = n.split("");
        String[] sp = s.split("");

        List<String> alpha = new ArrayList<String>(List.of(al));
        List<String> numbers = new ArrayList<String>(List.of(ns));
        List<String> spec = new ArrayList<String>(List.of(sp));
        List<String> random = new ArrayList<String>();
        int special=0;
        int numrs=0;
        alpha.addAll(numbers);
        alpha.addAll(spec);
        int listlen = (al.length+ns.length+sp.length);

        for(int i=0;i<leng;)
        {
            int h = rand.nextInt(listlen);
            if(h>26&&h<37)
            {
                numrs++;
                if(numrs<nums)
                {
                    random.add(i,alpha.get(h));
                    i++;
                }
            }
            if(h>36&&h<50)
            {
                special++;
                if(special<sc)
                {
                    random.add(i,alpha.get(h));
                    i++;
                }
            }
            if(h<27)
            {
                random.add(i,alpha.get(h));
                i++;
            }
        }

        Collections.shuffle(random);

        for(int i=0;i<leng;i++)
        {
            System.out.print(random.get(i) + " ");
        }
    }
}
