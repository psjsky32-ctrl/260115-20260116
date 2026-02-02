package com.ktdsuniversity.edu.generics.collections.list;

import java.nio.channels.AsynchronousSocketChannel;
import java.util.ArrayList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("ㅁㄴㅇㄹ");
		names.add("ㅁㄴㅇㄹ");
		names.add("ㅁㄴㅇㄹ");
		names.add("ㅁㄴㅇㄹ");
		names.add("ㅁㄴㅇㄹ");

		System.out.println(names);
		String name = null;
		for (int i = 0; i < names.size(); i++) {
			name = names.get(i);
			System.out.println(name);
		}

		for (String name2 : names) {
			System.out.println(name2);
		}

		int[] arr = new int[] { 1, 2, 3 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// 단수하게 출력만 할거면
		for (int value : arr) {
			System.out.println(value);
		}

		String[] names2 = new String[] { "A", "B", "C" };
		for (int i = 0; i < names2.length; i++) {
			System.out.println((i + 1) + ". " + names2[i]);
		}

	}
}
