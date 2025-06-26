package ragged_array생성;

public class Ragged {
	static int[][] sm(){
		int[][] a = new int[4][];
		a[0] = new int[4];
		a[1] = new int[1];
		a[2] = new int[1];
		a[3] = new int[4];
			
		return a;
		}
	
	public static void main(String[] args) {
		/* 접근 범위는 public, return 값 타입은 void, method 이름은 main, 
		arguments 로는 String[] args 인 메소드 */
		int[][] cm = sm();
		int count = 0;
		
		for(int i = 0; i < cm.length; i++) {
			for(int j = 0; j < cm[i].length; j++) {
				cm[i][j] = count++;
			}
		}
		
		for(int i = 0; i < cm.length; i++) {
			for(int j = 0; j < cm[i].length; j++) {
				System.out.printf("%d",cm[i][j]); 
			}
			System.out.println();
		}
	}
}
