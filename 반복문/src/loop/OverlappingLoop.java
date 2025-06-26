package loop;
import java.util.Scanner;

public class OverlappingLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char school = 0;
		System.out.print("현재 5개의 학교가 있습니다.\n");
		System.out.print("각 학교 마다 학생들은 2명씩 있습니다.\n");

		System.out.print("여기는 학생들의 점수를 입력하는 구간입니다.\n");
		
		System.out.print("우선 학교를 고르세요\n");
		System.out.print("학생들의 점수를 입력하세요\n");
		int a,b,c,d,e,f,g,h,i,j = 0;
		
		for(int k = 0; k < 5; k++)
		{
			school = scan.next().charAt(0);
			
			switch(school)
			{
			case 'A':
				a = scan.nextInt();
				b = scan.nextInt();
				break;
				
			case 'B':
				c = scan.nextInt();
				d = scan.nextInt();
				break;
				
			case 'C':
				e = scan.nextInt();
				f = scan.nextInt();
				break;
				
			case 'D':
				g = scan.nextInt();
				h = scan.nextInt();
				break;
				
			case 'E':
				i = scan.nextInt();
				j = scan.nextInt();
				break;
			}
		}
		
		for(int l = 1; l < 10; l++)
		{
			for(int m = 1; m < 10; m++)
			{
				System.out.print(l + "*" + j + "=" + l*m);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
