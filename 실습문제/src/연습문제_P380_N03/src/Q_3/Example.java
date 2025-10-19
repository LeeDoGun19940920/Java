package Q_3;
import java.util.StringTokenizer;

public class Example {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("a=3, b=5, c=6", ", ");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			if(st.hasMoreTokens() == false)
				System.out.println("Token 출력이 완료되었습니다.\n");
		}
		
		StringTokenizer st1 = new StringTokenizer("a=3, b=5, c=6","=, ");
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
			
			if(st1.hasMoreTokens() == false)
				System.out.println("Token 출력이 완료되었습니다.");
		}
		
		StringTokenizer st2 = new StringTokenizer("a=3, b=5, c=6","=, ");
		int hap = 0;
		
		while(st2.hasMoreTokens()) {
			String token = st2.nextToken();
			
			if(token.matches("\\d+")) { 
                int num = Integer.parseInt(token); // 문자열을 정수로 변환
                hap += num; // 합산
            }
		}
		System.out.print("합은 " + hap);
	}
}