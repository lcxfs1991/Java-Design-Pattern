package AbstractFactoryPattern;

import FactoryPattern.Bond;
import FactoryPattern.Option;
import FactoryPattern.Stock;

public class MarketFactory extends AbstractFactory{
	
	final String STOCK = "stock";
	final String BOND = "bond";
	final String OPTION = "option";
	
	@Override
	public float getToolValue(String ToolType){
		
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

	@Override
	float getCurrencyValue(String CurrencyType) {
		// TODO Auto-generated method stub
		return 0;
	}
}
