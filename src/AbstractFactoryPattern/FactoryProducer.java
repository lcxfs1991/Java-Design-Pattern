package AbstractFactoryPattern;

public class FactoryProducer {
	   public static AbstractFactory getFactory(String choice){
	      if(choice.equalsIgnoreCase("MARKET")){
	         return new MarketFactory();
	      } else if(choice.equalsIgnoreCase("CURRENCY")){
	         return new CurrencyFactory();
	      }
	      return null;
	   }
	}