package com.ktdsuniversity.edu.homework;
/**
 * 
 */
public class RestaurantTest {
	public static void main(String[] args) {

		Customer customer = new Customer();
		int totalPrice = 0;

		Menu[] menus = { new Menu("제육볶음", 20, 0, 6000), new Menu("돈까스", 25, 0, 6500), new Menu("국밥", 15, 0, 5000),
				new Menu("참이슬", 0, 10, 4000), new Menu("처음처럼", 0, 10, 4000), new Menu("진로", 0, 10, 4000) };

		Restaurant restA = new Restaurant(50, 60);

		customer.Status(30, 20);

		if (restA.canAccept(customer)) {
			totalPrice += customer.order(menus[0], 3);
			totalPrice += customer.order(menus[3], 3);
			System.out.println("주문 성공");
		} else {
			System.out.println("집에 가세요.");
		}

		System.out.println("----------------------");
		System.out.println("최종 배부름: " + customer.getCustomerFull());
		System.out.println("최종 취함: " + customer.getAlcoholFull());
		System.out.println("총 결제 금액: " + totalPrice + "원");
	}
}

