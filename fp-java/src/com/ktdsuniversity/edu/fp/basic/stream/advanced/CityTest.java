package com.ktdsuniversity.edu.fp.basic.stream.advanced;


import java.util.List;
import java.util.Optional;

public class CityTest {

	public static void main(String[] args) {
		List<City> cities = City.loadCityData();
//		cities.forEach(System.out::println);
//		
//		//stateId가 3907번인 City의 ContryName을 출력.
//		for(City city: cites) {
//			if(city.getStateId() == 3907) {
//				System.out.println(city.getCountryName());
//			}
//		}
//		
		// ==> Stream Code 로 구현
//		cities.stream()
//			  .filter(city -> city.getStateId() == 3907)
//			  .map(city -> city.getCountryName())
//			  .forEach(contryName -> System.out.println(contryName));
//			  .forEach(System.out::println);
//		// countryName 이 "South Korea"인 City의 _native를 출력
//		cities.stream()
//		  .filter(city -> city.getCountryName().equals("South Korea"))
//		  .forEach(city -> System.out.println(city.get_native()));
//		// countryName 이 "South Korea"이면서 _native의 길이가 3이상인 City의 _native를 추
//		cities.stream()
//		  .filter(city -> city.getCountryName().equals("South Korea"))
//		  .filter(city -> city.get_native().length() >=3)
//		  .forEach(city -> System.out.println(city.get_native()));
//		
//		
//	System.out.println("=".repeat(40));
//	cities.stream()
//	  	.filter(city -> city.getCountryName().equals("South Korea"))
//	  	.filter(city -> city.get_native().length() >=3)
//	  	.skip(3)
//	  	.limit(3)
//	  	.forEach(city -> System.out.println(city.get_native()));
//	
	
	//_native의 값이 한글로만 이루어진 값 중에서 _native의 길이가 4글자 이상인 것의
	//name을 중복없이 조회한다.
	
	//예시>한글로만 이루어져 잇는가?
	String name = "박승재";
	System.out.println(name + "은 한글로만 이루어진 4글자 이상의 이름이 있다?" + name.matches("^[가-힝]{4,}$]"));
	
	System.out.println("=".repeat(40));
	
	cities.stream()
		.filter(city -> city.get_native().matches("^[가-힝]{4,}$"))
		.map(City::getName)
		.distinct()
		.map(String::length)
		.filter(length -> length >= 10)
		.distinct()
		.forEach(System.out::println);
	
	//애월읍의 stateName명을 출력한다.
	Optional<City> found = cities.stream() //Stream<city>
		  .filter(city -> city.getName().equals("Gaigeturi"))//Stream<city>
		  .findFirst();//Optional<city>
	
	System.out.println(found.orElse(null).getStateName());
	
	Optional<City> found2 = cities.stream() //Stream<city>
			  .filter(city -> city.getName().equals("QWER"))//Stream<city>
			  .findFirst();//Optional<city>
//		System.out.println(found2.orElse(null).getStateName());// 에러
		//optional을 사용한 case1
	City city = found2.orElse(null);
		if(city != null) {
			System.out.println(city.getStateName());
		}
		//optional을 사용한 case2
		System.out.println("case2");
		if(found2.isPresent()) {
			System.out.println(found2.get().getStateName());
		}
		System.out.println("case3");
		//optional을 사용한 case3
		City city2 = found2.orElse(new City(""));
		System.out.println(city2.getStateName());
		
		cities.stream()
			  .peek(citys ->System.out.println(citys.getCountryCode()))
			  .filter(citys -> true)
			  .map(citys -> citys.get_native());
		
		System.out.println("~~~~~~~~~");
		}
	}

//최종함수가 잇어야만 동작을한다?
