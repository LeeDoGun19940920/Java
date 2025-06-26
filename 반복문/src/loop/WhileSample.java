package loop;
import java.util.Scanner;

public class WhileSample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count= 0;
		int i = 0;
		int n = scan.nextInt();
		do // n의 값이 무엇인지 와는 상관없이 반드시 처음 한번은 코드가 실행 된다!!!
		{
			System.out.println("합계를 시작합니다.");
			if(n > 0 && n < 10)
			{
				System.out.println(count + "회차 시작입니다.");
				System.out.printf("이 구역에서 %d의 값이 증가합니다.\n", count);
				System.out.println(++count); // count++ 과의 차이점을 확실히 알아 둘 것
				
				for(; i < 10; i++)
					System.out.println(i);
				
				System.out.println("마지막 수는 " + i + "입니다.");
				break;
			}
		}while(n != 0);
		if (n == 0)
			System.out.println("n == 0 이기에 반복이 끝났습니다.");
		
		scan.close();
	}

}
