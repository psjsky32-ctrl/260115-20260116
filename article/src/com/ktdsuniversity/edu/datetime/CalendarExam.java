package com.ktdsuniversity.edu.datetime;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		System.out.println(now);

		int year = now.get(Calendar.YEAR);
		System.out.println(year);

		int month = now.get(Calendar.MONTH) + 1;
		System.out.println(month);

		int date = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(date);

		// 1(일요일)~7(토요일)
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		String[] weekDays = { "일", "월", "화", "수", "목", "금", "토" };
		System.out.println(weekDays[week - 1] + "요일");

		// 2000-03-23(목요일)

		Calendar birthdate = Calendar.getInstance();
		birthdate.set(2000, 3 - 1, 23);
		week = birthdate.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekDays[week - 1] + "요일");

		// 오늘 날짜부터 56일 후는 몇월 며칠 무슨 요일일까?
		Calendar now2 = Calendar.getInstance();
		now2.add(Calendar.DAY_OF_MONTH, 56);
		// now2에서 연, 월, 일, 요일 출력

		// 2025년 2월 4일은 2026년 2월 4일보다 과거인가?
		Calendar now3 = Calendar.getInstance();
		Calendar past = Calendar.getInstance();
		past.set(2025, 2 - 1, 4);

		// now3의 시간이 1970년 1월 1일 0시 0분 0초 부터 얼마나 흘렀나?
		long nowTime = now3.getTimeInMillis();
		System.out.println(nowTime);

		long pastTime = past.getTimeInMillis();
		System.out.println(pastTime);

		if (pastTime < nowTime) {
			System.out.println("더 과거입니다.");
		}
		// 2026년 2월 4일 부터 2026년 7월 14일 까지 며칠이 걸리나?
		Calendar now4 = Calendar.getInstance();
		int daysCount = 0;
		while (true) {
			now4.add(Calendar.DAY_OF_MONTH, 1);
			daysCount++;

			if (now4.get(Calendar.YEAR) == 2026 && now4.get(Calendar.MONTH) == 6
					&& now4.get(Calendar.DAY_OF_MONTH) == 14) {
				break;
			}
		}
		System.out.println(daysCount + "일 걸렸습니다.");
		// 오늘 부터 7영업일 이후는 몇년 몇월 며칠 무슨 요일인가
//		Calendar now5 = Calendar.getInstance();
//		int workDays = 7;
//		int weekDays1 = 0;		
//		while(workDays > 0) {
//			now5.add(Calendar.DAY_OF_MONTH, 1);
//			weekDays1 = now5.get(Calendar.DAY_OF_WEEK);
//			if(weekDays1 != 1 && weekDays1 != 7) {
//				weekDays1 --;
//			}
//			
//		}
//		int nextYear = now5.get(Calendar.YEAR);
//		int nextMonth = now5.get(Calendar.MONTH);
//		int nextDate = now5.get(Calendar.DAY_OF_MONTH);
//		weekDays1 = now5.get(Calendar.DAY_OF_WEEK);
//		System.out.println(nextYear + "-" + nextMonth + "-" + nextDate + "-" + weekDays[weekDays1 - 1] + "요일");
		Calendar cal = Calendar.getInstance();
		int count = 0;

		while (count < 7) {
			cal.add(Calendar.DATE, 1);
			int day = cal.get(Calendar.DAY_OF_WEEK);

			if (day != Calendar.SATURDAY && day != Calendar.SUNDAY) {
				count++;
			}
		}
		
		System.out.println("7영업일 후: " + cal.get(Calendar.YEAR) + "년 " 
				+ (cal.get(Calendar.MONTH) + 1) + "월 "
				+ cal.get(Calendar.DATE) + "일");
	}

}
