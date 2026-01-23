package com.ktdsuniversity.edu.article.management;

import com.ktdsuniversity.edu.member.management.Member;//3.ctrl + shift + o 사용할 패키지 선택하기

//2.import com.ktdsuniversity.edu.member.management.Member;

public class Article {
	
	String title;
	//String quthorName;
	//String quthorId;
	Member author;//1.com.ktdsuniversity.edu.member.management.Member 
	String content;
	
	public Article(String title, Member author, String content) {
		this.title = title;
		this.author = author;
		this.content = content;
	}
	
	public void viewarticleDescription() {
		System.out.println("제목: " + this.title);
		System.out.println("내용: " + this.content);
		
		
		//this.author.printinfo();
		System.out.println("작성자ID: " + this.author.getId());
		System.out.println("작성자명:" + this.author.getName());
	}
	
	public static void main(String[] args) {
		
		Member author = new Member("superuser", "관리자");
		Article article = new Article("테스트", author, "내용");
		article.viewarticleDescription();
	}
	
	
}
