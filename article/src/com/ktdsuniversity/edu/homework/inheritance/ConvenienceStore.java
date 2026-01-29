package com.ktdsuniversity.edu.homework.inheritance;

public class ConvenienceStore extends Store {
	public ConvenienceStore() {
		super("편의점");
	}

	public void sell(Customer customer, int price, int receivedMoney) {
	int finalPrice = price;
	
		if (customer.getPoint() >= 100) {
			finalPrice = Math.max(0, price - (int)customer.getPoint());
			customer.setPoint(0); 
		}
			
		int change = changeMoney(receivedMoney, finalPrice);
		customer.setMoney(customer.getMoney() + change);
			
		customer.setPoint(customer.getPoint() + (price * 0.001));
		System.out.println(getStoreName() + " 최종결제: " + finalPrice + ", 잔여포인트: " + customer.getPoint());
		}
}

