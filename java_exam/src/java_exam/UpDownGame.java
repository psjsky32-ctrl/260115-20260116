package java_exam;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		//int inputNumber = 0;//사용자가 입력한 숫자가 여기에 들어온다.
		
		//사용자가 입력하는 값이 100이하 일 동안만 {...}을 실행해라.
		//while(inputNumber <=100) {
			
			//사용자로 부터 정수를 입력받는다.
			//inputNumber = keyboard.nextInt();
			//System.out.println(inputNumber);
		
		double randomNumber = Math.random();
		int answer = (int)(randomNumber * 100);
		int value = 0;
		
		while(true) {
			System.out.print("숫자를 입력하세요. ");
			value = keyboard.nextInt();
			if(answer == value) {
				System.out.println("정답입니다!.");
				break;
			}
			else if(answer >value) {
				System.out.println("UP");
			}
			else if(answer <value) {
				System.out.println("DOWN");
			}
		}
		
		
		
		//System.out.println("Application을 종료합니다.");
	}

}
