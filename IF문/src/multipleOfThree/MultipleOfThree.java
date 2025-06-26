package multipleOfThree;
import java.util.Scanner;

public class MultipleOfThree {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수를 입력하세요. : ");
		int number = scan.nextInt();
		
		if (number % 3 == 0 ) {
			System.out.println("3의 배수입니다.");
			
		}
		else if(number % 2 == 0) {
			System.out.println("입력 값은 짝수 입니다.");
		}
		else {
			System.out.println("3의 배수가 아니며, 짝수도 아닙니다.");
		}
		
		scan.close();
	}
}
