package Util;

import java.util.Calendar;

/*
 * 	3. Calendar 클래스
 * 		- 날짜 /시간 관련 정보를 제공해주는 클래스.
 * 		- Calendar 클래스는 추상클래스임.
 * 		- 추상클래스로 작성된 이유 : 날짜와 시간을 계산하는 방법이 
 *        지역, 문화, 나라마다 다르기 때문.
 *     	- Calendar 클래스에는 날짜와 시간을 계산하는데 
 *        꼭 필요한 메소드나 상수로 구성되어 있음
 *      - 추상클래스이지만 getInstance() 메소드를 이용하여 
 *        시스템의 날짜와 시간 정보를 표현할 수 있음.
 *      - getInstance() : 싱글턴 패턴, 
 *                        하나의 인스턴스만을 가지고 공유해서 사용할 때 쓰는 방법
 *      - 싱글턴 패턴 : 생성자를 private로 선언하여 다른 클래스에서
 *      		       해당 클래스의 인스턴스를 new로 생성하지 못하게하고, 
 *                  getInstance() 메소드를 이용하여 인스턴스를 갖도록 하는 방식.
 *                  자바는 클래스들로 이루어져있고, 매번 새로운 객체를 생성함.
 *                  이렇게 매번 객체를 생성 시 메모리 성능이 느려지는 단점이 발생함.
 *                  하지만 매번 새로운 객체를 생성하는 것이 아닌 한번만 새로운 객체를 생성하고
 *                  그 후에는 모든 클래스들이 동일한 객체(인스턴스)를 써야 하는 경우가 생긴다면
 *                  바로 getInstance() 메소드를 이용하면 된다.
 */

public class Ex03_Calendar {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		// 날짜 정보 확인하는 방법
		int week = cal.get(Calendar.WEEK_OF_YEAR);	// 연에 해당하는 주 확인
		int year = cal.get(Calendar.YEAR);			// 이번 년도
		int month = cal.get(Calendar.MONTH) + 1;	// 이번 달
		int day = cal.get(Calendar.DAY_OF_MONTH);	// 오늘
		System.out.println("이번 주는 1년 52주 중 " + week + "주 입니다.");
		System.out.println("이번 년도는 " + year + "년 입니다.");
		System.out.println("이번 달은 " + month + "월 입니다.");
		System.out.println("오늘은 " + day +"일 입니다.");
		System.out.println("오늘은 " + year + "년 " + month + "월 " + day + "일 입니다.");
		
		// 시간 정보 확인하는 방법
		//  1. 12시간제를 사용하는 방법 - 오전(0), 오후(1)
		//		형식) Calendar.AM_PM
		int num = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);		//시
		int minute = cal.get(Calendar.MINUTE);	//분
		int second = cal.get(Calendar.SECOND);	//초
		
		if(num == 0) {	//오전인 경우
			System.out.println("현재 시간은 오전 "+hour+":"+minute+":"+second);
		} else {
			System.out.println("현재 시간은 오후 "+hour+":"+minute+":"+second);
		}
		
		//  2. 24시간제를 사용하는 방법
		//		형식) Calendar.HOUR_OF_DAY
		int hour1 = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println("현재 시간은 "+hour1+":"+minute+":"+second);
	}

}
