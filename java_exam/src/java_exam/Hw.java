package java_exam;

public class Hw {

	public static String computeGrade(int subjA, int subjB, int subjC, int subjD, int subjE) {
		
		int amount = subjA + subjB +subjC + subjD + subjE;
		double average = calcAverage(amount, 5);
		;
		String grade = calcgrade(average);
		return grade;
		
	}
	public static double calcAverage(int amount, int subjectCount) {
		double result = 0;
		if(subjectCount != 0) {
			result = (double) amount / subjectCount;
		}
		return result;
	}
	
	public static String calcgrade(double average) {
		String grade = "F";
		if(average >= 90) {
			grade = "A";
		}else if(average >= 80) {
			grade = "B";
		}else if(average >= 70) {
			grade = "C";
		}else if(average >= 60) {
			grade = "D";
		}
		return grade;
	}
	
	
	public static void main(String[] arg) {
		String grade = computeGrade(100, 95, 80 ,85, 70);
		System.out.println("최종 학점: " + grade);
	}
}
