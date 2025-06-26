package successOrFail;
import java.util.Scanner;

public class SuccessOrFail {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : "); /* 사용자가 입력하는 점수가 다음 줄에 표시되게하고 싶을 경우
		 										"\n" 을 입력해서 다음 줄에 출력되게 한다. */
		int score = scan.nextInt();
		if(score >= 80) {
			System.out.println("축하합니다. 합격입니다.");
		}
		else {
			System.out.printf("%d점을 받으셨네요. 안되었지만 합격이 아닙니다.", score);
		}
		
		scan.close();
	}
}