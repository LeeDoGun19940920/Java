package Math;
import java.util.Random;

public class MathEx {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.abs(3.14));
		System.out.println(Math.exp(2));
		System.out.println(Math.ceil(Math.PI));
		
		System.out.println("이번주 로또번호");
		
		Random r = new Random();
		
		for(int i = 0; i < 6; i++) {
			System.out.print(r.nextInt(45) + 1); // 45 미만인 0 ~ 44 까지의 값이 출력 되므로 +1을 해주어야 한다.
			if(i < 5)
				System.out.print(", ");
		}
		
		System.out.println();
		
		for(int i = 0; i < 6; i++) {
			System.out.print((int)(Math.random()*45) + 1);
			if(i < 5) {
				System.out.print(", ");
			}
		}
	}
}