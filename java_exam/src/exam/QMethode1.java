package exam;

public class QMethode1 {
	
	public static void printSum(int number) {
		int sum = 0;
		for(int i = 0; i <= number; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public static void printPrime(int number) {
		for(int i = 2; i< 20; i++ ) {
			int j =2;			
			for(j = 2; j * j < i && i % j != 0; j++) {
				
			}
			
			if(j * j > i) {
				System.out.
				println(i);
			}
		}
	}
	
	public static void printMax(int number1, int number2) {
		if(number1 > number2) {
			System.out.println(number1);
		}else
		{
			System.out.println(number2);
		}
		
	}
	
	public static void printAge(int number) {
		if(number >= 19) {
			System.out.println("성인");
		}else {
			System.out.println("미성년자");
		}
		
	}
	
	public static String getFizzBuzz(int number) {
		
		String getFizzBuzzResult = "";
		
		if(number % 3 == 0 && number % 5 ==0) {
			getFizzBuzzResult = "FizzBuzz";
		}else if(number % 3 == 0) {
			getFizzBuzzResult = "Fizz";
		}else if(number % 5 == 0) {
			getFizzBuzzResult = "Buzz";
		}else {
			getFizzBuzzResult = number + "";
		}//숫자를 문자열로 넣을때는 "";
		return getFizzBuzzResult;
	}
	
	//public static 
	
	
	
	public static String getEvenOdd(int number1, int number2) {
		
		int getEvenOddResult = number1 * number2;
		String a;
		if(getEvenOddResult %2 == 0) {
			a ="짝수"; 
		}else {
			a ="홀수";
		}
		return a;
		
	}
	
	public static int getSumofFive(int number1, int number2, int number3, int number4, int number5) {
		
		int getSumofFiveResult = number1 + number2 + number3 + number4 +number5;
		
		return getSumofFiveResult;
	}
	
	public static double getAverage(int number1, int number2) {
		
		double getAverageResult = (double)(number1 + number2) / 2;
		double getAverageResult2 = getAverageResult * 100;
		getAverageResult2 = Math.round(getAverageResult2);
		double getAverageResult3 = getAverageResult2 / 100;
		
		
		return getAverageResult;
		
	}
	
	public static String getGrade(int number) {
		String getGradeResult = "";
		
		if(number >= 95) {
			getGradeResult ="A";
		}else if(number >= 85 && number < 95) {
			getGradeResult ="B";
		}else if(number >= 75 && number < 85) {
			getGradeResult ="C";
		}else if(number >= 65 && number < 75) {
			getGradeResult ="D";
		}else {
			getGradeResult = "F";
		}
		
		return getGradeResult;
	}

	public static void main(String[] arg) {
		printSum(10);
		printPrime(20);
		printMax(10,20);
		printAge(15);
		
		String a = getFizzBuzz(5);
		System.out.println(a);
		
		String b = getEvenOdd(3, 5);
		System.out.println(b);
		
		int resultAdd = getSumofFive(1, 2, 3, 4, 5);
		System.out.println(resultAdd);
		
		double c = getAverage(100, 60);
		System.out.println(c);
		
		String d = getGrade(60);
		System.out.println(d);
	}
}
