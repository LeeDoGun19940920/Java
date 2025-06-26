package this사용;

public class Book {
	String title;
	String author;
	
	void show() {
		System.out.println(title + " " + author);
	}
	
	public Book() {
		System.out.println("생성자 호출됨");
	}
	
	public Book(String title) {
		this.title = title;
		System.out.println(this.title + " 작자미상");
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
		Book littleprince = new Book("어린왕자", "생텍쥐페리");
		littleprince.show();
		Book loveStory = new Book("춘향전");
		Book emptyBook = new Book();
		
	}
	
}
