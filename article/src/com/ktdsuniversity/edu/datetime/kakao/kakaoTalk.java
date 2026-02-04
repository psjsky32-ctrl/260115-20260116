package com.ktdsuniversity.edu.datetime.kakao;

public class kakaoTalk {
	public static void main(String[] args) {
		FriendList fl = new FriendList();
		
		
		fl.add(new Friend("A", "2000-01-01"));
		fl.add(new Friend("B", "2001-11-23"));
		fl.add(new Friend("C", "2004-07-03"));
		fl.add(new Friend("D", "2000-02-11"));
		fl.add(new Friend("E", "2000-03-23"));
		fl.add(new Friend("F", "2000-02-04"));
		fl.add(new Friend("G", "2000-01-30"));
		
		fl.printSpecialFriends(Base.FUTURE); //생일이 다가오는 친구
		fl.printSpecialFriends(Base.NOW); //오늘이 생일인 친구
		fl.printSpecialFriends(Base.PAST); //생일이 지난 친구
		
		System.out.println(fl);
	}
}
