package Inner;

/*
 * 중첩클래스(Inner Class)
 * 	1. 클래스 내부에 또 다른 클래스 선언.
 * 	2. 내부 클래스를 하나의 멤버로 사용하기 위해서
 * 	3. 클래스 멤버 : 멤버변수, 멤버메소드,
 * 				  외부 클래스, 내부 클래스
 * 	4. 내부클래스 객체 생성 방법
 * 		형식)
 * 			외부클래스명.내부클래스명 참조변수 =
 * 						외부 클래스 참조변수.new 내부클래스 생성자();
 * [Inner Class의 특징]
 * 	- 내부클래스는 외부클래스의 멤버를 마치 자기 자신처럼 사용이 가능함.
 * 	   외부 클래스 멤버의 접근지정자가 private 일지라도 접근이 가능함.
 * 	- 내부 클래스의 접근은 반드시 외부 클래스를 통하여 접근해야 함.
 */

public class Outer {	//외부 클래스
	
	int su1 = 10;
	private int su2 = 20;
	public static int su3 = 30;
	
	class Inner {		//내부클래스
		
		public void prn() {
			System.out.println("su1 ==> " + su1);
			System.out.println("su2 ==> " + su2);
		}
	}
	
	static class In {
		public static void prn() {
			//System.out.println("su1 ==> " + su1);
			//System.out.println("su2 ==> " + su2);
			System.out.println("su3 ==> " + su3);
		}
	}
	
}
