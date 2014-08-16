package SingletonPattern;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user = User.getInfo();
		
		System.out.println(user.getName());

	}

}
