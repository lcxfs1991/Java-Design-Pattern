package FactoryPattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarketFactory ToolMaker = new MarketFactory();
		System.out.println(ToolMaker.getValue("stock"));
	}

}
