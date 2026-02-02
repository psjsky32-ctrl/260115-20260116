package com.ktdsuniversity.edu.generics;

import java.util.Arrays;

public class ScoreListTest {

	public static void main(String[] args) {

		ScoreList<Integer, Integer> list = new ScoreList<>();
		list.add(1);// 0
		list.add(2);// 1
		list.add(3);// 2
		list.add(4);// 3
		list.add(5);// 4
		list.add(6);// 5
		list.add(7);// 6

		Reducer<Integer, Integer> listReducer = new Reducer<>() {
			@Override
			public Integer reduce(Integer input, Integer output) {

				return input + output;
			}
		};

		int sum = list.sum(listReducer, 0);
		System.out.println(sum);

		int value = list.get(3);
		System.out.println(value);

		ScoreList<String, String> strList = new ScoreList<>();
		strList.add("qweasd");
		strList.add("xzcvas");

		
		
		String strValue = strList.get(1);
		System.out.println(strValue);

		ScoreList<String[], String> arrayList = new ScoreList<>();
		arrayList.add(new String[] { "ㅁㄴㅇㅁㄴㅇ" });
		arrayList.add(new String[] { "asdwq" });

		String[] arrayValue = arrayList.get(1);
		System.out.println(Arrays.toString(arrayValue));
		
		Reducer<String[], String> arrayReducer = new Reducer<>() {

			@Override
			public String reduce(String[] input, String output) {
				for(int i = 0; i < input.length; i ++) {
					output += input[i];
				}
				return output;
			}};
			
			String arrayResult = arrayList.sum(arrayReducer, "");
			System.out.println(arrayResult);
	}
}
