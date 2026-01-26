package com.ktdsuniversity.edu.relaygame;

import java.util.Scanner;

public class RelayGame2 {

	private Scanner keyboard;
	private String startWord;
	private String nextWord;
	
	public RelayGame2() {
		this.keyboard = new Scanner(System.in);
	}
	
	public void startGame() {
		System.out.println("게임이 시작되었습니다.");
		System.out.print("시작 단어를 입력해주세요: ");
		this.startWord = this.keyboard.nextLine().trim();
		
		String lastLetter = this.startWord.substring(this.startWord.length() - 1);
		
		while(true) {
			System.out.print("다음 단어를 입력해주세요: ");
			this.nextWord = this.keyboard.nextLine().trim();
			
			// 1. 이전 단어의 마지막 글자 추출 
			lastLetter = this.startWord.substring(this.startWord.length() - 1);
			
			if(this.nextWord.startsWith(lastLetter)) {
				
				if(this.nextWord.length() >= 3) {
					this.startWord = this.nextWord;
				} else {
					System.out.println("게임 종료");
					break;
				}
				
			} else {
				System.out.println("게임 종료");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		RelayGame2 game = new RelayGame2();
		game.startGame();
	}
}