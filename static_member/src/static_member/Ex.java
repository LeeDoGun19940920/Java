package static_member;

import java.util.Scanner;

class StaticSample1 {
	
	public int n;
	public void g() {
		System.out.println(n);
	}
	
	public static int m;
	public void h() {
		System.out.println(m);
	}
	
	public static void f() {
		m = 100;
	}
}

public class Ex {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		StaticSample1 SS, SS1;
		SS = new StaticSample1();
		SS.n = scan.nextInt(); // 우선 SS 객체 멤버 변수에 숫자 대입.
		SS.g();
		
		StaticSample1.m = 50;
		SS1 = new StaticSample1();
		SS1.h();
		
		StaticSample1.f();
		System.out.println(StaticSample1.m);
		
		scan.close();
	}
}