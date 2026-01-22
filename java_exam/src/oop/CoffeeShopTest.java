package oop;

public class CoffeeShopTest {
	
	public static void main(String[] args) {
		
		Coffee hotCoffee = new Coffee("뜨아", 4500);
		Coffee iceCoffee = new Coffee("아바라", 4000);		
		Coffee tea = new Coffee("캐모마일 티", 5000);
		
		
		
		CoffeeShopArray starbuck = new CoffeeShopArray(hotCoffee, iceCoffee, tea);
		
		int price = starbuck.orderCoffee(1, 3);
		System.out.println(price);
		
		price = starbuck.orderCoffee(2, 6);
		System.out.println(price);
		
		price = starbuck.orderCoffee(3, 5);
		System.out.println(price);
		
		price = starbuck.orderCoffee(0, 10);
		System.out.println(price);
		
		
	}
}
