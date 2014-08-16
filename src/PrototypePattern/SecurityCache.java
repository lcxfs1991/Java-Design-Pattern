package PrototypePattern;
import java.util.Hashtable;

public class SecurityCache {
	
	private static Hashtable<String, Security> secMap = new Hashtable<String, Security>();
	
	public static Security getSecurity(String secID) {
		
	      Security cachedSec = secMap.get(secID);
	      return (Security) cachedSec.clone();
	}
	
	public static void loadCache() {
		
	      Stock stock = new Stock();
	      stock.setID("1");
	      secMap.put(stock.getID(),stock);
	      
	      Bond bond = new Bond();
	      bond.setID("2");
	      secMap.put(bond.getID(),bond);
	      
	      Option option = new Option();
	      option.setID("3");
	      secMap.put(option.getID(),option);

	      
	 }
	
}
