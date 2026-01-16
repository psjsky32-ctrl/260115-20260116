package java_exam;

public class IfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomNumber = (int)(Math.random() * 100);
		System.out.println(randomNumber);
		
		//randomnumber가 == 16 : " 10범위의 숫자가 나왔습니다."
		//randomnumber가 == 36 : " 30범위의 숫자가 나왔습니다."
		//randomnumber가 == 66 : " 60범위의 숫자가 나왔습니다."
		//randomnumber가 == 6 : " 0범위의 숫자가 나왔습니다."
		//randomnumber가 == 27 : " 20범위의 숫자가 나왔습니다."
		//randomnumber가 == 55 : " 50범위의 숫자가 나왔습니다."
		
		//int radix = randomNumber / 10 * 10;
		//System.out.println(radix + "법위의 숫자가 나왔습니다.");
		
		//if 로 풀어보자
		
		if(randomNumber >= 10 && randomNumber <20) {
			System.out.println("10범위의 숫자가 나왓습니다. - if");
		}
		else if(randomNumber >=20 && randomNumber < 30) {
			System.out.println("20범위의 숫자가 나왓습니다. - if");
		}
		else if(randomNumber >=30 && randomNumber < 40) {
			System.out.println("30범위의 숫자가 나왓습니다. - if");
		}
		else {
			System.out.println("범위를 벗어났습니다.");
		}
		
		randomNumber = 78;
		
		if(randomNumber >= 90) {
			System.out.println("90 범위의 숫자입니다.");
		}
		else if(randomNumber >=80) {
			System.out.println("80 범위의 숫자입니다.");
		}
		else if(randomNumber >=70) {
			System.out.println("70 범위의 숫자입니다.");
		}
		else if(randomNumber >=60) {
			System.out.println("60 범위의 숫자입니다.");
		}
		
	}
}