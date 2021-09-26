import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Derek Santana
 */

/*
Enter a number: 100
Enter a number: 200
Enter a number: 1000
Enter a number: 300
Enter a number: done
Numbers: 100, 200, 1000, 300
The average is 400.0
The minimum is 100
The maximum is 1000
The standard deviation is 353.55
 */


public class ex36
{
    public static void main( String[] args )
    {
        int i=0;
        String n="hi";
        int[] r = new int[100];
        Scanner in1 = new Scanner(System.in);
        String[] nums = new String[100];
        System.out.printf("Enter a number: ");
        nums[i] = in1.nextLine();
        while(!n.equals(""))
        {
            while (!nums[i].contains("done"))
            {
                if (nums[i].contains("done"))
                {
                    n = "";
                    break;
                }
                else
                {
                    r[i] = Integer.parseInt(nums[i]);
                    i++;
                    System.out.printf("Enter a number: ");
                    nums[i] = in1.nextLine();
                }
            }
            n="";
        }
        System.out.printf("Numbers: ");

        for(int j=0;j<i;j++)
        {
            System.out.printf("%d",r[j]);
            if(j==i-1)
            {
                break;
            }
            else
            {
                System.out.printf(", ");
            }
        }

        double avg = average(r,i);
        int m = min(r,i);
        double std = std(r,i);
        int ma = max(r,i);

        System.out.printf("\nThe average is %.1f",avg);
        System.out.printf("\nThe minimum is %d",m);
        System.out.printf("\nThe maximum is %d",ma);
        System.out.printf("\nThe standard deviation is %.2f",std);
    }

    public static double average(int list[],int a)
    {
        int temp=0;
        for (int i=0;i<a;i++)
        {
            temp +=list[i];
        }
        int ans=temp/a;
        return ans;
    }

    public static int max(int list[],int a)
    {
        int max=list[0];
        for (int i=0;i<a;i++)
        {
            if(list[i]>max)
            {
                max = list[i];
            }
        }
        return max;
    }

    public static int min(int list[],int a)
    {
        int min=list[0];
        for (int i=0;i<a;i++)
        {
            if(list[i]<min)
            {
                min = list[i];
            }
        }
        return min;
    }

    public static double std(int list[],int a)
    {
        double sum = 0.0;
        double std = 0.0;
        for(int i=0;i<a;i++)
        {
            sum += list[i];
        }
        double mean = sum/a;
        for(int i=0;i<a;i++)
        {
            std += Math.pow(list[i] - mean, 2);
        }
        return Math.sqrt(std/a);
    }
}
