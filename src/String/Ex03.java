package String;

/*
 * String 클래스의 단점
 * 	- 빈번한 문자열 연산을 실행할 경우 메모리(heap)을 많이 차지하게 된다.
 * 	- 매번 연산 시 새로운 객체를 생성.
 * 		=> 힙(heap) 영역의 과부하가 발생할 가능성이 많음.
 * 	- 이러한 단점을 개선한 클래스가 등장 : StringBuffer 클래스
 */

public class Ex03 {

	public static void main(String[] args) {
		
		// StringBuffer 클래스의 주요 메소드
		StringBuffer sb = new StringBuffer("java");
		
		// 1. 문자열 추가 : append()
		System.out.println("문자열 추가 후 >>> " + sb.append(" program"));
		System.out.println();
		
		// 2. 문자열 교체 : replace()
		// 		형식) replace(시작index, 끝(-1)index, "교체할 문자열");
		sb.replace(0, 4, "spring");
		System.out.println("문자열 교체 후 >>> " + sb);
		System.out.println();
		
		// 3. 문자열 추출  : substring()
		//		형식) substring(시작index, 끝(-1)index)
		//		형식) substring(시작index)
		StringBuffer sb1 = new StringBuffer("2020/01/03 11:15:24");
		System.out.println("오늘 날짜 >>> " + sb1.substring(0,10));
		System.out.println("오늘 날짜 >>> " + sb1.substring(11));
		
	}

}
