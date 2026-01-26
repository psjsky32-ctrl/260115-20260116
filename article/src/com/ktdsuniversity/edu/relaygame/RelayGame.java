package com.ktdsuniversity.edu.relaygame;

import java.util.Scanner;

public class RelayGame {
	
	private Scanner keyboard;
	private String startWord;
	private String nextWord;
	
	public RelayGame() {
		this.keyboard = new Scanner(System.in);
	}
	
	public void startGame() {
		System.out.println("게임이 시작되었습니다");
		System.out.println("시작 단어를 입력해주세요.: ");
		this.startWord = this.keyboard.nextLine();
		
		//시작 단어의 마지막 글자 추출
		//"기찻길옆오막살이"
		// 0 1 2 3 4 5 6 7index
		String lastLetter = this.startWord.charAt(this.startWord.length() - 1) + "";
		
		//다음 단어의 첫 번째 글자 추출 
		//0번부터 시작해서 첫 번째 글자까지 가지고와라
		String firstLetter = this.nextWord.substring(0, 1);
		
		while(true) {
			System.out.println("다음 단어를 입력해주세요.: ");
			this.nextWord = this.keyboard.nextLine();
			this.nextWord = this.nextWord.trim();
			
			lastLetter = this.startWord.charAt(this.startWord.length() - 1) + "";
			firstLetter = this.nextWord.substring(0, 1);
			if(lastLetter.equals(firstLetter)) {
				
				if(this.nextWord.length() >= 3) {
					this.startWord = this.nextWord;
				}else {
					System.out.println("게임이 종료 됐습니다.");
				}
				
			}else {
				System.out.println("게임이 종료 됐습니다.");
				break;
			}
		}
		
		
			
	}
	
	public static void main(String[] args) {
		RelayGame game = new RelayGame();
		game.startGame();
	}
}
