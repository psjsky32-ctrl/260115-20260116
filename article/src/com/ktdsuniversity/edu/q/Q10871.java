package com.ktdsuniversity.edu.q;

public class Q10871 {
	
	public static void main(String[] args) {
		int[] numArray = {1, 4, 1, 2, 4, 2, 4, 2, 3, 4, 4};
		int findnum = 2;
		
		int count = 0;
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i] == findnum) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
}
