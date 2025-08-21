package 년월일요일시간;
import java.util.Calendar;

public class CalendarEx {
		
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);// Calendar 클래스의 final 상수;
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		
		System.out.println(msg + ":" + year +"/" + month + "/" + day);
		
		switch(dayOfWeek) {
		case Calendar.SUNDAY : System.out.print("일요일 "); break;
		case Calendar.MONDAY : System.out.print("월요일 "); break;
		case Calendar.TUESDAY : System.out.print("화요일 "); break;
		case Calendar.WEDNESDAY : System.out.print("수요일 "); break;
		case Calendar.THURSDAY : System.out.print("목요일 "); break;
		case Calendar.FRIDAY : System.out.print("금요일 "); break;
		case Calendar.SATURDAY : System.out.print("토요일 "); break;
		}
		
		System.out.println(hourOfDay+"시");
		if(ampm == cal.AM)
			System.out.print("(오전) ");
		else
			System.out.print("(오후) ");
		
		System.out.println(hour + "시 " + minute + "분 " + second + "초 " + millisecond + "밀리초");
	}
	
	public static void main(String[] args) {
		// 객체를 생성해주는 메소드, Calendar class의 static method
		Calendar now = Calendar.getInstance(); 
		printCalendar("현재", now);
		System.out.println();
		
		Calendar firstDate = Calendar.getInstance();
		// firstDate.clear() 메소드를 호출하기 전, 
		// Calendar.getInstance()가 반환하는 객체는 현재 컴퓨터의 날짜와 시간을 기준으로 한다.
		firstDate.clear(); //Calendar 객체의 모든 필드를 초기화 해주는 메소드
		firstDate.set(2016, 11, 25); //12월을 11로 설정하는 이유는 월(month)을 나타내는 상수가 0부터 시작하기 때문
		
		firstDate.set(Calendar.HOUR_OF_DAY, 20);
		firstDate.set(Calendar.MINUTE, 30);
		printCalendar("처음 데이트한 날은 ", firstDate);
	}

}
