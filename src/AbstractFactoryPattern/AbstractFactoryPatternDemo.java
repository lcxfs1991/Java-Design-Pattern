package AbstractFactoryPattern;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractFactory toolFactory = new MarketFactory();
		
		System.out.println(toolFactory.getToolValue("stock"));
		
		AbstractFactory currencyFactory = new CurrencyFactory();
		System.out.println(currencyFactory.getCurrencyValue("RMB"));
	}

}
