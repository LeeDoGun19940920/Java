package multipleOfThree;
import java.util.Scanner;

public class Grading {
	static char grade; // variable "grade"를 "Grading" class의 자체 변수로 정적 변화 시켰다.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt(); // "scan" instance에 입력 된 정수 값을 반환;
		
		System.out.printf("입력된 정수는 %d입니다.\n\n", score);
		
		if(score >= 90) 
		{	
			grade = 'A';
			System.out.printf("좋은 점수를 받으셨네요. %c학점 입니다.", grade );
		}
		else if(score >= 80)
		{
			grade = 'B';
			System.out.printf("괜찮은 점수에요. %c학점 입니다.", grade);
		}
		else if(score >= 70)
		{
			grade ='C';
			System.out.printf("조금만 더 화이팅. %c학점 입니다.", grade);
		}
		else if(score >= 60)
		{
			grade ='D';
			System.out.printf("노력하세요. %c학점 입니다.", grade);
		}
		else
		{
			grade= 'F';
			System.out.printf("볼 가치도 없네요. %c학점 입니다.", grade);
		}
		
		scan.close();
	}
}
