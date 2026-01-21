package oop;

public class Q1 {
	
	int java;
	int python;
	int cpp;
	int csharp;
	
	public int getSumAllScores() {
		int sumAllScores = java + python + cpp + csharp;
		return sumAllScores;
	}
	
	public double getAverage() {
		
		int average = (getSumAllScores() / 4) * 100;
		return average / 100;
	}
	
	public double getCourseCredit() {
		
		double coureseCredit = ((getAverage() - 55) / 10) * 100;
		return coureseCredit / 100;
	}
	
	public String getABCED() {
		double ABCED = getCourseCredit();
		if(ABCED >= 4.1) {
			return "A+";
		}else if(ABCED >= 3.6) {
			return "A";
		}else if(ABCED >= 3.1) {
			return "B+";
		}else if(ABCED >= 2.6) {
			return "B";
		}else if(ABCED >= 0.6) {
			return "C";
		}else {
			return "F";
		}
	}
	
}
