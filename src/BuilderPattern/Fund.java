package BuilderPattern;

public abstract class Fund implements MarketTool{
	
	@Override
	public Package percentage(){
		
		return new SafePackage();
		
	}
	
	@Override
	public abstract float getValue();
	
}
