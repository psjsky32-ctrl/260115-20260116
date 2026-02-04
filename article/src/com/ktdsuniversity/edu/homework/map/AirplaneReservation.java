package com.ktdsuniversity.edu.homework.map;

import java.util.*;

public class AirplaneReservation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		//하나의 데이터가 Key:Value 쌍으로 이루어진 자료구조
		//비행기번호 Key: String
		//자리 Value :List<Tickets>
		//HashMap<>:사용자가 입력한 key를 Hash함수로 계산된 값을 index로 사용하는 배열에 value를 담는 개념으로 Map 구현한 자료형이다.
		// 비행기번호 → 예약 티켓 목록을 매핑하는 자료구조
		
		// HashMap : 키-값 쌍을 저장하는 가장 일반적인 Map 구현체
		// 내부적으로 해시 함수를 이용해 키를 배열 인덱스로 변환 후 값을 저장
		// key   : 비행기 번호 (String)
		// value : 해당 비행기의 티켓 리스트 (List<Tickets>)
		// 비행기 번호(String)를 키로, 해당 비행기의 예약 티켓 목록(List<Tickets>)을 값으로 가지는 맵
		Map<String, List<Tickets>> flightMap = new HashMap<>();
		while (true) {
			System.out.println("\n비행기 편의 이름을 입력하면, 좌석 현황을 볼 수 있습니다.");
			System.out.print("비행기 편의 이름을 입력하세요: ");

			String flightNumber = sc.next();
			// 처음 보는 비행기 편명이라면 → 좌석 생성
			if (!flightMap.containsKey(flightNumber)) {
				List<Tickets> newSeats = new ArrayList<>();
				for (int i = 1; i <= 9; i++) {// 1번부터 9번 좌석까지 생성
					newSeats.add(new Tickets(i, random.nextBoolean()));// 1~9번 좌석의 o x일 확률은 50프로
				}
				flightMap.put(flightNumber, newSeats);//새로 만든 좌석(newSeats) 리스트를 flightNumber 연결하여 map에 저장
			}
			// 해당 비행기의 좌석 리스트 가져오기
			List<Tickets> seats = flightMap.get(flightNumber);

			while (true) {
				System.out.println("\n\"" + flightNumber + "\" 편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)");
				for (int i = 0; i < seats.size(); i++) {
					System.out.print(seats.get(i) + (i == seats.size() - 1 ? "" : ", "));
				}
				System.out.println();
				//좌석 꽉참
				boolean isAllFull = true;
				//좌석 리스트안에 있는 티켓을 하나씩 꺼내서 검사
				for (Tickets t : seats) {
					if (!t.isReserve()) {//예약가능상태라면
						isAllFull = false;//예약하기
						break;
					}
				}

				if (isAllFull) {
					System.out.println("해당 비행기는 모든 좌석이 매진되었습니다.");
					break;
				}

				int num = 0;
				while (true) {
					try {
						System.out.print("좌석 예약을 하려면 번호를 입력하세요: ");
						num = sc.nextInt();
						break;
					} catch (InputMismatchException e) {
						System.out.println("잘못된 입력입니다. 숫자로만 입력해주세요.");
						sc.nextLine();
					}
				}

				if (num < 1 || num > seats.size()) {
					System.out.println("잘못된 좌석 번호입니다. 1~" + seats.size() + " 사이의 번호를 입력하세요.");
					continue;
				}

				Tickets target = seats.get(num - 1);

				if (target.isReserve()) {
					System.out.println("\"" + num + "\"번 좌석은 이미 예약된 좌석입니다.");
					continue;
				}
				//리스트 인덱스에 맞춰서 하나를 가지고오고 예약상태인지 검사하고 예약할꺼냐고 
				//물어보고 y 예약완료 n 예약취소
			
			}
			
		}
	}
}