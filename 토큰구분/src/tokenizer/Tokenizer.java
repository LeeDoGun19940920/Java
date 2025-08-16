package tokenizer;
import java.util.StringTokenizer;

public class Tokenizer {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");
		
		while(st.hasMoreTokens()) {// Token이 있는 동안
			System.out.println(st.nextToken());
		}
	}
}
