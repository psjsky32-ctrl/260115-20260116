package com.ktdsuniversity.edu.constants;

public class CalculaterTest {
	
	public static void main(String[] args) {
		Calculater calc = new Calculater(40, 20);
		System.out.println(calc.compute(Calculater.ADD));
		System.out.println(calc.compute(Calculater.SUB));
		System.out.println(calc.compute(Calculater.MUL));
		System.out.println(calc.compute(Calculater.DIV));
		
		System.out.println(calc.compute(11));
		System.out.println(calc.compute(22));
		System.out.println(calc.compute(33));
		System.out.println(calc.compute(44));
		
		System.out.println(calc.compute2(Operator.ADD));
		System.out.println(calc.compute2(Operator.SUB));
		System.out.println(calc.compute2(Operator.MUL));
		System.out.println(calc.compute2(Operator.DIV));
		
	}
}
