package com.ktdsuniversity.edu.q;

//import java.util.Arrays;

//정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가
//장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution
//함수를 완성해주세요
public class Q181853 {
	public static void main(String[] args) {
		
		int[] numList = {12, 5, 16, 24, 65, 2};
		
		int temp = 0;
		for(int i = 0; i < numList.length; i++) {
			for (int j = i + 1; j < numList.length; j++) {
				if(numList[i] > numList[j]) {
					temp = numList[i];
					numList[i] = numList[j];
					numList[j] = temp;
				}
			}
		}
		
//		int[] result = new int[numList.length - 1];
//		for(int i = 1; i < numList.length; i++) {
//			result[i - 1] = numList[i];
//		}
		
//		System.out.println(Arrays.toString(result));
		for(int i = 0; i < 5; i++) {
			System.out.print(numList[i] + " ");
		}
		
	}
}
