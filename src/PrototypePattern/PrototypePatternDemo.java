package PrototypePattern;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SecurityCache.loadCache();
		
		Security sec1 = SecurityCache.getSecurity("1");
		System.out.println(sec1.getType());
		
		Security sec2 = SecurityCache.getSecurity("2");
		System.out.println(sec2.getType());
		
		Security sec3 = SecurityCache.getSecurity("3");
		System.out.println(sec3.getType());
	}

}
