package BuilderPattern;

public abstract class Security implements MarketTool{
	
	@Override
	public Package percentage(){
		
		return new RiskPackage();
		
	}
	
	@Override
	public abstract float getValue();
}
