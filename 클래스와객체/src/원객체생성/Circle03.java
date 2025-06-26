package 원객체생성;

public class Circle03 {
    private double radius;

    public Circle03(double radius) {
        this.radius = radius;
    }

    // 현재 객체를 반환하는 메소드
    public Circle03 getMe() {
        return this;  // 현재 Circle 객체의 참조값을 반환
    }

    public static void main(String[] args) {
        // Circle 객체 인스턴스화
        Circle03 myCircle = new Circle03(5.0);

        // getMe() 메소드 호출
        Circle03 anotherCircle = myCircle.getMe();
        // Circle03 객체의 주소값 대입
        
        // 두 객체가 같은 객체를 참조하는지 확인(두 레퍼런스 변수에 담긴 값이 같은 주소값인지 확인)
        System.out.println(myCircle == anotherCircle);  // true 출력 (같은 객체를 참조)
    }
}
// this를 이용한 객체 자기 자신의 주소값 반환하는 방법