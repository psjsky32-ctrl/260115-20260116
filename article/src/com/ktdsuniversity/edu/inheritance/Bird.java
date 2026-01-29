package com.ktdsuniversity.edu.inheritance;
//1에러
public class Bird extends Animal{
	
	private boolean isFly;
	private float walkingSpeed;
	
	//2에러
	public Bird(String name, String voice, float speed, float damage, float hitPoint) {
		//this() 생성자가 자신의 생성자를 파라미터가 아무것도 없는 호출한다
		//this("a")생성자가 생성자를 호출하는데 a가 잇는
		super(name, voice, speed, damage, hitPoint);
		this.walkingSpeed = speed;
	}
	
	public boolean getIsFly() {
		return this.isFly;
	}
	
	
	
	public void fly() {
		this.isFly = true;
		//super.speed = 70; // private로 보호받고잇기때문에 쓸수 없지만 super class에 private말고 protected를 사용하면 가능은하다
		super.setSpeed(70f);
	}
	
	public void land() {
		this.isFly = false;
		super.setSpeed(this.walkingSpeed);
	}
	
	//Bird 클래스의 최종 super Class 인 Object 클래스의 toString() 메소드를 다시 정의한다.
	@Override
	public String toString() {
		String str = "Bird[name : % s, isFly : %s]";
		return str.formatted(super.getName(), this.isFly);
	}
	
}
