package Util;

/*
 * 2. Math 클래스
 * 	- 수학 관련 메소드를 제공해주는 클래스.
 */

public class Ex02_Math {

	public static void main(String[] args) {
		
		//1. max() 메소드 - 두 수를 비교
		//   min() 메소드 - 두 수를 비교
		int num1 = 57, num2 = 41;
		
		System.out.println("최대값 ==> " + Math.max(num1, num2));
		System.out.println("최소값 ==> " + Math.min(num1, num2));
		
		//2. round() 메소드 - 반올림이 적용되는 메소드
		System.out.println(125.5124);
		System.out.println(Math.round(125.5124));
		System.out.println();
		
		//3. abs() 메소드 - 절대값을 구하는 메소드
		System.out.println("abs ==> " + Math.abs(-125.42));
	}

}
