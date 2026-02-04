package com.ktdsuniversity.edu.constants;

public class Calculater {

	public static final int ADD = 1;
	public static final int SUB = 2;
	public static final int MUL = 3;
	public static final int DIV = 4;

	private int num1;
	private int num2;

	public Calculater(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int compute2(Operator operator) {
		if (operator == Operator.ADD) {
			return this.num1 + this.num2;
		} else if (operator == Operator.SUB) {
			return this.num1 - this.num2;
		} else if (operator == Operator.MUL) {
			return this.num1 * this.num2;
		} else if (operator == Operator.DIV) {
			return this.num1 / this.num2;
		}
		return 0;
	}
	
	
	public int compute(int operater) {
		if (operater == ADD) {
			return this.num1 + this.num2;
		} else if (operater == SUB) {
			return this.num1 - this.num2;
		} else if (operater == MUL) {
			return this.num1 * this.num2;
		} else if (operater == DIV) {
			return this.num1 / this.num2;
		}

		return 0;
	}

	
}
