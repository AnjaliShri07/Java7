package com.programs.hackerRank;

import java.util.HashMap;

public class MinimumSwap {

	static int minimumSwaps(int[] arr) {
        boolean[] flag = new boolean[arr.length+1];
        HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
        for(int i=1; i<flag.length; i++){
            map.put(i, arr[i-1]);
        }
        int count=0;
        for(int k=1; k<=map.size();k++){
            int next;
            if(flag[k] == false){
                flag[k] = true;
                if(k == map.get(k)){
                    continue;
                }else{
                    int b= map.get(k);
                    while(!flag[b]){
                        flag[b] = true;
                        next = map.get(b);
                        b=next;
                        ++count;
                    }
                }
                    
            }
        }
        return count;

    }
	
	public static void main(String[] args) {
		int arr[] = new int[] {1,3,5,2,4,6,7};
		System.out.println(minimumSwaps(arr));

	}

}
