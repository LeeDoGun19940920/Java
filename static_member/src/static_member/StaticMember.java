package static_member;

import java.util.Scanner;

class CurrencyConverter {
	private static double rate;
	static double toDollar(double Won) {
		// 원화를 달러로 교환
		return Won/rate;
	}
	public static double toKWR(double Dollar) {
		return Dollar*rate;
	}
	public static void setRate(double R) {
		rate = R;
	}
		// Won, Dollar, R은 지역 변수라고 한다. 자바에서는 전역변수는 없지만 지역 변수는 존재한다.
}

public class StaticMember {
	public static void main(String[] args) { // main method
		Scanner scan = new Scanner(System.in);
		
		System.out.println("환율 1달러 >>");
		double rate = scan.nextDouble();
		// main method의 지역 변수 rate
		CurrencyConverter.setRate(rate);
		// CurrencyConverter 클래스의 rate 변수로 값 저장.
		System.out.println("백만원은 달러로 " + CurrencyConverter.toDollar(1000000) + "$ 입니다.");
		System.out.println("$100는 " + CurrencyConverter.toKWR(100) + "원 입니다.");
		
		scan.close();
	}
}