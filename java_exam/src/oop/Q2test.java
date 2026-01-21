package oop;

public class Q2test {
	
	public static void main(String[] args) {
		Q2 game = new Q2();
		game.isInsertCoin = false;
		game.dolls = 10;
		
		game.insertCoin();
		int result = game.doGame();
		
		System.out.println("isInsertCoin" + game.isInsertCoin);
		System.out.println("남은 인형: " + game.dolls);
		System.out.println("남은 코인: " + result);
	}
}
