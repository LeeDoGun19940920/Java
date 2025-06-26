package 원객체생성;

import java.util.Scanner;

public class Book {
	// 생성해야 하는 객체의 생성자를 작성하는 구역
	String title; // Book class의 field
	String author;
	
	Book(String t) {
		title = t;
		author = "작자 미상";
	}
	
	Book(String t, String a) {
		title = t;
		author = a;
	}
	
	public static void main(String[] args) {
		// 생성자 호출하는 메소드를 작성하는 구역
		Scanner scan = new Scanner(System.in);
		
		System.out.println("책 제목과 작가 이름을 적으세요");
		Book littlePrince = new Book(scan.nextLine(), scan.nextLine());
		
		System.out.println("책 제목을 입력하세요");
		Book loveStory = new Book(scan.nextLine());
		
		System.out.print(littlePrince.title + " " + littlePrince.author);
		System.out.print("\n");
		System.out.print(loveStory.title);
		
		scan.close();
	}
}
