package 자바프로그래밍_P241_N02;

import java.util.Scanner;

class Grade {
	// math, science, english는 Grade 클래스의 field 이다.
	int math;
	int science;
	int english;
	
	Grade(int math, int science, int english) { // math, science, english는 생성자의 지역 변수이다.
		this.math = math;
		this.science = science;
		this.english = english;
		
		System.out.println("객체가 생성되었습니다.");
	}
	float average() {
		return (this.math + this.science + this.english)/3;
	}
}

public class Class {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력");
		
		// math, science, english는 main function의 지역 함수이다.
		int math = scan.nextInt();
		int science = scan.nextInt();
		int english = scan.nextInt();
		Grade me = new Grade(math, science, english);
		
		System.out.println("평균은 " + me.average());
		
		scan.close();
	}

}
