package java_exam;

public class Variables1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//중요한 타입(int, long, float, double, boolean)
		//나이가 몇사인지 구해보는 나이 계산기
		//현재 연도 - 나의 생년
		System.out.println(2026 - 2000 + 1);
		//Var naming Convention
		//1.첫 번째 단어의 첫 번째 글자는 소문자로 작성
		//2.두 번째 이후의 단어의 첫 번째 글자만 대문자로 작성.(Camel Case)
		//3.특수기호나 숫자로 시작할 수 없다.
		//  사용가능한 특수기호 ( _ )<-- 권장하지 않음
		
		{
			int nowYear = 2026;		
			int myBirthYear = 2000;
			int myAge = nowYear - myBirthYear + 1;
			
			System.out.println(myAge);
		}
		System.out.println("계산 끝났습니다");
		
		
		//final long price = 1000;
		//long buildingPrice = 10_000_000_000L;//자바는 기본 int타입이라 알려줘야한다.l,L을 붙이면 에러가 없어진다.
		
		//float ratio = 5.111f;//f, F 붙이기 
		
		//double douleRatio = 32132.321498742616874513544848479846512315484;//double은 d, D 안붙여도 상관없다.
		
		//long a = 1l;
		//int b = (int)a;
		
		long num = Integer.MAX_VALUE;
		num = num + 1;//정수 오버플로우 int의 범위를 넘어간다. 
		System.out.println(num);
		
		byte bNumber = 127;
		//bNumber = bNumber + (byte) 1;//byte 계산식 byte + byte = byte 나머지 동일 ==> byte + int = int
		bNumber = (byte)(bNumber + 1);
		//price = 10_000;
		//정수 + 실수 = 실수
		//System.out.println(nowYear - myBirthYear + 1);
		
		System.out.println(10L +3.5f);
		//정수 < 실수 : 정수 + 실수 = 실수
		System.out.println("3 + 7의 결과는 " + (3 + 7) );
		
		System.out.println((float)10 / 3);
		System.out.println(10 / (float)3);
		
		System.out.println(10f / 3);
		System.out.println(10 / 3f);
	}

}
