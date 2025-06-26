package this사용;

public class Book2 {
	String title;
	String author;
	
	void show() {
		System.out.println(title + " " + author);
	}
	
	public Book2() {
		this("다른 생성자 호출","확인 가능");
		System.out.println("생성자 호출됨");
	}
	
	public Book2(String title) {
		this(title, "작자미상");
	}
	
	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
		Book2 littleprince = new Book2("어린왕자", "생텍쥐페리");
		littleprince.show();
		
		System.out.println("==============================");
		Book2 loveStory = new Book2("춘향전");
		
		Book2 emptyBook = new Book2();
		System.out.println("==============================");
		
		loveStory.show();
		System.out.println("==============================");
		
		emptyBook.show();
	}
}
