package 예외처리;

public class NumException {
	public static void main(String[] args) {
		String[] stringNumber = new String[4];
		stringNumber[0] = "23";
		stringNumber[1] = "12";
		stringNumber[2] = "3.141592";
		stringNumber[3] = "998";
		
		int i = 0;
		try {
			for(i = 0; i < stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("정수로 변환된 값은 : " + j);
			}
		}catch(NumberFormatException e) {
			System.out.println(stringNumber[i] + "은 정수로 변환 못 합니다.");
		}
	}
}
