package oop;

/**
 * <pre> html tag present
 * 객체 지향 프로그래밍의 첫 번째 실습.
 * 
 * 자동차의 속성과 기능을 구현함으로서 클래스와 객체에 대해 이해한다. * 
 * </pre>
 */
public class Car {	
	
	//클래스 속성(멤버변수 | 인스턴스 필드)
	/**
	 * <pre>
	 * 엔진은 시동 여부이다.
	 * 엔진이 꺼져있을 때는 가속 페달을 누르거나 브레이크 페달을 눌러도 아무런 효과가 없다.
	 * 엔진인 켜져 있을 때는 누르는 페달에 따라 속도(speed)가 변화된다.
	 * </pre>
	 */
	boolean isEnginStart;
	/**
	 * <pre>
	 * 자동차의 현재 속도를 표현한다.
	 * 
	 * 가속페달을 누르면 속도가 증가한다.
	 * 브레이크 페달을 누르면 속도가 감소한다.
	 * </pre>
	 */
	int speed;
	
	
	//인스턴스 메소드같은경우는 static을 사용하지 않는다.
	
	/**
	 * <pre>
	 * 현재 엔진의 상태에 따라서 시동을 켜거나 끈다.
	 * 시동이 걸리면 isEnginStart 의 값이 true, 꺼지면 false가 된다.
	 * 시동이 꺼지면 speed의 값은 0이 된다.
	 * 시동이 켜지면 speed의 값은 10이 된다.
	 * </pre>
	 */
	public void pressEngineStartButton() {
		if(isEnginStart) {
			isEnginStart = false;
			speed = 0;
			System.out.println("시동을 끕니다");
			System.out.println("현재 속도는: " + speed);
		}else{
			isEnginStart = true;
			speed = 10;
			System.out.println("시동을 켭니다");
			System.out.println("현재 속도는: " + speed);
		}
	}
	/**
	 * <pre>
	 * 시동이 켜져 잇을때 가속 페달을 누르는 압력만큼 속도가 증간한다.
	 * 
	 * </pre>
	 * @param press 가속 페다를 누르는 압력의 정도
	 */
	public void pressGasolinPedal(int press) {
		if(isEnginStart) {
			speed += press;
			System.out.println("현재 속도는: " + speed);
		}
	}
	/**
	 * <pre>
	 * 시동이 켜져 있을 때 브레이크 페달을 누르는 압력만큼 속도가 감소한다.
	 * </pre>
	 * @param press 브레이크 페달을 누르는 압력의 정도
	 */
	public void pressBreakePedal(int press) {
		if(isEnginStart) {
			speed -= press;
			if(speed < 0) {
				speed = 0;
			}
			System.out.println("현재 속도는: " + speed);
		}
	}
}
