package oop;

public class BabTest {
	
	public static void main(String[] args) {
	
		Bab order = new Bab();
		System.out.println(order);
		
		order.orderPizza(3);
		order.chosePizzaTopping(" 치즈 5번");
		order.isSatisfaction(3);
		order.refundMoney();
		
	}
}
