package 과목표;

abstract class PairMap {
	protected String[] keyArray; // 이름을 저장하는 배열
	protected String[] valueArray; // 과목을 저장하는 배열
	abstract String get(String key); // key값을 가진 value 리턴. 없으면 null 리턴
	abstract void put(String key, String value); // key와 value를 쌍으로 저장. 
												// 기존에 key가 있으면, 값을 value로 수정
	
	abstract String delete(String key); // key 값을 가진 아이템(value와 함께) 삭제.
										// 삭제된 value 값 리턴
	
	abstract int length(); // 현재 저장된 아이템의 개수 리턴
}

class Dictionary extends PairMap {
	String[] keyArray;
	String[] valueArray;
	int count = 0;
	
	Dictionary(int x) {
		// 각 배열형 객체 생성, 크기 초기화;
		keyArray = new String[x];
		valueArray = new String[x];
	}

	@Override
	String get(String key) {
		String subject = null;
		
		for(int x = 0; x < keyArray.length; x++) {
			if(keyArray[x] == key) {
				subject = valueArray[x];
				
				break;
			} else {
				subject = null;
			}
		}
		return subject;
	}

	@Override
	void put(String key, String value) { // key == 이름 , value == 과목
		for (int i = 0; i < keyArray.length; i++) {
            if (keyArray[i] != null && keyArray[i].equals(key)) {
                valueArray[i] = value;
                return;
            }
        }
		
		if(keyArray[count] == null && valueArray[count] == null) {
			keyArray[count] = key;
			valueArray[count] = value;
		}
		count++;
	}

	@Override
	String delete(String key) {
		for(int x = 0; x < keyArray.length; x++) {
			if(keyArray[x] == key) {
				keyArray[x] = null;
				valueArray[x] = null;
				
				break;
			}
		}
		return valueArray[count];
	}

	@Override
	int length() {
		int x = 0;
		
		for(int count = 0; count < keyArray.length; count++) {
			if(keyArray[count] != null) {
				x++;
			}
		}
		return x;
	}
	
	void print() {
		for(int count = 0; count < keyArray.length; count++) {
			System.out.print(keyArray[count]);
		}
		System.out.println();
		for(int count = 0; count < valueArray.length; count++) {
			System.out.print(valueArray[count]);
		}
	}
}

public class DictionaryApp {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++");
		dic.print();
		System.out.println();
		System.out.println();
		
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		
		System.out.println();
		dic.print();
		System.out.println();
		System.out.println();

		System.out.println("황기태의 값은 " + dic.get("황기태"));
	}
}