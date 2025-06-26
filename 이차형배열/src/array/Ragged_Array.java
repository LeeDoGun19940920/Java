package array;

public class Ragged_Array {

	public static void main(String[] args) {
		int intArray[][] = new int[4][]; // ragged array 이기에 field 수는 모른다.
		intArray[0] = new int[3]; // 배열 크기를 나타내는 의미와 인덱스 번호를 나타내는 의미를 혼동하지 마라.
		intArray[1] = new int[2];
		intArray[2] = new int[4];
		intArray[3] = new int[2];
		
		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = (i+1)*10+j;
				System.out.print(intArray[i][j] + " ");
			}
			System.out.print("\n");
			//System.out.println();
		}
	}
}
