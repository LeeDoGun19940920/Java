package 물고기먹기;
import java.util.Scanner;
import java.util.Random;

abstract class GameObject {
	protected int distance;
	protected int x,y;
	public GameObject(int startX, int startY, int distance) { // constructor , 각 객체의 위치와 움직인 거리를 초기화.
		x = startX;
		y = startY;
		this.distance = distance;
	}
	public int getX() {return x;}
	public int getY() {return y;}
	public boolean collide(GameObject p) {
		if(this.x == p.getX() && this.y == p.getY())
			return true;
		else
			return false;
	}
	protected abstract void move();
	protected abstract char getShape();
}

class Bear extends GameObject {
	private static Scanner scan = new Scanner(System.in);
	
	Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}
	
	protected void move() {
		char direction = scan.next().charAt(0); // charAt(0) == String 객체가 가지고 있는 method
				
		switch(direction) {
		case 'a':
			y -= distance; // 1열 뒤로 이동
			break;
		case 's':
			x += distance; // 1행 밑으로 이동
			break;
		case 'd':
			y += distance; // 1행 앞으로 이동
			break;
		case 'w':
			x -= distance; // 1열 위로 이동
			break;
		}
	}
	
	protected char getShape() {
		return 'B';
	}
}

class Fish extends GameObject {
	Fish(int startX, int startY, int distance) {
		super(startX, startY, distance); // parameter가 존재하는 super 클래스 생성자 이므로, 명시적이어야 한다.
	}
	
	protected void move() {
		int direction = (int)(Math.random() * 4);
		
		switch(direction) {
		case 0:
			y -= distance;
			break;
		case 1:
			x += distance;
			break;
		case 2:
			y += distance;
			break;
		case 3:
			x -= distance;
			break;
		}
	}
	
	protected char getShape() {
		return 'F';
	}
}

public class Game {
	int i = 0;
	int j = 0;
	char[][] map;
	// 각 레퍼런스 변수를 Game 클래스의 member field로 선언.
	// main 함수 내에 레퍼런스 변수를 선언 할 경우, main method 의 local variable 이다.
	Bear bear;
	Fish fish;
	
	void drawMap() {
		for(int b = 0; b < j; b++) {
			for(int a = 0; a < i; a++) {
				map[a][b] = '-';
			}
		}
		if(bear != null && bear.getX() >= 0 && bear.getX() < i && bear.getY() >= 0 && bear.getY() < j) {
			map[bear.getY()][bear.getX()] = bear.getShape();
		}
		
		if(fish != null && fish.getX() >= 0 && fish.getX() < i && fish.getY() >= 0 && fish.getY() < j) {
			map[fish.getY()][fish.getX()] = fish.getShape();
		}
		
		for(int b = 0; b < j; b++) {
			for(int a = 0; a < i; a++) {
				System.out.print(map[a][b]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Game game = new Game();
		
		System.out.println("** Bear의 Fish 먹기 게임을 시작합니다.");
		
		System.out.println("Map의 행수 입력");
		game.i = scan.nextInt();
		
		System.out.println("Map의 열수 입력");
		game.j = scan.nextInt();
		
		game.map = new char[game.i][game.j]; // 행과 열의 값을 초기화 해준 후, 배열형 객체 생성 선언
		game.drawMap();
		System.out.println("게임판 완성 되었습니다.");
		
		System.out.println("\n--- 각 객체가 존재하는 게임판을 생성합니다. ---\n");
		// game 클래스 내부 field 인 레퍼런스 변수를 의미하는 거다. 온점은 하위를 의미하는 거다.
		game.bear = new Bear(3,5,1); // distance 변수로 전달 받는 값은 이동할 거리를 의미
		game.fish = new Fish(7,8,1);
		game.drawMap();
		
		System.out.println("\n** Bear의 Fish 먹기 게임을 시작합니다. **");
		
		int count = 1;
		while(true) {
			System.out.println("현재 회차는 " + count + " 회차 입니다.");
			System.out.println("곰의 방향을 선택하세요 : 왼쪽 - a, 아래 - s, 오른쪽 - d, 위 - w");
			game.bear.move();
			// System.out.println("아직 물고기의 움직임에는 변화가 없습니다.");
			
			if(count % 4 == 0 || count % 5 == 0) {
				System.out.println(count + " 회차입니다.");
				System.out.println("물고기의 방향이 정해집니다.");
				game.fish.move();
			}
			
			if(game.bear.getX() > game.i-1 || game.bear.getY() > game.j-1 || game.bear.getX() < 0 || game.bear.getY() < 0 || 
					game.fish.getX() > game.i-1 || game.fish.getY() > game.j-1 || game.fish.getX() < 0 || game.fish.getY() < 0) {
				System.out.print("객체가 영역을 벗어 났습니다.");
				break;
			}
			
			if(game.bear.collide(game.fish)) {
				game.drawMap();
				System.out.print("곰이 물고기를 잡았습니다.");
				break;
			}
			
			game.drawMap();
			count++;
			System.out.println();	}
		
		scan.close();
	}
}