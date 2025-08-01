package practiceScanner;
import java.util.Scanner;

public class ScannerEX {
	public static void main(String[] args) {
		
		System.out.println("이름, 도시, 나이. 체중. 독신 여부를 빈칸으로 분리하여 입력하세요");
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next(); // Scanner class를 instance화 했기에, reference variable 인 scan을 사용한다.
		System.out.println("이름은 " + name + ",");
		
		String city = scan.next();
		System.out.print("도시는 " + city + ",");
		
		int age = scan.nextInt();
		System.out.print("나이는 " + age + ",");
		
		double weight = scan.nextDouble();
		System.out.print("체중은 " + weight +",");
		
		boolean marry = scan.nextBoolean();
		System.out.print("독신여부는 " + marry + ".");
		
		scan.close();
	}
}
