package tokenizer;
import java.util.StringTokenizer;

public class TokensHap {
	static int sum = 0;
	
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("2+3+5+66+88+323", "+");
		
		while(st.hasMoreTokens()) {
			String s = ", "; // String Literal;
			System.out.print(st.nextToken());
			if(st.hasMoreTokens()) 
				System.out.print(", ");
		}
		System.out.println();
		
		StringTokenizer st1 = new StringTokenizer("2+3+5+66+88+323", "+");
		
		while(st1.hasMoreTokens()) {	
			Integer value = Integer.parseInt(st1.nextToken());
			TokensHap.sum += value;
		}
		System.out.print("2+3+5+66+88+323 = " + TokensHap.sum);
	}
}
