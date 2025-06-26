package 배열형객체;

public class ArrayPassingEx {
	
	static char[] printArray(char[] pencile) {
		for(int i = 0; i < pencile.length; i++) {
			System.out.print(pencile[i]);
		}
		return pencile;
	}
	
	static char[] switchChar(char[] pencile) {
		for(int i = 0; i < pencile.length; i++) {
			if(pencile[i] == ' ') {
				pencile[i] = '.';
			}
		}
		return pencile;
	}
	public static void main(String[] args) {
		char[] c = {'t','h','i','s',' ','i','s',' ','p','e','n','c','i','l','e'};
		printArray(c);
		switchChar(c);
		System.out.println();
		printArray(c);
	}

}
