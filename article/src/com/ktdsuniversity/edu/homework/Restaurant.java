package com.ktdsuniversity.edu.homework;

import com.ktdsuniversity.edu.homework.custom.*;

/**
 * A 식당의 사장은 배가 부른 손님과 과하게 취한 손님에게는 주문을 받지 않기로 유명합니다. 사장님은 배부름이 50 보다 크면 손님을
 * 받지않는다 사장님은 알콜 비율 60 보다 높으면 손님을 받지 않는다. A 식당의 사장은 손님의 배부름 정도와 취함 정도로 주문을 받을지
 * 판단합니다 B 식당 사장님은 배부름이 80보다 크면 손님을 받지 않는다 B 식당 사장님은 알콜 비율 80보다 크면 손님을 받지 않는다
 */
public class Restaurant {
	private int fullLimit;
	private int alcoholLimit;
	
	public Restaurant(int fullLimit, int alcoholLimit) {
		this.fullLimit = fullLimit;
		this.alcoholLimit = alcoholLimit;
	}
	
	public boolean canAccept(Customer customer) {
		
		if (customer.getCustomerFull() > this.fullLimit) {
			throw new FullException("이미 배가 너무 부른 상태입니다!");
		}
		
		if (customer.getAlcoholFull() > this.alcoholLimit) {
			throw new DrunkenException("너무 많이 취하셨습니다. 귀가하세요.");
		}
				
		return true;
	}

}