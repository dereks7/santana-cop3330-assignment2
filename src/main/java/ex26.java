import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Derek Santana
 */

/*
What is your balance? 5000
What is the APR on the card (as a percent)? 12
What is the monthly payment you can make? 100
It will take you 70 months to pay off this card.

n is the number of months.
i is the daily rate (APR divided by 365).
b is the balance.
p is the monthly payment.

n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
 */

public class ex26
{
    public static void main( String[] args )
    {
        System.out.println("What is your balance? ");
        Scanner in1 = new Scanner(System.in);
        double b = in1.nextDouble();

        System.out.println("What is the APR on the card (as a percent)? ");
        Scanner in2 = new Scanner(System.in);
        double apr = in2.nextDouble();

        apr = apr/100;
        double i = apr/365;

        System.out.println("What is the monthly payment you can make? ");
        Scanner in3 = new Scanner(System.in);
        double p = in3.nextDouble();
        double val = PaymentCalculator.calculateMonthsUntilPaidOff(b,i,p);
        System.out.printf("It will take you %d months to pay off this card.",Math.round(val)+1);

    }
}
class PaymentCalculator
{
    public static double calculateMonthsUntilPaidOff( double b,double i,double p)
    {
        double n;
        n = ((-(1.0/30.0)) * (Math.log(1.0 + b/p * (1.0 - (Math.pow((1.0+i),30.0)))) / (Math.log(1.0 + i))));

        return n;
    }
}
