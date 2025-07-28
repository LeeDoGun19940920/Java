package 환전시스템;
import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() { // 상속되는 method;
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() +"을 입력하세요>> ");
		double val = scanner.nextDouble(); // 원화 입력;
		double res = convert(val); // convert method 호출, arguments로 val 변수값 전달;
		System.out.println("변환 결과: " + res + getDestString() + "입니다.");
		scanner.close();
	}
}

public class Won2Dollar extends Converter {
	int won;
	
	Won2Dollar(int won) {
		super();
		this.won = won; // field 초기화
	}
	
	@Override
	protected double convert(double src) { // src로 대입 되는 val 변수값;
		return src/won; // return 되는 값은 local variable인 res로 전달;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}
	
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}
}