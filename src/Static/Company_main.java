package Static;

public class Company_main {

	public static void main(String[] args) {
		
		// private 접근지정자로 생성자가 선언이 되어 있으므로
		// 외부에서 객체 생성이 불가능.
		//Company com1 = new Company();
		//Company com2 = new Company();
		//Company com3 = new Company();
		//Company com4 = new Company();
		//Company com5 = new Company();
		
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		Company com3 = Company.getInstance();
		Company com4 = Company.getInstance();
		Company com5 = Company.getInstance();
		
		System.out.println("com1 ==> " +com1);
		System.out.println("com2 ==> " +com2);
		System.out.println("com3 ==> " +com3);
		System.out.println("com4 ==> " +com4);
		System.out.println("com5 ==> " +com5);
		
		
		
	}
}
