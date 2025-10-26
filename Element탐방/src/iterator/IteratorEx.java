package iterator;
import java.util.*;

public class IteratorEx {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>(); // 객체를 담을 서랍장 준비
		
		a.add(4);
		a.add(3);
		a.add(-1);
		a.add(2, -100);
		
		Iterator<Integer> it = a.iterator();
		while(it.hasNext()) { // Iterator<Integer>형 서랍장에 객체를 담을 수 있으면
			int n = it.next();
			System.out.println(n);
		}
		
		int sum = 0;
		it = a.iterator(); // method 호출 시 return new Itr()
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("Element의 총 합은? : " + sum);
	}

}
