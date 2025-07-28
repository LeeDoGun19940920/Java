package 환전시스템;

import java.util.Scanner;

abstract class Convert1 {
	abstract protected double convert1(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio; // 상소되는 field
	
	public void run() { // 상속되는 method;
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() +"을 입력하세요>> ");
		double val = scanner.nextDouble(); // 값 입력;
		double res = convert1(val); // convert1 method 호출, arguments로 val 변수값 전달;
		System.out.println("변환 결과: " + res + getDestString() + "입니다.");
		scanner.close();
	}
}

public class Kim2Mile extends Convert1 {
	double distance;
	
	Kim2Mile(double distance) {
		super();
		this.distance = distance;
	}
	
	@Override
	protected double convert1(double src) { // parameter인 src로 val 변수값 대입;
		// 30km는 몇 마일인지 반환
		return src/distance;
	}
	@Override
	protected String getSrcString() { // Km를 반환해야 한다.
		return "Km";
	}
	@Override
	protected String getDestString() { // mile을 반환해야 한다.
		return "mile";
	}
	
	public static void main(String[] args) {
		Kim2Mile toMile = new Kim2Mile(1.6); // 1마일은 1.6km;
		toMile.run();
	}
}
