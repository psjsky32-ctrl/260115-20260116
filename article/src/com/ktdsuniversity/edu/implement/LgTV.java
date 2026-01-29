package com.ktdsuniversity.edu.implement;
//규약 만들기
public class LgTV implements LgSmartTV{
	@Override
	public void turnOn() {
		System.out.println("엘지 티비 킨다");
	}
	
	@Override
	public void turnOff() {
		System.out.println("엘지 티비 끈다");
	}
	
	@Override
	public void changeChannel(int channelNumber) {
		System.out.println("엘지  티비 채널 바꾼다" + channelNumber);
	}
	
	@Override
	public void changeVolumn(int volumn) {
		System.out.println("엘지 티비 볼륨 "+ volumn +" 킨다");
	}

	@Override
	public void runNetflix() {
		System.out.println("엘지 넷플 킨다");
	}

	@Override
	public void runInternet() {
		System.out.println("엘지 인터넷 킨다");
	}

	@Override
	public void runYoutube() {
		System.out.println("엘지 유튜브 킨다");
	}
}
