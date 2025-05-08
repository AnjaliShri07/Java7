package com.programs.hackerRank;

import java.util.Scanner;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a;
            for(int num=0; num<n; num++){
            sum += Math.pow(2, num)*b;
            System.out.printf("%s ",sum);
            }
            System.out.println();
        }
        in.close();
    }
}

/*input-
2
0 2 10
5 3 5

output:-
a=0,b=2,n=10
0+ 1.2 +2.2+ 4.2+....10 times
*/