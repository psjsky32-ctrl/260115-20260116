package com.ktdsuniversity.edu.q;

public class Q10807 {
	
	public static void main(String[] args) {
		
		int[] numArray = {1, 10, 4, 9, 2, 3, 8, 5, 7, 6};
		int bassNum = 5;
		
		for(int i = 0; i < numArray.length; i++) {
			
			if(numArray[i] < bassNum) {
				System.out.print(numArray[i] + " ");
			}
		}
		
		
	}
	
}
