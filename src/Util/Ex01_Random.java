package Util;

import java.util.Random;

/*
 *JAVA API(Application Programming Interface)
 *	- 응용프로그램에서 사용할 수 있도록 운영체제나 프로그래밍 언어가
 *	   제공하는 기능을 제어할 수 있게 한 인터페이스.
 *	- 주로 파일제어, 윈도우 제어, 문자 제어 등을 위한 인터페이스 제공.
 *	- 쉽게 말하면 API란 남들이 만들어 놓은 소스라고 생각하면 됨.
 *	   우리는 이렇게 만들어진 소스의 기능을 활용해서 프로그램을 개발하면 된다. 
 */
/*
 * Util 패키지의 주요 클래스
 * 	1. Random 클래스
 * 		- 임의의 난수를 발생시키는 클래스.
 * 	2. Math 클래스
 * 		- 수학 관련 메소드를 제공해주는 클래스.
 * 	3. Calendar 클래스
 * 		- 날짜 /시간 관련 정보를 제공해주는 클래스.
 * 	4. Arrays 클래스
 * 		- 배열 객체를 처리하는 클래스.
 */
/*
 * 1. Random 클래스
 * 	- 지정한 범위 내에서 임의의 난수를 발생시키는 클래스.
 * 	- 활용분야 : 게임, 확률 등에서 활용.
 */

public class Ex01_Random {
	
	public static void main(String[] args) {
		
		//로또 번호를 만들어 보자.
		Random random = new Random();
		int num = 0;
		int[] lotto = new int[6];
		
		//중복이 발생하는 로또 번호
		for(int i = 1; i <= 6; i++) {
			// 형식) nextInt(가장 큰 수) + 시작 수
			// 로또 1 ~ 45 사이의 난수
			num = random.nextInt(45) + 1;
			System.out.print(num + "\t");
		}
		System.out.println();
		
		// 중복이 발생하지 않도록 로또를 만들어보자.
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			if(i > 0) {
				for(int j = 0; j < i; j++) {
					if(lotto[i] == lotto[j]) {	// 중복인 경우
						lotto[i] = random.nextInt(45) + 1;
						j = -1;	// j 초기화
					}
				}
			}
			System.out.print(lotto[i] + "\t");
		}
		System.out.println();
	}

}
