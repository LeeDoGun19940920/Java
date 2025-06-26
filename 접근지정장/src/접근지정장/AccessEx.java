package 접근지정장;

import java.util.Scanner;

class Sample {
	// field
	public int a;
	private int b;
	int c;
}

public class AccessEx {
	public static void main(String[] args) {
		Sample s = new Sample(); // Sample 클래스의 Constructor Method를 호출하여 객체화 진행.
		s.a = 10;
		s.b = 20; // field b는 현재 private로 되어 있기에 타 클래스에서의 호출이 불가능하다.
		s.c = 30;
		
		System.out.println(s.a);
	}
}
