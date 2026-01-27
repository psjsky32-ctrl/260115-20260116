package com.ktdsuniversity.edu.q;

import java.util.Arrays;

public class Q18185 {
	
	public static void main(String[] args) {
		int[] numList = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
		/**
		 * 1. {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
		 * 2. {4, 12, 15, 46, 38, 1, 14, 56, 32, 10};
		 * 3. {4, 1, 15, 46, 38, 12, 14, 56, 32, 10};
		 * 4. {4, 1, 15, 46, 38, 10, 14, 56, 32, 12};
		 * 5. {1, 4, 15, 46, 38, 10, 14, 56, 32, 12};
		 * 6. {1, 4, 14, 46, 38, 10, 15, 56, 32, 12};
		 * 7. {1, 4, 10, 46, 38, 14, 15, 56, 32, 12};
		 * 8. {1, 4, 10, 38, 14, 32, 15, 56, 46, 12};
		 * 9. {1, 4, 10, 38, 14, 32, 15, 56, 46, 12};
		 * 10.{1, 4, 10, 14, 38, 32, 15, 56, 46, 12};
		 * 11.{1, 4, 10, 14, 32, 38, 15, 56, 46, 12};
		 * 12.{1, 4, 10, 14, 32, 15, 38, 56, 46, 12};
		 */
		
		
		int temp = 0;
		for(int i = 0; i < numList.length; i++) {
			for(int j = i + 1; j<numList.length; j++) {
				//System.out.println(numList[i] + "와 비교중인 숫자는" + numList[j]);
				if(numList[i] > numList[j]) {
					//numList[j]와 numList[i]의 자리를 바꾼다.
					temp = numList[i];
					numList[i] = numList[j];
					numList[j] = temp;
				}
				
			}
			//System.out.println();
		}
		//[1, 4, 10, 12, 14, 15, 32, 38, 46, 56]
		//System.out.println(Arrays.toString(numList));
		int[] result = new int[numList.length - 5];
		for(int i = 5; i < numList.length; i++) {
			result[i - 5] = numList[i];
		}
		
		System.out.println(Arrays.toString(result));
	}
}
