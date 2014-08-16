package AbstractFactoryPattern;

import FactoryPattern.Bond;
import FactoryPattern.MarketFactory;
import FactoryPattern.Option;
import FactoryPattern.Stock;

public class CurrencyFactory extends AbstractFactory{
	
	final String USD = "usd";
	final String RMB = "rmb";
	final String HKD = "hkd";
	
	@Override
	public float getCurrencyValue(String CurrencyType){
		
		if (CurrencyType.equalsIgnoreCase(USD)){
			
			Usd currency = new Usd();
			return currency.getValue();
		}
		else if(CurrencyType.equalsIgnoreCase(RMB)){
			
			Rmb currency = new Rmb();
			return currency.getValue();
		}
		else if (CurrencyType.equalsIgnoreCase(HKD)){
			Hkd currency = new Hkd();
			return currency.getValue();
		}
		
		
		return 0f;
	}

	@Override
	public float getToolValue(String ToolType) {
		// TODO Auto-generated method stub
		return 0f;
	}
}
