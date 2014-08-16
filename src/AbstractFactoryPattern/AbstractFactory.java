package AbstractFactoryPattern;

import FactoryPattern.MarketFactory;

public abstract class AbstractFactory {
	
	abstract float getToolValue(String ToolType);
	
	abstract float getCurrencyValue(String CurrencyType);
}
