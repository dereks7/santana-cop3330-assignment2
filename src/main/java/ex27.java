import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Derek Santana
 */

/*
Enter the first name: J
Enter the last name:
Enter the ZIP code: ABCDE
Enter the employee ID: A12-1234
The first name must be at least 2 characters long.
The last name must be at least 2 characters long.
The last name must be filled in.
The employee ID must be in the format of AA-1234.
The zipcode must be a 5 digit number.

Enter the first name: John
Enter the last name: Johnson
Enter the ZIP code: 55555
Enter the employee ID: TK-4321
There were no errors found.
 */

public class ex27
{
    public static void main( String[] args )
    {
        System.out.println("Enter the first name: ");
        Scanner in1 = new Scanner(System.in);
        String fn = in1.nextLine();
        System.out.println("Enter the last name:");
        Scanner in2 = new Scanner(System.in);
        String ln = in2.nextLine();
        System.out.println("Enter the ZIP code:");
        Scanner in3 = new Scanner(System.in);
        String z = in3.nextLine();
        System.out.println("Enter the employee ID: ");
        Scanner in4 = new Scanner(System.in);
        String eid = in4.nextLine();
        int n = validateInput(fn,ln,z,eid);
        if ( n ==4)
        {
            System.out.println("There were no errors found.");
        }

    }

    public static int fname(String fn)
    {
        if(fn.length()<2)
        {
            return -1;
        }
        if(fn.length()==0 || fn.equals(" "))
        {
            return 0;
        }
        else
            return 1;
    }
    public static int lname(String ln)
    {
        if(ln.length()==0 || ln.equals(" "))
        {
            return 0;
        }
        if(ln.length()<2)
        {
            return -1;
        }
        else
            return 1;
    }
    public static int zip(String z)
    {
        String al = "abcdefghijklmnopqrstuvwxyz";
        for (int i=0; i < z.length();i++)
        {
            for(int j=0; j < 26;j++)
            {
                if(z.charAt(i)==(al.charAt(j)))
                {
                    return -1;
                }
            }
        }

        if(z.length()==5)
        {
            int n=0;
            for ( int i = 0; i <=9;i++)
            {
                String s = Integer.toString(i);
                if(z.contains(s))
                {
                    n = 1;
                }
                else
                {
                    n = -1;
                }
            }
            return n;
        }
        else return -1;
    }
    public static int id(String eid)
    {
        if (!eid.contains("AA-"))
        {
            return -1;
        }
        else
            return 1;
    }
    public static int validateInput(String fn, String ln, String z, String eid)
    {
        int n = 0;
        if(fname(fn)==0)
        {
            System.out.println("The first name must be at least 2 characters long.");
            System.out.println("The first name must be filled in.");
        }

        if(fname(fn)==-1)
        {
            System.out.println("The first name must be at least 2 characters long.");
        }

        else if(fname(fn)==1)
        {
            n++;
        }



        if(lname(ln)==0)
        {
            System.out.println("The last name must be at least 2 characters long.");
            System.out.println("The last name must be filled in.");
        }
        if(lname(ln)==-1)
        {
            System.out.println("The last name must be at least 2 characters long.");
        }
        else if(lname(ln)==1)
        {
            n++;
        }

        if(id(eid)==-1)
        {
            System.out.println("The employee ID must be in the format of AA-1234.");
        }
        else if(id(eid)==1)
        {
            n++;
        }

        if(zip(z)==-1)
        {
            System.out.println("The zipcode must be a 5 digit number.");
        }
        else if(zip(z)==1)
        {
            n++;
        }

        return n;
    }
}
