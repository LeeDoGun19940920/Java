package transform;
import java.util.*;
// 영어를 한글로 변환
public class HashMapDicEx {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		
		// 3쌍의 객체를 collection에 담는다
		hm.put("baby", "아기"); // hm.put(String key = "baby", String value = "아기");
		hm.put("boy", "소년");
		hm.put("girl", "소녀");
		
		// 사용자로부터 영단어를 입력받고 한글 단어 검색. "exit" 입력 받으면 종료
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("찾고 싶은 단어는?");
			String eng = scan.next(); // String Constant Pool에 저장되는 String Linteral 객체
			if(eng.equals("exit")) { // Object anObject = "exit";
				System.out.println("종료합니다.");
				break;
			}
			
			String kor= hm.get(eng); // Object key = eng; 문자열 객체 재사용 기능과 컬렉션에서의 값변환 기능
			if(kor == null) {
				System.out.println("다른 값을 넣으세요, 없는 key입니다.");
			} else {
				System.out.println(kor);
			}
		}
	}

}
