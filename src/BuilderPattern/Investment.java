package BuilderPattern;
import java.util.ArrayList;
import java.util.List;

public class Investment {
	
	private List<MarketTool> Tools = new ArrayList<MarketTool>();
	
	public void addItem(MarketTool tool){
	      Tools.add(tool);
	   }

	   public float getTotalValue(){
	      float value = 0.0f;
	      for (MarketTool tool : Tools) {
	         value += tool.getValue();
	      }		
	      return value;
	   }

	   public void showItems(){
		   
	      for (MarketTool tool : Tools) {
	         System.out.print("Item : "+tool.getName());
	         System.out.println(", Price : "+tool.getValue());
	         System.out.println(", Percentage : "+tool.percentage().percentage());
	      }		
	   }	
	
}
