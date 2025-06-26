package 무기;

class Weapon {
	protected int fire() { // 같은 패키지 내에 존재하는 파일 및 다른 패키지에 존재하는 자식 클래스 까지 접근가능
		return 1;
	}
}

class Cannon extends Weapon {
	 protected int fire() {
		return 10;
	}
}

public class Overriding {
	public static void main(String[] args) {
		Weapon w = new Weapon();
		System.out.println("기본 공격력 : " + w.fire());
		w = new Cannon();
		System.out.println("캐논 공격력 : " + w.fire());
	}

}
