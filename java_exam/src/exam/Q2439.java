package exam;

public class Q2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int j = 1;
		while(i < 6) {
			
			j = 1;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println("");
			i++;
		}
	}

}
