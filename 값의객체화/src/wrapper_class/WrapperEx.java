package wrapper_class;

public class WrapperEx {
	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A'));
		
		char c1 = '4';
		char c2 = 'F';
		
		if(Character.isDigit(c1)) {
			System.out.println(c1 + "은 숫자");
		}
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2 + "은 영문자");
		}
		
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.toHexString(28));
		System.out.println(Integer.bitCount(28));
		
		Double d = Double.valueOf(3.14);
		// System.out.println() 메서드는 자동으로 객체의 toString() 메서드를 호출하여 반환된 문자열을 출력하기 때문
		System.out.println(d); // System.out.println(d.toString);
		System.out.println("객체의 주소값 출력");
		System.out.println(System.identityHashCode(d));
		System.out.println(Double.parseDouble("3.14"));
		
		boolean b = (4>3);
		System.out.println(Boolean.valueOf(b));
		System.out.println(Boolean.parseBoolean("false"));
	}

}
