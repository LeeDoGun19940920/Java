package calendar;

import java.util.Calendar;

public class Alarm {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		System.out.println("현재 시간은 " + c.HOUR_OF_DAY + "시 " + c.MINUTE + "분 입니다.");
		
		if(c.HOUR_OF_DAY >= 04 && c.HOUR_OF_DAY <= 12 && c.HOUR_OF_DAY == c.AM) {
			System.out.println("Good Morning");
		}
		if(c.HOUR_OF_DAY > 12 && c.HOUR_OF_DAY <= 18 && c.HOUR_OF_DAY == c.PM) {
			System.out.println("Good Afternoon");
		}
		if(c.HOUR_OF_DAY > 19 && c.HOUR_OF_DAY <= 22 & c.HOUR_OF_DAY == c.PM) {
			System.out.println("Good Evening");
		}
		else {
			System.out.println("Good Night");
		}
	}
}
