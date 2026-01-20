package java_exam;

public class MethodExam {
	
	public static int computeAdd(int number1, int number2) {
		int computeResult = number1 + number2;
		//System.out.println(computeResult);
		return computeResult;
	}
	
	
	
	public static void printName(String name) {
		System.out.println("제 이름은" +name+ "입니다.");	
		
		if(name.length() < 3) {
			//return; void에서의 return은 이 메소드를 종료시켜라 해서 아래가 안나온다.
		}
		
		System.out.println("제 이름은" +name.length()+ "글자 입니다");
	
	}
	//프로그램이 실행될 수 있는 메소드를 생성한다.
	public static void main( String[] args) {
	
		int resultAdd = computeAdd(3, 4);
		System.out.println(resultAdd);
		
		//System.out.println("제 이름은 박승재 입니다.");
		//System.out.println("제 이름은 땡땡땡 입니다.");
		//System.out.println("제 이름은 000 입니다.");
		printName("박승재");
		printName("땡땡떙");
		printName("000");
		
	}
	
}
