package 원객체생성;

import java.util.Scanner;

class Rectangle {
	int width;
	int height;
	public int getArea() {
		return height*width;
		// 넓이 메소드
	}
}

public class RectApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 값 입력을 위한 스캐너 객체 생성
		Rectangle rect = new Rectangle();
				
		System.out.print("높이 : ");
		rect.height = scan.nextInt();
		
		System.out.print("길이 : ");
		rect.width = scan.nextInt();
		
		System.out.println("구하려는 사각형의 넓이는 : " + rect.getArea() + " 입니다.");
		scan.close();
	}

}
