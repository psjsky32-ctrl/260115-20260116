package com.ktdsuniversity.edu.q;

import java.util.Scanner;

public class Q10809 {
	
	/*
	 * 알파벳을 입력받아 
	 * a ~ z 까지의 자리수에 해당하는 알파벳의 순서를 출력하고
	 * 없을 경우에는 -1출력
	 * b 0
	 *a 1
	 *e 2
	 *k 3
	 *j 4
	 *o 5
	 *o 6
	 *n 7
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int[] alphabet = new int[26];
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = -1;
		}
		
		for (int i = 0; i < s.length(); i++) {
		
			int idx = s.charAt(i) - 'a';
		
			if (alphabet[idx] == -1) {
				alphabet[idx] = i;
			}
		}
		
		for (int i = 0; i < 26; i++) {
			System.out.print(alphabet[i] + " ");
		}
		
		sc.close();
	}
}

