package Inner;

/*
 * 람다(Lambda)
 * 	- java SE 8.0에 추가된 기능.
 * 	- 한 개의 메소드를 갖는 인터페이스만 사용 가능.
 * 	- 메소드 이름 생략(메소드가 1개이므로)
 * 	- 매개변수, 리턴타입 생략
 * 	- 형식) 참조변수 = (매개변수) -> 리턴값
 */

public interface InterA {
	
	int sum(int n1, int n2);	// 한 개의 추상메소드
}
