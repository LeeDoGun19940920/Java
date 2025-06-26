package multipleOfThree;
import java.util.Scanner;

public class NestedIf {
	static int year;
	static int score;
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		score = scan.nextInt();
		
		System.out.println("학년을 입력하세요 : ");
		year = scan.nextInt();
		
		if(year != 4 && score >= 70)
		{
			System.out.printf("%d 점수로 합격하셨습니다.", score);
			
			if(year == 4 && score >= 80) 
			{
				System.out.printf("%d 점수로 합격하셨습니다.", score);
			}
			else
			{
				System.out.println("불합격 입니다.");
			}
		}
		else if(year != 4 && score <= 69 && score >=50)
		{
			System.out.println("다시 시험볼 기회를 드릴게요");
		}
		else
		{
			System.out.println("불합격 입니다.");
		}
	}
}