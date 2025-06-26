package 자바프로그래밍_P247_N12;

import java.util.Scanner;

class Reservation {
	Scanner scan = new Scanner(System.in);
	
	int seattype = 0;
	// 타 method에서도 배열과 변수가 호출 되어야 하므로 static
	static String[] S_name = new String[10]; 
	static int S_seatnumber = 0;
	static String[] A_name = new String[10];
	static int A_seatnumber = 0;
	static String[] B_name = new String[10];
	static int B_seatnumber = 0;
	
	void reset() {
		for(int i = 0; i < S_name.length; i++) {
			S_name[i] = ("--- ");
		}
		
		for(int i = 0; i < A_name.length; i++) {
			A_name[i] = ("--- ");
		}
		
		for(int i = 0; i < B_name.length; i++) {
			B_name[i] = ("--- ");
		}
	}
	
	void input() {
		System.out.print("원하는 좌석 클래스를 선택하세요 : ");
		seattype = scan.nextInt();
		
		if(seattype == 1) {
			System.out.print("S>> ");
			for(int i = 0; i < S_name.length; i++) {
				System.out.print(S_name[i]);
			}
			System.out.println();
			System.out.print("자리 번호>> ");
			S_seatnumber = scan.nextInt();
			
			System.out.print("이름>> ");
			while(true) {
				if(S_name[S_seatnumber].equals("--- ")) {
					S_name[S_seatnumber] = scan.next();
					break;
				} else {
					System.out.println("이미 예약 된 자리입니다.");
				}
			}
		} else if(seattype == 2) {
			System.out.print("A>> ");
			for(int i = 0; i < A_name.length; i++) {
				System.out.print(A_name[i]);
			}
			System.out.println();
			System.out.print("자리 번호>> ");
			A_seatnumber = scan.nextInt();
			
			System.out.print("이름>> ");
			while(true) {
				if(A_name[A_seatnumber].equals("--- ")) {
					A_name[A_seatnumber] = scan.next();
					break;
				} else {
					System.out.println("이미 예약 된 자리입니다.");
				}
			}
		} else if(seattype == 3) {
			System.out.print("B>> ");
			for(int i = 0; i < B_name.length; i++) {
				System.out.print(B_name[i]);
			}
			System.out.println();
			System.out.print("자리 번호>> ");
			B_seatnumber = scan.nextInt();
			
			System.out.print("이름>> ");
			while(true) {
				if(B_name[B_seatnumber].equals("--- ")) {
					B_name[B_seatnumber] = scan.next();
					break;
				} else {
					System.out.println("이미 예약 된 자리입니다.");
				}
			}
		}
	}
}

class Search {
	// i는 for 문의 지역변수 이므로, int를 변수 앞에 작성해 주어야한다.
	void output() {
		System.out.print("S>> ");
		for(int i = 0; i < Reservation.S_name.length; i++) {
			System.out.print(Reservation.S_name[i]);
		}
		System.out.println();
		
		System.out.print("A>> ");
		for(int i = 0; i < Reservation.A_name.length; i++) {
			System.out.print(Reservation.A_name[i]);
		}
		System.out.println();
		
		System.out.print("B>> ");
		for(int i = 0; i < Reservation.B_name.length; i++) {
			System.out.print(Reservation.B_name[i]);
		}
		System.out.println();
	}
}

class Cancel {
	Scanner scan = new Scanner(System.in);
	
	// 반복문, 생성자, 제어문 등은 메소드가 절대 아니며, 명령어 라고 한다.
	void delete() {
		System.out.println("좌석 S:1, A:2, B:3");
		System.out.print("예약 된 좌석을 선택하세요 : ");
		int seat = scan.nextInt();
		
		if(seat == 1) {
			for(int i = 0; i < Reservation.S_name.length; i++) {
				System.out.print(Reservation.S_name[i]);
			}
			System.out.println();
			
			System.out.print("이름 ");
			String name = scan.next();
			
			for(int i = 0; i < Reservation.S_name.length; i++) {
				if(Reservation.S_name[i].equals(name)) {
/* Reservation.S_name[i] == name 을 할 경우 두 비교 대상들에 저장된 주소값들을 비교하는 의미가 된다.
 	각 비교대상에 저장된 값을 속성값이 아닌 주소값이 저장 되어 있는 상태이며, 실제로는 heap 영역에 속성 값이
 	저장 되어 있기 때문이다!!!(매우 중요) */
					Reservation.S_name[i] = "--- ";
				}
			}
		} else if(seat == 2) {
			for(int i = 0; i < Reservation.A_name.length; i++) {
				System.out.print(Reservation.A_name[i]);
			}
			System.out.print("이름 ");
			String name = scan.next();
			
			for(int i = 0; i < Reservation.A_name.length; i++) {
				if(Reservation.A_name[i].equals(name)) {
					Reservation.A_name[i] = "--- ";
				}
			}
		} else if(seat == 3) {
			for(int i = 0; i < Reservation.B_name.length; i++) {
				System.out.print(Reservation.B_name[i]);
			}
			System.out.print("이름 ");
			String name = scan.next();
			
			for(int i = 0; i < Reservation.B_name.length; i++) {
				if(Reservation.B_name[i].equals(name)) {
					Reservation.B_name[i] = "--- ";
				}
			}
		}
	}
}

public class Concert {
	
	/* Scanner scan = new Scanner(System.in); - Scanner 객체가 생성 되기 전에 
	select field가 프로그램 실행과 동시에 클래스 단위로 Method Area에 저장 되므로 오류가 발생한다. */
	static int select;

	public static void main(String[] args) { // static으로 지정 되었기에 가장 먼저 실행되는 메소드
		Scanner scan = new Scanner(System.in);
		
		Reservation r = new Reservation();
		Search s = new Search();
		Cancel c = new Cancel();
		
		r.reset();
		
		while(true) {
			System.out.println("명품콘스트홀 예약 시스템입니다.");
			// 시스템 항목 나열
			System.out.println("예약:1, 조회:2, 취소:3, 끝내기:4");
			// 좌석 항목 나열
			System.out.println("좌석구분 S(1), A(2), B(3)");
			// 원하는 항목 입력
			System.out.print("원하는 작업이 무엇인가요? ");
			// 작업 선택하기
			Concert.select = scan.nextInt();
			
			if(Concert.select == 1) {
				r.input(); // 예약
			} else if(Concert.select == 2) {
				s.output(); // 예약 현황 조회
			} else if(Concert.select == 3) {
				c.delete(); // 예약 취소
			} else if(Concert.select ==4) {
				System.out.println("프로그램 종료합니다.");
				System.exit(0);
			} else {
				System.out.println("없는 항목입니다. 다시 선택하세요.");
			}
			System.out.println();
		}
	}
}