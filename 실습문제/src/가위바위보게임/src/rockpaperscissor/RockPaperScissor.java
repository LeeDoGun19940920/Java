package rockpaperscissor;
import java.util.Scanner;

public class RockPaperScissor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]\n");
			
			int input = scan.nextInt();
			String personWeapon = null;
			String comWeapon = null;
			
			if(input == 1) {
				//System.out.print("철수(가위)");
				personWeapon = "철수(가위)";
			} else if(input == 2) {
				//System.out.print("철수(바위)");
				personWeapon = "철수(바위)";
			} else if(input == 3) {
				//System.out.print("철수(보)");
				personWeapon = "철수(보)";
			} else if(input == 4) break;
			
			int randomInput = (int)(Math.random()*3) + 1;
			
			if(randomInput == 1) {
				//System.out.print("com(가위)");
				comWeapon = "com(가위)";
			} else if(randomInput == 2) {
				//System.out.print("com(바위)");
				comWeapon = "com(바위)";
			} else if(randomInput == 3) {
				//System.out.print("com(보)");
				comWeapon = "com(보)";
			}

			if(input == randomInput) {
				System.out.println("철수 : 컴퓨터\n" + "비겼습니다.");
			}else if(input == 1 && randomInput == 2) {
				System.out.println(personWeapon + " : " + comWeapon);
				System.out.println(comWeapon + "이/가 이겼습니다.");
			}else if(input == 1 && randomInput == 3) {
				System.out.println(personWeapon + " : " + comWeapon);
				System.out.println(personWeapon + "이/가 이겼습니다.");
			}else if(input == 2 && randomInput == 1) {
				System.out.println(personWeapon + " : " + comWeapon);
				System.out.println(comWeapon + "이/가 이겼습니다.");
			}else if(input == 2 && randomInput == 3) {
				System.out.println(personWeapon + " : " + comWeapon);
				System.out.println(comWeapon + "이/가 이겼습니다.");
			}else if(input == 3 && randomInput == 1) {
				System.out.println(personWeapon + " : " + comWeapon);
				System.out.println(comWeapon + "이/가 이겼습니다.");
			}else if(input == 3 && randomInput == 2) {
				System.out.println(personWeapon + " : " + comWeapon);
				System.out.println(personWeapon + "이/가 이겼습니다.");
			}
			
			System.out.println();
		}
		
	}

}
