package String;

/*
 * String 클래스의 특징
 * 	1. 문자열 객체를 처리하는 클래스.
 * 	2. 객체생성방법(2가지)
 * 		1) 일반 변수 선언 방법으로 객체 생성
 * 			예) String str = "홍길동";
 * 			   String str1 = "홍길동";
 * 		2) new 키워드를 이용하는 방법
 * 			예) String str2 = new String("홍길동");	
 * 	3. equals() : 객체의 내용(데이터)를 대상으로 비교하여
 * 				   같으면 true, 틀리면 false 값을 반환하는 메소드.
 * 				   예) if(str.equals(str2)) {   }
 */

public class Ex01 {

	public static void main(String[] args) {
		
		// 1) 일반 변수 선언 방법으로 객체 생성
		String str = "홍길동";
		String str1 = "홍길동";
		
		if(str == str1) {
			System.out.println("참조하는 주소가 같다.");
		} else {
			System.out.println("참조하는 주소가 다르다.");
		}
		System.out.println("str 주소 ==> " + System.identityHashCode(str));
		System.out.println("str1 주소 ==> " + System.identityHashCode(str1));
		System.out.println();
		
		String str2 = new String("이순신");
		String str3 = new String("이순신");

		if(str2 == str3) {
			System.out.println("참조하는 주소가 같다.");
		} else {
			System.out.println("참조하는 주소가 다르다.");
		}
		System.out.println("str2 주소 ==> " + System.identityHashCode(str2));
		System.out.println("str3 주소 ==> " + System.identityHashCode(str3));
		
		if(str2.equals(str3)) {
			System.out.println("값이 같다.");
		} else {
			System.out.println("값이 다르다.");
		}
		
	}

}
