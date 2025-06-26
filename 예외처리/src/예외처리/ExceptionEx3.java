package 예외처리;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	while(true) {
			try {
				System.out.printf("10을 X로 나누려 한다.\n X의 값을 입력: ");
				
				int inputNum = scan.nextInt();
				int result = 10 / inputNum;
				
				System.out.printf("10 나누기 %d => %d\n", inputNum, result);
				break;
			} catch(ArithmeticException e) {
				System.out.println("0으로 나누는 건 누구한테 배웠습니까?");
			} catch(InputMismatchException ex) {
				System.out.println("정수를 넣으셔야죠;;;");
				 scan.nextLine();
			}
		}
	}
}
