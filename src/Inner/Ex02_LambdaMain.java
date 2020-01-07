package Inner;

public class Ex02_LambdaMain {

	public static void main(String[] args) {
		
		Inter_I in = new Inter_I() {
			
			@Override
			public int sum(int n1, int n2) {
				return n1 + n2;
			}
		};
		
		System.out.println("sum ==> " + in.sum(200, 100));
		System.out.println();
		
		// 람다식 적용
		Inter_I in2 = (n1 , n2) -> n1 + n2;
		System.out.println("lambda sum ==> " + in2.sum(200, 142));
		
		
	}

}
