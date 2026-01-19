package exam;

public class Q9498 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 100;
		
		if(score >= 90) {
			System.out.println("A");
		}else if (score >= 80 && score < 89) {
			System.out.println("B");
		}else if(score >=70 && score <= 79) {
			System.out.println("C");
		}else if(score >= 60 && score <= 69) {
			System.out.println("D");
		}else if(score < 69) {
			System.out.println("F");
		}
	}

}
