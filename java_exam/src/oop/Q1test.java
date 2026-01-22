package oop;

public class Q1test {
	
	public static void main(String[] args) {
		
		Q1 score = new Q1(80, 78, 55, 45);

		
		
		
		int sum =score.getSumAllScores();
		double average =score.getAverage();
		double courseCredit = score.getCourseCredit();
		String ABCED = score.getABCED();
		
		System.out.println(sum);
		System.out.println("평균 : " + average);
		System.out.println("학점 : " + courseCredit);
		System.out.println("등급 : " + ABCED);
	}
	
}
