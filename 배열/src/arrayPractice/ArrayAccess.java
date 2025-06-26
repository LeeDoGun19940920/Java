package arrayPractice;
import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
		int[] array = new int[5]; // "array" reference variable 에 크기 5인 배열형 객체가 담긴 메모리공간의 주소값을 참조(대입)
		int max = 0;
		
		System.out.println("5개의 정수를 입력하세요");
		
		for(int i = 0; i < 5; i++)
		{
			array[i] = scan.nextInt();
			
			if(array[i] > max)
				max = array[i];
		}
		System.out.println("가장 큰수는 " + max +"입니다.");
		
		scan.close();
	}
}
