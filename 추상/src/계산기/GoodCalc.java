package 계산기;

abstract class Calculator {
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}

public class GoodCalc {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int substract(int a, int b) {
		return a - b;
	}
	
	public double average(int[] a) { // 기억하자 ... 메소드 호출이 아니다. 재정의 이다.
		double sum = 0;
		int value = 0;
		for(int i = 0; i<a.length; i++) {
			a[i] = value;
			value++;
		}
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if(i < a.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("\n");
		for(int i = 0; i<a.length; i++) {
			sum += a[i];
		}
		return sum/a.length;
	}
	
	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(10, 1));
		System.out.println(c.substract(10, 1));
		
		System.out.println(c.average(new int[5]));
	}
}