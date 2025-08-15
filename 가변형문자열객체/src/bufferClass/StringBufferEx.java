package bufferClass;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		
		sb.append(" is pencil");
		System.out.println(sb);
		
		sb.insert(7, " my");
		System.out.println(sb);
		
		sb.replace(8, 10, "your"); // 8, 9 인덱스 값 대체
		System.out.println(sb);
		
		sb.delete(8, 13); // 8 ~ 12 인덱스 값 삭제
		System.out.println(sb);
		
		sb.setLength(6); // 문자열 길이 수정
		System.out.println(sb);
	}
}
