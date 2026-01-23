package com.ktdsuniversity.edu.coffee;
//get값을 클래스 외부로 보내줄려고할때//set외부에서 내부로 값을 할당할려할때
public class CoffeeShop {
	/**
	 * 커피숍에서 판매하는 뜨아
	 */
	Coffee hot;
	/**
	 * 아아
	 */
	Coffee ice;;
	
	public CoffeeShop(Coffee hot, Coffee ice) {
		this.hot = hot;
		this.ice = ice;
	}
	
	/**
	 * 커피를 판매한다.
	 * @param menu 메뉴들의 번호. 1:hot 2:ice
	 * @param quantity 주문수량
	 * @return 주문 가격
	 */
	public int orderCoffee(int menu, int quantity) {
		//주문한 음류가 quantity보다 많으면 판매를하지않는다.if(stock < quantitiy){System.out.println("재고가 없다.") return 0;}
		//판매한 음료는 재고에서 quantity 만큼 감소한다 stock -= quantity
		
		//int stock = this.hot.getStock();
		//stock = this.ice.getStock();
		
		
		if(menu == 1) {
			if(this.hot.getStock() >= quantity) {
			System.out.println(this.hot.getName() + "음료를" + quantity + "개 주문 받았습니다.");
			int stock = this.hot.getStock();
			stock -= quantity;
			this.hot.setStock(stock);
			System.out.println("재고: " + stock);
			}
			return this.hot.getPrice() * quantity;
			
		}
		else if(menu ==2) {
			if(this.ice.getStock() >= quantity) {
			System.out.println(this.ice.getName() + "음료를" + quantity + "개 주문 받았습니다.");
			int stock = this.ice.getStock();
			stock -= quantity;
			this.ice.setStock(stock);
			System.out.println("재고: " + stock);
			}
			return this.ice.getPrice() * quantity;
			
		}
		else {
			System.out.println("존재하지 않는 음료입니다.");
			return 0;
		}
		
	}
	
}
