package com.ktdsuniversity.edu.homework.inheritance;

public class DepartmentStore extends Store {
	public DepartmentStore() {
		super("백화점");
		}

	public void sell(Customer customer, int price, int receivedMoney, int usePoint) {
		double discountRate = 0;
		double saveRate = 0.005;
			
		if (customer.getGrade().equals("VIP")) {
			discountRate = 0.03;
			saveRate = 0;
		} else if (customer.getGrade().equals("VVIP")) {
			discountRate = 0.1;
			saveRate = 0.03;
		}
			
		int finalPrice = (int)(price * (1 - discountRate));
		
		if (customer.getPoint() >= 10000 && usePoint > 0) {
			finalPrice -= usePoint;
			customer.setPoint(customer.getPoint() - usePoint);
		}
		
		int change = changeMoney(receivedMoney, finalPrice);
		customer.setMoney(customer.getMoney() + change);
		
		customer.setPoint(customer.getPoint() + (price * saveRate));
		System.out.println(getStoreName() + "등급: " + customer.getGrade() + ", 거스름돈: " + change);
	}
}
