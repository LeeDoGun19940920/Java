package linkedList;
import java.util.*;

class IteratorEx {
	static void printList(LinkedList<String> l) {
		
		Iterator<String> i = l.iterator(); // LinkedList collection을 훓어주는 경비원(반복자) 객체 반환
		// i에 대입 된 객체는 collection을 훓을 수 있는 능력을 가진 객체이다.
		//
		while(i.hasNext()) {
			String e = i.next();
			String separator;
			if(i.hasNext()) {
				separator = "->";
			}else {
				separator = "\n";
			}
			System.out.print(e + separator);
		}
	}
}

public class CollectionsEx {
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		
		IteratorEx iterator = new IteratorEx();
		
		Collections.sort(myList);
		iterator.printList(myList);
		
		myList.add(0, "터미네이터");
		myList.add(2, "아바타");
		
		Collections.reverse(myList); // 인덱스 자체의 위치가 바뀌는 것은 아니다6ㅕ
		iterator.printList(myList);
		
		int index = Collections.binarySearch(myList, "아바타");
		System.out.println("아바타는 " + index + "번째 요소입니다.");
	}
}