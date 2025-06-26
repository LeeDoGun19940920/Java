package 예외처리;

public class CheckedExcetionError {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 100; i++) {
			System.out.printf("%d", i);
			Thread.sleep(1000);
		}
	}
}
/*
 			try {	
                System.out.printf("%d", i);
                Thread.sleep(1000);  // InterruptedException 처리 필요
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
                Thread.currentThread().interrupt();  // 예외 처리 후 스레드 상태 복원
            }
*/