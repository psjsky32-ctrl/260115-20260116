package exam;

public class Q25314 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 8;
		
		String type = "";
		
		while(n >= 4) {
			type += "long ";
			n -= 4;
		}
		
		type += "int";
		
		System.out.println(type);
		
		}
	}


