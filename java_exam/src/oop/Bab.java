package oop;
/**
 * <pre>
 * 
 * 식당
 * 손님은 피자를 시킨다
 * 손님은 피자 토핑을 원하는대로 고른다
 * satisfaction 5보다 낮으면
 * 환불을 요청한다
 * 하지만 주방장은 환불을 반드시 거절한다
 * </pre>
 */
public class Bab {
	
	int countPizza;
	String countPizzaTopping;
	boolean requestRefund;
	int countSatisfaction;
	
	public void orderPizza(int count){
		countPizza = count;
		System.out.println("피자: " + count + "판을 주문 했습니다");
	}
	
	public void chosePizzaTopping(String Topping) {
		countPizzaTopping = Topping;
		System.out.println("피자 토핑: " + Topping + "을 골랐습니다");
	}
	
	public void isSatisfaction(int countSatisfaction) {
		if(countSatisfaction < 5) {
			requestRefund = true;
			System.out.println("만족도가 낮아 환불을 요청합니다.");
		}else {
			requestRefund = false;
		}
	}
	
	public void refundMoney() {
		if(requestRefund) {
			System.out.println("피자를 환불 해주세요.");
			System.out.println("환불은 불가능 합니다.");
		}else {
			System.out.println("감사합니다.");
		}
	}
	
}
