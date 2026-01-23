package com.ktdsuniversity.edu.vendingmachine.item;

public class Drink {
	
	private String name;
	private int price;
	private int stock;
	
	public Drink(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getStock() {
		return stock;
	}
	

}
