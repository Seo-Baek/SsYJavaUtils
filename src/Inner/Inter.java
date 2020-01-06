package Inner;

/*
 * 다양한 형태의 클래스 선언 방법
 * 	1. 일반적인 선언 방법
 * 		-> 하나의 java 파일에 class 키워드를 작성하여 클래스 선언.
 * 	2. 무명클래스(Anonymous Class) 선언
 * 		-> 이름이 없는 클래스 선언, interface 객체 생성 시 많이 사용됨.
 * 	3. 중첩클래스(Inner Class) 선언
 * 		-> 클래스 안에 또 다른 클래스 선언.
 */

/*
 * 	2. 무명클래스(Anonymous Class) 선언
 * 		- interface와 추상클래스 객체 생성 시 많이 사용됨.
 * 		- 추상메소드의 재정의와 객체 생성을 동시에 하기 때문에 
 * 		   코드의 가독성이 높아진다는 장점이 있다.
 */

public interface Inter {

	int sum(int n1, int n2);	//추상메소드
	int minus(int n1, int n2);	//추상메소드
	
}
