package app;
import lib.Calculator;
import java.util.Scanner;

public class GoodCalc extends Calculator {
	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int substract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		Scanner scan = new Scanner(System.in);
		
		a[0] = scan.nextInt();
		a[1] = scan.nextInt();
		a[2] = scan.nextInt();
		a[3] = scan.nextInt();
		
		double sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum/a.length;
	}
	
	public int multiplication(int a, int b) {// super class에 정의 되지 않은 메소드
		int result = a * b;
		
		return result;
	}
	
	public static void main(String[] args) {
		Calculator c = new GoodCalc();
		
		System.out.println(c.add(3, 5));
		System.out.println(c.substract(3, 5));
		System.out.println(c.average(new int[4]));
		// System.out.println(c.multiplication(5,6)); upcating 된 객체로 호출이 불가능하다.
	}
}
