package com.ktdsuniversity.edu.implement;

public class Test {
	
	public static void main(String[] args) {
		LgSmartTV lgTV = new LgTV();		
		LgRemoteController lgRemoteCon = new LgSmartRemoteController();
		lgRemoteCon.turnOn(lgTV);
		lgRemoteCon.runYoutube(lgTV);
		
//		lgTV.runNetflix();
//		lgTV.changeVolumn(500);
//		lgTV.turnOff();
		SamsungSmartTV samsungTV = new SamsungTV();
		lgRemoteCon.turnOn(samsungTV);
		
		SamsungRemoteController samsungRemoteCon = new SamsungSmartRemoteController();
		samsungRemoteCon.runCoupangPlay(samsungTV);
		samsungRemoteCon.runNetflix(samsungTV);
		
//		samsungTV.turnOn();
//		samsungTV.runCoupangPlay();
//		samsungTV.changeVolumn(500);
//		samsungTV.turnOff();
	}
}
