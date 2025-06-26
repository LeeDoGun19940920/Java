package 배열형객체;
import java.util.Scanner;
// utility class "Scanner"를 패키지로 부터 불러온다.ㅏ

// 제목과 저자를 가진 객체 2개 생성 후 2개의 인덱스에 저장.
class Book {
	String title;
	String author;
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public String toString() {
	    return title + " " + author;
		//System.out.println(title + " " + author); 사용 불가능
	}
}

public class BookArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Book[] c = new Book[2]; // 인덱스가 2개인 배열형 객체 한 개 생성
		
		for(int i = 0; i < c.length; i++) {
			System.out.print("제목 입력 : ");
			String t = scan.nextLine();
			System.out.print("저자 입력 : ");
			String a = scan.nextLine();
			
			c[i] = new Book(t, a);
		}
		
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		scan.close();
	}
}
