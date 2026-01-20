package exam;

public class Ifexam2 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 1_000_000;
		
		int father = 40;
		int mother = 36;
		int daughter =11;
		
		int adultOneWayFlightFare = 300_000;
		int kidOneWayFlightFare = 120_000;
		
		int totalMoney =  (adultOneWayFlightFare * 2) +kidOneWayFlightFare;
		
		//int flightFare =0;
		//flightFare += getFlightFare(fater);
		//flightFare += getFlightFare(mother);
		//flightFare += getFlightFare(daughter);
		if(father >= 19) {
			System.out.println("성인이고 가격은 300_000입니다.");
		}
		else if(father < 19) {
			System.out.println("성인이 아니고 가격은 120_000.");			
		}
		
		if(mother >= 19) {
			System.out.println("성인이고 가격은 300_000입니다.");
		}
		else if(mother < 19) {
			System.out.println("성인이 아니고 가격은 120_000.");			
		}
		
		if(daughter >= 19) {
			System.out.println("딸은 성인이고 가격은 300_000입니다.");
		}
		else if(daughter < 19) {
			System.out.println("딸은 성인이 아니고 가격은 120_000.");			
		}
		System.out.println("소지금액은" + money + "입니다.");
		System.out.println("총 가격은" + totalMoney + "입니다.");
		
		if(money >= totalMoney ) {
			System.out.println("여행가자!");
		}else if(money < totalMoney) {
			System.out.println("다음에 가자");
		}
	}

}
