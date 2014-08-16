package BuilderPattern;

public class InvestmentBuilder {
	
	public Investment InvestmentSafe(){
		
		Investment investment = new Investment();
		
		investment.addItem(new Stock());
		investment.addItem(new Bond());
		investment.addItem(new MutualFund());
		
		return investment;
		
	}
	
public Investment InvestmentRisk(){
		
		Investment investment = new Investment();
		
		investment.addItem(new Stock());
		investment.addItem(new HedgeFund());
		investment.addItem(new MutualFund());
		
		return investment;
		
	}
	
	
}
