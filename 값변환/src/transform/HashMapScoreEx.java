package transform;
import java.util.*;

public class HashMapScoreEx {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>(); // 입력된 String Literal을 Integer로 변환
		
		// 5쌍의 객체 대입
		hm.put("김성동", 97); // Integer wrapper class 이므로, 기존에 존재하는 객체를 재사용
		hm.put("황기태", 88);
		hm.put("김남윤", 98);
		hm.put("이재문", 70);
		hm.put("한원선", 99);
		
		System.out.println("HashMap의 요소 개수 :" + hm.size());
		
		Set<String> keys = hm.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score = hm.get(name);
			System.out.println(name + " : " + score);
		}
	}
}
