package com.ktdsuniversity.edu.homework.inheritance;

public class Mart extends Store {
	public Mart() {
		super("일반마트");
		}

	public void sell(Customer customer, int price, int receivedMoney) {
		int change = changeMoney(receivedMoney, price);
		customer.setMoney(customer.getMoney() + change);
		System.out.println(getStoreName() + "판매 완료. 거스름돈: " + change);
	}
}

