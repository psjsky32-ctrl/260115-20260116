package com.ktdsuniversity.edu.exceptions;

public class RandomExtractNumbers {

	private String[] numbers;

	public RandomExtractNumbers() {
		this.numbers = new String[100];

		int index = 0;
		for (int i = 0; i < 10; i++) {
			// 0~99
			index = (int) (Math.random() * this.numbers.length);
			this.numbers[index] = (int) (Math.random() * 1_000_000) + "";
		}
		for (int i = 0; i < 10; i++) {
			// 0~99
			index = (int) (Math.random() * this.numbers.length);
			this.numbers[index] = (char) ((int) (Math.random() * 26) + 97) + "";
		}

	}

	public void printNumber2(int index) {
		if (index >= 0 && index < this.numbers.length) {
			String value = this.numbers[index];
			if (value != null && value.matches("^[0-9]+$")) {
				int intValue = Integer.parseInt(value);
				System.out.println(intValue);
				return;
			}
		}
	}

	public void printNumber(int index) {
		if (index < 0 || index >= this.numbers.length) {
			System.out.println("index: " + 0 + "out of range. Result: " + 0);
			return;
		}
		String value = this.numbers[index];
		if (value == null) {
			System.out.println("index: " + index + "Null.Result: " + 0);
			return;
		}

		if (value.matches("^[0-9]+$")) {
			int intValue = Integer.parseInt(value);
			System.out.println(intValue);
		} else {
			System.out.println("index: " + index + " - " + value + "is wrong number forma. Result" + 0);
		}

	}

	//
//		if (index >= 0 || index < this.numbers.length && this.numbers[index] != null) {
//
//			if (this.numbers[index].matches("^[0-9]+$")) {
//				System.out.println(this.numbers[index]);
//			} else {
//				System.out.println(0);
//			}
//
//		숫자가 아닌 경우 0을 출력한다
//		this.numbers의 index에 존재하는 값을 출력한다
//		값이 숫자인 경우 그대로 출력하고

	public static void main(String[] args) {

		RandomExtractNumbers ren = new RandomExtractNumbers();
		int index = 0;
		for (int i = 0; i < 50; i++) {
			index = (int) (Math.random() * 200);
			ren.printNumber(index);
		}

	}

}
