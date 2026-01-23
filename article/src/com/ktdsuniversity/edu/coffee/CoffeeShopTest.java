package com.ktdsuniversity.edu.coffee;

public class CoffeeShopTest {
	
	public static void main(String[] args) {
		
		Coffee hotCoffee = new Coffee("뜨아", 4500, 100);
		Coffee iceCoffee = new Coffee("아바라", 4000, 60);		
		
		
		CoffeeShop starbuck = new CoffeeShop(hotCoffee, iceCoffee);
		
		int price = starbuck.orderCoffee(1, 3);
		System.out.println(price);
		
		price = starbuck.orderCoffee(2, 6);
		System.out.println(price);
				
		price = starbuck.orderCoffee(0, 10);
		System.out.println(price);
		
	/*
	 * private hot.name
	 * 
	 * getName 객체에 저장된 값을 불러올 때
	 * setName 객체에 값을 할당 할 때
	 * 
	 */
	}
}
