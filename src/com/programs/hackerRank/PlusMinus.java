package com.programs.hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    	
        double size=arr.size();
        double positive=0;
        double negative=0;
        double zero=0;
    for (Integer num : arr) {
        if(num > 0)
            positive++;
        else if(num < 0)
            negative++;
        else if(num == 0)
            zero++;
        
    }
    double a = positive/size;
    double b = negative/size;
    double c= zero/size;
    System.out.printf("%.6f",a);
    System.out.println();
    System.out.printf("%.6f",b);
    System.out.println();
    System.out.printf("%.6f",c);
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
