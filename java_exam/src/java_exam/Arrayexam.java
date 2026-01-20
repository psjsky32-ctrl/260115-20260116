package java_exam;

public class Arrayexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scoreArray = new int[7];//배열 만드는 법 1.타입뒤에 []붙이기 2.변수명 뒤에다 [] 붙이기
		
		/* 서로다른 숫자 7개가 배열에 할당될 때 까지 반복
		 * 배열의 값을 출력 
		 * i == j 
		 * 
		 * */
		
		
		for(int i = 0; i<scoreArray.length; i++){
			scoreArray[i] = (int)(Math.random() * 45 + 1);
			for(int j = 0; j < i; j ++) {
				while(scoreArray[i] == scoreArray[j]) {
					--i;
				}
				
			}
		}
		
		for(int i = 0; i < scoreArray.length; i++) {
		
			
			System.out.println(scoreArray[i]);
		}
		//int score = 60;
		//System.out.println(score);//[I@7c30a502 [I <- 변수 타입 7c~ <-hashcode(변수의 값을 암호화 시킨값)  [ <-변수가 배열이다 I <- 배열을 제외한 타입(int) 
		//참조형변수
		//int scoreArray2[] = new int[7];
	}

}
