package com.ktdsuniversity.edu.implement;
//규약 만들기
public class SamsungTV implements SamsungSmartTV{

	@Override
	public void turnOn() {
		System.out.println("삼성 티비를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("삼성 티비를 끕니다");
	}

	@Override
	public void changeChannel(int channelNumber) {
		System.out.println("삼성티비의 채널을 바꿉니다" + channelNumber);
	}

	@Override
	public void changeVolumn(int volumn) {
		System.out.println("삼성티비의 볼륨을 "+ volumn +" 킨다");
	}

	@Override
	public void runNetflix() {
		System.out.println("삼성티비의 넷플릭스 실행.");
	}

	@Override
	public void runMenu() {
		System.out.println("삼성티비의 메뉴 실행");
	}

	@Override
	public void runCoupangPlay() {
		System.out.println("삼성티비의 쿠팡 실행");
	}
	
	
	
}
