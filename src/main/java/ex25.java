import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Derek Santana
 */

/*
The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.
 */

public class ex25
{
    public static void main( String[] args )
    {
        String p1 = "hi";
        String strength="";
        while(!(passwordValidator(p1) == 4))
        {
            System.out.println("Password: ");
            Scanner in1 = new Scanner(System.in);
            p1 = in1.nextLine();
            if(passwordValidator(p1)==4)
            {
                strength="very strong";
            }
            else if(passwordValidator(p1)==3)
            {
                strength="strong";
            }
            else if(passwordValidator(p1)==2)
            {
                strength="weak";
            }
            else if(passwordValidator(p1)== 1)
            {
                strength="very weak";
            }
            System.out.printf("The password '%s' is a %s password.", p1,strength);
        }
    }

    public static int passwordValidator(String pass)
    {
        int n=0;
        String al = "abcdefghijklmnopqrstuvwxyz";
        String sp = "~!@#$%^&*()_-";
        if(pass.length()<8)
        {
            if(pass.contains("1") || pass.contains("2") || pass.contains("3") || pass.contains("4") || pass.contains("5")
                    ||pass.contains("6") || pass.contains("7") || pass.contains("8") || pass.contains("9"))
            {
                n=1;
            }
            else
            {
                n=2;
            }
        }
        else
        {
            for ( int i = 0; i <=9;i++)
            {
                String s = Integer.toString(i);
                if(pass.contains(s))
                {
                    n=2;
                }
                else
                {
                    n = 2;
                }
            }
            for (int i = 0; i < pass.length();i++)
            {
                for(int j = 0; j <26;j++)
                {
                    if(pass.charAt(i)==(al.charAt(j)))
                    {
                        n=3;
                        break;
                    }
                }
            }
            for (int i = 0; i < pass.length();i++)
            {
                for(int j = 0; j <13;j++)
                {
                    if(pass.charAt(i)==(sp.charAt(j)))
                    {
                        n=4;
                        break;
                    }
                }
            }

        }
        return n;
    }
}
