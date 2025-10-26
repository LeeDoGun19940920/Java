package compare_length;
import java.util.*;

public class Compare {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>(); // Constructor 호출
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요>> ");
		for(int i = 0; i < 4; i++) { // 초기 Generic 객체의 크기는 4로 설정	
			String s = scan.next();
			// a.add(i, s); 특정 index에 넣고 싶을 때 사용
			a.add(s);
		}
		
		System.out.println("객체의 요소들을 출력 하겠습니다.");
		for(int i = 0; i < a.size(); i++) {
			System.out.println(i+1 + " = " + a.get(i));
		}
		
		int longestIndex = 0;
		for(int i = 1; i < a.size(); i++) {
			if(a.get(0).length() < a.get(i).length()) {
				longestIndex = i;
				break;
			}
		}
		
		System.out.print(a.get(longestIndex));
		
		scan.close();
	}
}
