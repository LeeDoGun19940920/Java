package vector_collection;

import java.util.Vector;

// Vector<E>는 배열을 가변 크기로 다룰 수 있게 하고, 객체의 삽입, 삭제, 이동이 쉽도록 구성한 컬렉션 클래스
public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(); // Generic Class
		v.add(5); // v.add(Integer.valueOf(5))
		v.add(4); // index(1)
		v.add(-1); // index(2)
		
		v.add(2, 100); // 2번째 index에 정수값 100 대입
		
		System.out.println("벡터 내의요소 객체수 : " +v.size()); // 총 4개의 정수값 대입한 상태
		System.out.println("벡터의 현재 용량 : " + v.capacity()); // 생성된 Vector Collection의 수용할 수 있는 객체수
		
		for(int i = 0; i < v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		// 벡터 속의 모든 정수 더하기
		int sum = 0;
		for(int i = 0; i < v.size(); i++) {
			//sum += v.get(i);
			int n = v.elementAt(i);
			sum += n;
		}
		System.out.println("벡터 클래스 내부에 존재하는 값들의 합 : " + sum);
	}
}