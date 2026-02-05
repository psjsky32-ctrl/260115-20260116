package com.ktdsuniversity.edu.fp.basic.kakao;

import java.time.LocalDate;
import java.time.Period;

public class kakaoTalk {
	public static void main(String[] args) {
		FriendList fl = new FriendList();

		fl.add(new Friend("A", "2000-01-01"));
		fl.add(new Friend("김", "2001-02-05"));
		fl.add(new Friend("C", "2004-07-03"));
		fl.add(new Friend("D", "1996-02-11"));
		fl.add(new Friend("E", "2006-03-23"));
		fl.add(new Friend("F", "2000-02-04"));
		fl.add(new Friend("G", "2000-01-30"));

		System.out.println("7일 이내에 생일을 맞이하는 친구 목록");
//		fl.printSpecialFriends( birthdate -> birthdate.isAfter(LocalDate.now()) 
//				&& birthdate.isBefore(LocalDate.now().plusDays(8)));
		fl.printSpecialFriends(friend -> {
			LocalDate birthDate = friend.getBirhdate().withYear(LocalDate.now().getYear());
			return birthDate.isAfter(LocalDate.now()) && birthDate.isBefore(LocalDate.now().plusDays(8));

		});

		System.out.println("오늘이 생일인 친구 목록");
//		fl.printSpecialFriends(birthdate -> birthdate.isEqual(LocalDate.now()));
		fl.printSpecialFriends2(friend -> {
			LocalDate now = LocalDate.now();
			LocalDate birthDate = friend.getBirhdate().withYear(now.getYear());
			return birthDate.isEqual(now);
		});

		System.out.println("7일 이내에 생일이 지난 친구 목록");
//		fl.printSpecialFriends(birthdate -> birthdate.isBefore(LocalDate.now())
//							&&birthdate.isAfter(LocalDate.now().minusDays(8)));
		fl.printSpecialFriends2(friend -> {
			LocalDate birthDate = friend.getBirhdate().withYear(LocalDate.now().getYear());

			return birthDate.isBefore(LocalDate.now()) && birthDate.isAfter(LocalDate.now().minusDays(8));
		});
		System.out.println("오늘 만 30세가 된 친구 목록");
		fl.printSpecialFriends2(friend -> {
			LocalDate birthDatey = LocalDate.now();
			return friend.getBirhdate().equals(LocalDate.now().minusYears(30));
		});
		
		System.out.println("---------------------------");
		
		System.out.println("이름이 'A'인 친구 목록");
		fl.printSpecialFriends2( friend -> friend.getName().equals("A"));
		System.out.println("이름이 '김'으로 시작하는 친구 목록");
		fl.printSpecialFriends2( friend -> friend.getName().startsWith("김"));
		System.out.println("이름이 '이'로 시작하면서 나이가 20세 이상인 친구 목록");
		//LocalDate now = LocalDate.now();
		//fl.printSpecialFriends( friend -> friend.getName().startsWith("이") && friend.getBirhdate().equals(LocalDate.now().minusYears(20)));
		
		System.out.println("=====================================");
		System.out.println("전체 친구 목록");
		// System.out.println(fl);
		fl.printSpecialFriends(friend -> true);
	}
}
