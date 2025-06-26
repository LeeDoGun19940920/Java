package 자바프로그래밍_P245_N09;

class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for(int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}
		
		return c;
	}
	
	public static void print(int[] a) { // parameter a로 인자 array3을 받는다.
		System.out.print("[ ");
		for(int i = 0; i < a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
	}
}

public class StaticEx {
	public static void main(String[] args) {
		// 배열형 객체 생성
		int[] array1 = {1, 5, 7, 9};
		//System.out.println(array1 instanceof Object);
		int[] array2 = {3, 6, -1, 100, 77};
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}

}
