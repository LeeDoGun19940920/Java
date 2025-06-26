package coffeePrice;
import java.util.Scanner;

public class CoffePrice {
	static int charge;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		System.out.print("어떤 커피를 드시겠습니까?\n");
		String order = scan.nextLine();
		
		System.out.print("아메리카노 = 1000, 라떼 = 1500, 바닐라 = 2000, 카푸치노 = 1000 입니다.\n");
		System.out.print("주문을 계속 하시겠습니까?\n");
		
		char select = scan.next().charAt(0);

		if(select == 'Y' || select == 'y') {
			System.out.print("현금을 넣어주세요.\n");
			int money = scan.nextInt();
			
			charge = menu(order, money);
			System.out.print("주문하신 커피는 " + order + "이며, 거스름 돈은 " + charge + " 입니다.\n");
		}
		else {
			System.out.print("안녕히가세요.\n");
		}
		scan.close();
}
		
public static int menu(String coffee, int cash) { // CoffePrice class에 속하는 method 이지만 main문은 하나의 메소드 이므로
												// main문 외부에 menu 메소드를 생성해야 한다.
	switch(coffee) {
	case "아메리카노" :
		charge = cash - 1000;
		return charge;
			
	case "라떼" :	
		charge = cash - 1500;
		return charge;
				
	case "바닐라" :
		charge = cash - 2000;
		return charge;
			
	case "카푸치노" :
		charge = cash - 1000;
		return charge;
			
	default :
		System.out.print("메뉴에 없습니다.\n");
		return 0;
		}
	}
}
