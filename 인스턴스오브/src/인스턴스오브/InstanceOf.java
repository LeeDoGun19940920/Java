package 인스턴스오브;

class Person{}
class Student extends Person {}
class Researcher extends Person {}

class ClassCheck {
	void print(Person p) {
		if(p instanceof Person) {
			System.out.println("Person 클래스 객체 주소값 입니다.");
		}
		if(p instanceof Student) {
			System.out.println("Student 클래스 객체 주소값 입니다.");
		}
		if(p instanceof Researcher) {
			System.out.println("Researcher 클래스 객체 주소값 입니다.");
		}
	}
}

public class InstanceOf {
	public static void main(String[] args) {
		
		ClassCheck cc = new ClassCheck();
		/*Student s = new Student();
		Researcher r = new Researcher();*/
		
		cc.print(new Person());
		System.out.println();
		cc.print(new Student());
		System.out.println();
		cc.print(new Researcher());
	}
}
