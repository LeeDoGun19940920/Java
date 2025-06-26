package 예외처리;

import java.util.Scanner;
import java.util.Arrays;

public class TCF {
	static Arithmetic ar = new Arithmetic();
	
	public static void main(String[] args) {
		String[] names = {"KIm", "Lee", "Min", "Shin", "Park"};
		int a = 100;
	
		try {
			System.out.println(a);
			System.out.println(names[2]);
			System.out.println(Arrays.toString(names));
			System.out.println(names[10]);
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBound 되셨습니다.\n");
		} finally {
			// finally == 최종적으로
			System.out.println("예외 처리 진행이 완료 되었습니다.\n");
			System.out.println("finally 문은 예외 처리와 상관 없이 실행되는 구문입니다.\n");
		}
		
		System.out.println("프로그램 종료");
		
		System.out.println("자 새로운 게임을 시작해 봅시다.\n");
		ar.method();
		
		System.out.println("처음 작성했던 예외처리 문장은 특정 객체를 생성하는 과정이 없었기에 "
				+ " 헷갈리셨을 겁니다.");
		System.out.println("수고하셨습니다.");	
	}
}

class Arithmetic {
	Scanner scan = new Scanner(System.in);
	
	void method() {
		while(true) {
			
			System.out.print("나뉨수를 입력하세요: ");
			int dividend = scan.nextInt();
			System.out.print("나눗수를 입력하세요: ");
			int divisor = scan.nextInt();
			
			try {
				System.out.println(dividend/divisor);
				break;
			} catch(ArithmeticException e) {
				System.out.println("제대로 된 값을 입력하세요");
			} finally {
				if(divisor != 0) {
					System.out.println("계산을 마쳤습니다, 수고하셨습니다.");
				}
				else if(divisor == 0){
					System.out.println("최종적으로 당신은 오류를 잡아 내었습니다.");
				}// else 문은 필수요소가 아니다.
			}
		}
		scan.close();
	}
}