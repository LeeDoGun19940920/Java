package 자바프로그래밍_P238_N8;

import java.util.Scanner;

class Power {
	public int kick;
	public int punch;
	
	Power() {
		System.out.println("객체가 생성 되었습니다.");
	}
	
	void input(int kick, int punch) {
		this.kick = kick;
		this.punch = punch;
		
		System.out.println("robot 객체의 속성에 원소가 대입되었습니다.");
		System.out.println(this.kick + ", " + this.punch);
	}
	
	Power(int kick, int punch) {
		this.kick = kick;
		this.punch = punch;
		
		System.out.println("robot1 객체의 속성에 원소가 대입되었습니다.");
		System.out.println("객체가 생성 되었습니다.");
		System.out.println(this.kick + ", " + this.punch);
	}
}

public class Example {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Power robot = new Power();
		robot.input(10, 20);
		
		Power robot1 = new Power(scan.nextInt(), scan.nextInt());
	}
}
