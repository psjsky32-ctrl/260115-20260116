package com.ktdsuniversity.edu.homework.inheritance;

public class Store {
	
	private String storeName;
	
	public Store(String storeName) {
		this.storeName = storeName;
	}
	
	public String getStoreName() {
		return storeName;
	}
	public int changeMoney(int receivedMoney, int finalPrice) {
		return receivedMoney - finalPrice;
	}	
}