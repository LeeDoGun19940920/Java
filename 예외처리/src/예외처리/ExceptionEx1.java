package 예외처리;

import java.util.Arrays;

public class ExceptionEx1 {

	public static void main(String[] args) {
		String[] name = {"Kim", "Lee", "Min"};
		int a = 2;
		
		System.out.println(a);
		System.out.println(name[2]);
		System.out.println(Arrays.toString(name));
		System.out.println(name[4]);
	}

}
