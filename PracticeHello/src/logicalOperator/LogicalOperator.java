package logicalOperator;
import java.util.Scanner;

public class LogicalOperator {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		int s = x > y ? 1 : 0;
		int r = (x > y) ? (x - y) : (y - x);
		
		System.out.println('a' > 'b');
		System.out.println(3 >= 2);
		System.out.println(-1 < 0);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2)); // ! == not 을 의미하는 논리 연산자;
		System.out.println((3 > 2) && (3 > 4)); // &&를 이용해서 AND 논리 연사자를 표현했다.
		
		System.out.println(s);
		System.out.println(r);
	}
} 
