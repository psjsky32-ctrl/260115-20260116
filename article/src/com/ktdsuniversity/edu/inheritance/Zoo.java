package com.ktdsuniversity.edu.inheritance;

public class Zoo {

	public static void main(String[] args) {
		//상속이용시 타입의 정의는 super Class로 한다
		
		String name = "박승재";
		String other = "박승재";
		System.out.println(name == other);
		
		
		Animal duck = new Bird("오리", "꽥꽥", 15f, 20f, 50f);
		Animal duck2 = new Bird("오리", "꽥꽥", 15f, 20f, 50f);
		
		
		System.out.println(" == 비교 " +(duck == duck2));
		System.out.println("equals 비교: " + duck.equals(duck2));
		
		duck.howling();
		duck.move();
		//명시적 형변환 instanceof duck 너가 bird의 인스턴스냐
		//옛날 버전
//		if(duck instanceof Bird) {
//			Bird bird = (Bird)duck;
//			bird.fly();
//			bird.land();
//		}
		//현재 버전
		if(duck instanceof Bird bird) {
			bird.fly();
			bird.move();
			
			bird.land();
			bird.move();
			
			bird.fly();
			
		
		}
		//duck.fly();
		//duck.land();
		
		Animal lion = new Animal("사자", "크아앙", 80f, 60f, 200f );
		Animal tiger = new Animal("호랑이", "어흥", 50f, 55f, 200f );
//		duck.
		System.out.println(duck);
		
		StringBuffer sb = new StringBuffer();
		sb.append("asdasdasdsa");
		System.out.println(sb);
		
		
		
		
		
		lion.howling();
		tiger.howling();
		
		lion.move();
		tiger.move();
		
		//다향성 ANimal(super Class)을 상속해서 만든게 Bird(sub Class) 
		//is - a?? sub Class is - a super Class
		tiger.attack(duck);
		
		duck.attack(tiger);
		
		
		lion.attack(tiger);
//		lion.attack(tiger);
//		lion.attack(tiger);
//		lion.attack(tiger);
		
		tiger.attack(lion);
		
		
	}
}
