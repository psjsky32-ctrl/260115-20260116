package exam;

public class ArithmaticQuiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int processtime = 145;
		int minutes = 0;
		int seconds = 0;
		
		minutes = processtime / 60;
		seconds = processtime % 60;
		System.out.println(processtime + "초는" + minutes + "분" + seconds +"초입니다.");
	}
	
}
