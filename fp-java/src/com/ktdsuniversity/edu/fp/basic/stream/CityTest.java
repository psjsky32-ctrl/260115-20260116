package com.ktdsuniversity.edu.fp.basic.stream;


import java.util.List;

public class CityTest {

	public static void main(String[] args) {
		List<City> cites = City.loadCityData();
		cites.forEach(System.out::println);
		
		//stateId가 3907번인 City의 ContryName을 출력.
		for(City city: cites) {
			if(city.getStateId() == 3907) {
				System.out.println(city.getCountryName());
			}
		}
		
		// ==> Stream Code 로 구현
		
		// countryName 이 "South Korea"인 City의 _native를 출력
		
		// countryName 이 "South Korea"이면서 _native의 길이가 3이상인 City의 _native를 출력
	}
}
