package static_member;

import java.util.Scanner;

class Calc {
	public static int abs(int a) {return a>0?a:-a;}
	public static int max(int a, int b) {return (a>b)?a:b;}
	public static int min(int a, int b) {return (a>b)?b:a;}	
}

public class CalcEx {
	public static void main(String[] args) { // main()은 JVM이 자동으로 실행하므로 별도의 객체 필요없다.
		Scanner scan = new Scanner(System.in);
		
		// 호출되는 function이 어느 소속인지가 중요하다.
		System.out.println(Calc.abs(scan.nextInt()));
		System.out.println(Calc.max(scan.nextInt(), scan.nextInt()));
		System.out.println(Calc.min(scan.nextInt(), scan.nextInt()));
		
		scan.close();
	}
}