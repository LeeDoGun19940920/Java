package Switch문;
import java.util.Scanner;

public class GradleSwtich {
	static int score;
	static String grade;
	
	public static void main(String[] args) { // GradleSwitch class 소속인 main 메소드
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		score = scan.nextInt();
		
		switch(score/10) {
			case 10:
				grade = "A+";
				break;
				
			case 9:
				grade = "A";
				break;
				
			case 8:
				grade = "B";
				break;
				
			case 7:
				grade = "C";
				break;
				
			case 6:
				grade = "D";
				break;
				
			default :
				grade = "F";
				break;
		}
		System.out.printf("학생의 점수 : %d\n", score);
		System.out.printf("학생의 학점 : %s", grade);
		
		scan.close();
	}
}
