package Object;

/*
 * Object 클래스
 * 	1. java의 모든 클래스의 조상클래스이다.
 * 	2. 사용자가 정의한 클래스에 자동으로 상속이 된다.
 * 		=> 단, extends 키워드를 사용하지 않은 경우
 * 
 * [Object 클래스의 주요 메소드]
 * 	- toString() : 객체를 문자열로 반환.	- 중요 메소드!
 * 	- getClass() : 클래스의 정보를 반환.
 * 	- hashCode() : 객체의 해쉬코드 값을 반환.
 * 	- equals() 	 : 객체의 값을 비교하여 결과(true/false)를 반환.
 * 	- clone()	 : 객체 복제 기능.
 */

public class Ex01_Object{	// extends Object가 생략

	public static void main(String[] args) {
		
		Ex01_Object ex = new Ex01_Object();
		
		// 1. toString()
		//	형식) 패키지명.클래스@16진수
		System.out.println("Object.toString() >>> " + ex.toString());
		
		// 2. getClass()
		//	형식) class.패키지명.클래스명
		System.out.println("Object.toString() >>> " + ex.getClass());
		
		// 3. hashCode()
		//	형식) 상수값
		System.out.println("Object.hashCode() >>> " + ex.hashCode());
	}

}
