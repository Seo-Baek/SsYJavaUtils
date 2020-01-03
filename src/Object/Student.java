package Object;

/*
 * toString() 메소드 재정의
 * 	- Object 클래스에서 상속 받은 메소드 원형을
 * 	   유용한 정보가 리턴되도록 재정의.
 * 	- 해당 클래스의 멤버 변수가 정보를 가지고 있는데
 * 	   저장된 데이터가 올바르게 담겨있는지,
 *    혹은 틀리게 담겨져 있는지 확인하고 싶은 경우
 *    toString() 메소드를 재정의 하여 값을 확인할 수 있음.
 */

public class Student {		// extends Object가 생략

	String name;	// 학생 이름
	int hakbun;		// 학생 학번
	
	public Student() {    }
	
	public Student(String name, int hakbun) {
		this.name = name;
		this.hakbun = hakbun;
	}
	
	@Override
		public String toString() {
			return "학생이름 : " + name + ", 학생 학번 : " + hakbun;
		}
}
