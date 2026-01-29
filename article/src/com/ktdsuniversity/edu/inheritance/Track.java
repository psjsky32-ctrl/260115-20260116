package com.ktdsuniversity.edu.inheritance;

public class Track {
	public static void main(String[] args) {
		Vehicle car = new Vehicle("마티즈");
		Vehicle car2 = new SportsCar("포르쉐 911");
		Vehicle car3 = new BatMobile("배트카");
		Vehicle car4 = new Ev("TT" , 6000000);
		
		car.startEngine();
		car2.startEngine();
		car3.startEngine();
		car4.startEngine();
	}
}
