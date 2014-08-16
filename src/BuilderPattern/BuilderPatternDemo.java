package BuilderPattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InvestmentBuilder builder = new InvestmentBuilder();
		
		Investment portfolioA = builder.InvestmentSafe();
		
		Investment portfolioB = builder.InvestmentRisk();
		
		portfolioA.showItems();
		portfolioA.getTotalValue();
		
		portfolioB.showItems();
		portfolioB.getTotalValue();
	}

}
