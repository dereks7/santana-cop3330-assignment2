import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Derek Santana
 */

/*
Resting Pulse: 65        Age: 22

Intensity    | Rate
-------------|--------
55%          | 138 bpm
60%          | 145 bpm
65%          | 151 bpm
:               :
85%          | 178 bpm
90%          | 185 bpm
95%          | 191 bpm

TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
 */

public class ex31
{
    public static void main( String[] args )
    {
        System.out.printf("Resting Pulse: \t");
        Scanner in1 = new Scanner(System.in);
        int rp = in1.nextInt();
        System.out.printf("Age: ");
        Scanner in2 = new Scanner(System.in);
        int age = in2.nextInt();
        System.out.printf("\nIntensity    | Rate\n-------------|--------\n");
        int ity=55;
        double bpm;
        for(int i=0;i<9;i++)
        {
            bpm = ((((220-age)-rp)*(ity/100.0)) + rp);
            double round=Math.round(bpm);
            System.out.printf("%d%%          | %.0f bpm\n",ity,round);
            ity += 5;
        }
    }
}
