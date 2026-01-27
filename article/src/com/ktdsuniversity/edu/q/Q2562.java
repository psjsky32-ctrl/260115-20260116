package com.ktdsuniversity.edu.q;

//import java.util.Arrays;

//9개의 서로 다른 자연수가 주어질 때, 이들 중 
//최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
//예를 들어, 서로 다른 9개의 자연수
//3, 29, 38, 12, 57, 74, 40, 85, 61
//이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
public class Q2562 {
	
	public static void main(String[] args) {
		
//		int[] numList = {3, 29, 38, 12, 57, 74, 40, 85, 61};
//		
//		
//		int temp = 0;
//		for(int i = 0; i < numList.length; i++) {
//			for(int j = i + 1; j < numList.length; j++) {
//				if(numList[i] > numList[j]) {
//					temp = numList[i];
//					numList[i] = numList[j];
//					numList[j] = temp;
//				}
//			}
//		//	System.out.println();
//		}
//		
//		System.out.println(Arrays.toString(numList));
//		System.out.println("최댓값: " + numList[numList.length - 1]);
//		System.out.println(numList.length - 1 + "번째 입니다");
//		
		int[] num = {3, 29, 38, 12, 57, 74, 40, 85, 61};
		int max = Integer.MIN_VALUE;
		int index = 0;
		
		for(int i = 0; i < num.length; i++) {
			if(max < num[i]) {
				max = num[i];
				index = i;
			}
			
		}
		System.out.println(max);
		System.out.println(index + 1);
	}
}
