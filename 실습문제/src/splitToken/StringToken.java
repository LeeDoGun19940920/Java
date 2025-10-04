package splitToken;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			String input = scan.nextLine();
		
			if(input.equals("그만"))
				break;
			
			String[] token = input.split(" ");
			
			System.out.println("어절 개수는 " + token.length);
		}
		
		while(true) {
			String input = scan.nextLine();
			StringTokenizer st = new StringTokenizer(input);
			
			if(input.equals("그만")) {
				break;
			}
			System.out.println("어절의 갯수는 " + st.countTokens());
		}
	}
}
