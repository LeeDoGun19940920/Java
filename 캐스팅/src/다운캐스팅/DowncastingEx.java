package 다운캐스팅;

import java.util.Scanner;

class Person {
	String name;
	String id;
	
	Person(String name) {
		/* Student 생성자의 지역변수(parameter) "name"과 Person 생성자의 지역변수 "name"은
		 서로 다른 메소드 소속이다.*/
		this.name = name;
	}
	// super(name)에 의해 메모리 초기화 작업이 일어난다.
}

class Student extends Person {
	String grade;
	String department;
	
	public Student(String name) {
		super(name); // Person 클래스 객체 생성.
	}
}

public class DowncastingEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생 이름 :");
		Person p = new Student(scan.next());
		Student s;
		
		s = (Student)p;
		
		System.out.println("학년 입력 :");
		s.grade = scan.next();
		System.out.println("학과 입력 :");
		s.department = scan.next();
		
		System.out.println(s.grade +" "+ s.department);
		}
}