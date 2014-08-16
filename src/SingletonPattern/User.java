package SingletonPattern;

public class User {
	
	//make constructor private
	private User() {
		
	}
	
	public static User getInfo(){
		
		return new User();
	}
	
	public String getName(){
		
		
		return "LeeHey";
	}
	
	
}
