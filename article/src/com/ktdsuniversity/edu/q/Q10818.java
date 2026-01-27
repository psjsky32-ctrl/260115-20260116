package com.ktdsuniversity.edu.q;


public class Q10818 {
	
	public static void main(String[] args) {
		
		int[] numList = {20, 10, 35, 30, 7};	
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < numList.length; i++) {
			if(numList[i] < min) {
				min = numList[i];
			}
			
			if(numList[i] > max) {
				max = numList[i];
			}
		}
		
		System.out.println(min + " " + max);
	}
}