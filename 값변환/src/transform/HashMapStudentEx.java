package transform;
import java.util.*;

class Student {
	private int id;
	private String tel;
	public Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
		
		System.out.println("학생이 생성 되었습니다. " + this.id);
	}
	// id와 tel이 private로 선언 되었기에 getter 필요
	public int getId() {
		return id;
	}
	
	public String getTel() {
		return tel;
	}
}

public class HashMapStudentEx {
	public static void main(String[] args) {
		// 금고 생성
		HashMap<String, Student> hm = new HashMap<String, Student>();
	//	hm.put(String key, Student value)
		hm.put("황기태", new Student(01, "010-3072-7795")); // value에는 Student class를 사용한 객체 생성을 한다.
		hm.put("이도건", new Student(02, "010-4651-1576"));
		hm.put("문덕호", new Student(03, "010-1577-9588"));
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("검색할 이름?");
			String name = scan.next();
			if(name.equals("exit")) { // name.equals(anObject);
				break;
			}else {
			Student student = hm.get(name); // key 값을 대입했을 때 나오는 value를 reference 변수에 대입
			
			if(student == null) {
				System.out.println(name + " 이라는 사람은 없습니다.");
				} else {
					System.out.println("id:" + student.getId() + ", 전화:" + student.getTel());
				}
			}
		}
		scan.close();
	}
}
