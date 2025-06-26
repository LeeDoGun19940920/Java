package loop;
import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 5개를 입력하세요");
		int sum = 0;
		
		for(int i = 0; i < 5; i++)
		{
			int n = scan.nextInt();
			
			if(n <= 0)
				continue;
			else if(n == 1)
				break;
			else
				sum += n; // sum = sum + 0;
		}
		System.out.println("양수의 합은 " + sum);
		
		scan.close();
	}
}
