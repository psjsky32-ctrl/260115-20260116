package oop;

public class CarTest {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		System.out.println(car);
		//car의 엔진 상태를 출력한다.
		
		
		car.pressEngineStartButton();
		car.pressGasolinPedal(20);
		
		boolean carEnginState = car.isEnginStart;
		System.out.println("car Engine: " + carEnginState);
		//car의 현재 속도를 출력한다.
		int carspeed = car.speed;
		System.out.println("car speed: " + carspeed);
		
		
		
		
		Car carnival = new Car();
		System.out.println(carnival);
		
		carnival.pressGasolinPedal(200);
		carnival.pressEngineStartButton();
		carnival.pressBreakePedal(10);
		carnival.pressBreakePedal(10);
		
		boolean carnibalState = carnival.isEnginStart;
		System.out.println("Carnival Engine: "+ carnibalState);
		int carnbalSpeed = carnival.speed;
		System.out.println("carnibal Speed: " + carnbalSpeed);
	}
}
