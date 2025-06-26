package 배열length;

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		int Array[] = new int[5];
		int sum = 0;
		
		// "scanner"는 "Scanner" 객체의 메모리 주소값을 참조 할 변수 "scanner"의 레퍼런수 변수이다.
		// Argument인 "System.in"은 Scanner 객체의 constructor 함수의 parameter로 전달된다.
		Scanner scanner = new Scanner(System.in);
		
		// System.out.print(intArray.length + "개의 정수를 입력하세요");
		System.out.printf("%d개의 정수를 입력하세요\n", Array.length);
		
		for(int i = 0; i < Array.length; i++) {
			Array[i] = scanner.nextInt(); // 배열 객체의 각 인덱스 공간에 값을 대입 하기 위한 방법
			sum += Array[i]; // sum 변수의 초깃값은 0.
		}
		
		System.out.printf("평균은 %.2f입니다.", (float)sum/Array.length );
		
		scanner.close();
	}

}
