package exam;

public class Q2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int earlyMinutes = 45;
		int h = 13;
		int m = 30;
		
		int minutes = h * 60 + m;
		
		if(minutes < earlyMinutes) {
			earlyMinutes -= minutes;
			minutes = 24 * 60;
		}
		
		minutes -= earlyMinutes;
		
		int alarmH = minutes / 60;
		int alarmM = minutes % 60;
		
		System.out.println(alarmH + " " + alarmM);
	}

}
