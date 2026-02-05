package com.ktdsuniversity.edu.fp.basic.calc;

public class Test {

	public static void main(String[] args) {
		Calculater calc = new Calculater();

		// num1, num2를 더해 반환한다.
		int result = calc.calc2(1, 2, (num1, num2) -> num1 + num2);
		System.out.println(result);

		// num1 - num2
		result = calc.calc2(1, 2, (num1, num2) -> num1 - num2);
		System.out.println(result);
		// num1 * num2
		result = calc.calc2(3, 4, (num1, num2) -> num1 * num2);
		System.out.println(result);

		// num1 / num2
		result = calc.calc2(4, 4, (num1, num2) -> num1 / num2);
		System.out.println(result);

		// num1 % num2
		result = calc.calc2(12, 4 , (num1, num2) -> num1 % num2);
		System.out.println(result);
		//num1의 num2를 제곱한 수
		result = calc.calc2(123, 4 , (num1, num2) -> (int)Math.pow(num1, num2));
		System.out.println(result);
		//num1, num2 중 큰수
		result = calc.calc2(12, 4, (num1, num2) -> Math.max(num1, num2));
		System.out.println(result);
		//num1, num2 중 작은수
		result = calc.calc2(1234, 1233, (num1, num2) -> Math.min(num1, num2));
		System.out.println(result);
		
		//num1이 num2의 배수라면 0을 반환, 아니라면 1을반환	
		result = calc.calc2(132, 12, (num1, num2) -> {
			if(num1 % num2 == 0) {
				return 0;
			}else {
				return 1;
			}
		});
		System.out.println(result);
	}
}
