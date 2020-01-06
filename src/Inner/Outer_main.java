package Inner;

public class Outer_main {

	public static void main(String[] args) {
		
		// 중첩클래스의 객체 생성 방법
		// 먼저는 외부(Outer) 클래스의 객체 생성
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		
		in.prn();
		
		
		
	}

}
