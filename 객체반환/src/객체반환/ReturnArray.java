package 객체반환;

public class ReturnArray {
	static int[] makeArray() { // return type이 int[] 형이다.
		int temp[] = new int[4]; //크기가 4인 배열형 객체 생성 후 temp 레퍼런스 변수에 객체 참조 시킨다.
		for(int i = 0; i < temp.length; i++)
			temp[i] = i;
		return temp; // 생성된 temp 객체를 반환한다. 
	}
	
	public static void main(String[] args) { // 반환값이 없는 ReturnArray 클래스 소속인 main method
		int[] intArray =  makeArray(); // 메소드 호출 후 반환값(temp 객체)을 intArray 변수에 대입 
		for(int i = 0; i < intArray.length; i++)
			System.out.print(intArray[i] + " "); // 배열형 객체의 각 행에 담긴 값을 출력.
		// System.out.println(intArray[i] + " "); 출력 후 enter키 삽입 
	}
}