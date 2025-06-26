package inherit;

class Person {
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void print() {
		System.out.println(weight);
		System.out.println(age);
		System.out.println(this.height);
		System.out.println(this.name);
	}
}

class Student extends Person {
	public void set() {
		age = 30;
		name = "이도건";
		height = 170;
		//weight = 99; -> 범위가 private 이므로 접근이 불가능하다.
		setWeight(99);
	}
}

public class InheritanceEx {
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
		s.print();
	}
}