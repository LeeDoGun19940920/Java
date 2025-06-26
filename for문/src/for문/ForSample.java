package for문;
import java.util.Scanner;

public class ForSample {
	public static void main(String[] args) {
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = scan.nextInt(); i < 101; i+= 10, System.out.println(i))
			// i+= 10, System.out.println(i) - 증가 연산이 먼저 일어난 후, 증가 된 'i' 값을 출력한다.
		{
			sum += i;
			//System.out.print(i);
			
			if(i <= 90)
			{
				System.out.print('+');
			}
			else
			{
				System.out.print('=');
				System.out.print(sum);
			}
		}
	}
}
