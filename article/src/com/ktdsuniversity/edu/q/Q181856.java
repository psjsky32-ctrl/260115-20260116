package com.ktdsuniversity.edu.q;

public class Q181856 {
	
	public static void compare(int[] arr1, int[] arr2) {
		if(arr1.length > arr2.length) {
			System.out.println(1);
		}else if(arr1.length < arr2.length){
			System.out.println(-1);
		}else {
			System.out.println(0);
		}
		
		
	}
	
	public static void main(String[] args) {
		compare(new int[] {1,2,3,4,5}, new int[] {2,2,3,4,5});
		compare(new int[] {1,2,3}, new int[] {2,2,3,4,5});
		compare(new int[] {1,2,3,4,5}, new int[] {3,4,5});
	}
}
