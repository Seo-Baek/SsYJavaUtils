package Static;

public class Company {	// 싱글턴 패턴!

	private static Company instance = new Company();
	
	private Company() {    }
	
	public static Company getInstance() { 
		if(instance == null) {
			instance = new Company();
		}
		
		return instance;
	};
	
}
