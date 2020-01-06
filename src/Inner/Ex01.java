package Inner;

public class Ex01 {

	public static void main(String[] args) {
		
		Sub sub = new Sub();
		System.out.println("sum ==> " + sub.sum(200,25));
		System.out.println("minus ==> " + sub.minus(127, 15));
		
		// 무명클래스(Anonymous Class) 선언
		Inter in =  new Inter() {
			
			@Override
			public int sum(int n1, int n2) {
				return n1 + n2;
			}
			
			@Override
			public int minus(int n1, int n2) {
				return n1 - n2;
			}
		};
		
		System.out.println("sum ==> " + in.sum(200, 25));
		System.out.println("minus ==> " + in.minus(127, 15));
		
		
	}

}
