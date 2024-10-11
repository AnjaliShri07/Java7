package com.java7.programs.String;

import java.util.Scanner;

/*Enter number of Names you want to enter:4
Enter all the Names:
Ram
Anjali
Jai
Zuned
Names in Sorted Order:Anjali,Jai,Ram,Zuned*/

public class AlphaOrder1
{
    public static void main(String[] args)
    {
        int n;
        String temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of Names you want to enter:");
        n = s.nextInt();
        
        String Names[] = new String[n];
        
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter all the Names:");
        for(int i = 0; i < n; i++)
        {
            Names[i] = s1.nextLine();
        }
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (Names[i].compareTo(Names[j])>0) 
                {
                    temp = Names[i];
                    Names[i] = Names[j];
                    Names[j] = temp;
                }
            }
        }
        System.out.print("Names in Sorted Order: ");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(Names[i] + ",");
        }
        System.out.print(Names[n - 1]);
    }
}