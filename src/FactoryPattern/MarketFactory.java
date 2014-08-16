package FactoryPattern;

public class MarketFactory {
	
	final String STOCK = "stock";
	final String BOND = "bond";
	final String OPTION = "option";
	
	public float getValue(String ToolType){
		
		if (ToolType.equalsIgnoreCase(STOCK)){
			
			Stock tool = new Stock();
			return tool.getValue();
		}
		else if(ToolType.equalsIgnoreCase(BOND)){
			
			Bond tool = new Bond();
			return tool.getValue();
		}
		else if (ToolType.equalsIgnoreCase(OPTION)){
			Option tool = new Option();
			return tool.getValue();
		}
		
		
		return 0f;
	}
}
