package Wrapper;

/*
 * Wrapper Class
 * 	- wrap : 감싸다, 포장하다.
 * 	- 기본자료형을 클래스 타입으로 포장해 놓은 클래스.
 * 	- 기본 타입의 값을 내부에 두고 포장하기 때문에 포장(wrapper) 객체 라고 함.
 * 	- 기본자료형 : byte, short, long, float, double, boolean, char, int
 * 	- wrapper class : Byte, Short, Long, Float, Double, Boolean,
 * 					  Character, Integer
 * 	- wrapper class 사용 이유
 * 		1. 매개변수로 객체가 요구될 때
 * 		2. 기본형 값이 아닌 객체로 저장해야 할 때
 * 		3. 객체간 비교가 필요할 때
 * 		4. 형변환이 자유로운 것이 특징.	- 가장 큰 장점
 */

public class Ex01 {

	public static void main(String[] args) {
		
		// 박싱(Boxing) 		: 기본자료형 -> 클래스형(wrapper class)
		// 언박싱(UnBoxing) 	: 클래스형(wrapper class) -> 기본자료형 
		int su = 100;
		Integer in = new Integer(su);
		
		System.out.println(in + 35);
		
		System.out.println("int 형 ==> " + in.intValue());
		System.out.println("float 형 ==> " + in.floatValue());
		
		// 숫자 -> 문자열 : toString()
		String str = in.toString();
		System.out.println(str + 25);
		
		// 문자열 -> 숫자 : parseInt()
		// str : "100"
		int i = Integer.parseInt(str);
		System.out.println(i + 40);	  // 140
		
	}

}
