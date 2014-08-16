package PrototypePattern;

public abstract class Security implements Cloneable{
	
	private String securityID;
	protected String type;
	
	public String getType(){
		
		return this.type;
	}
	
	public String getID(){
		return securityID;
	}
	
	public void setID(String id){
		
		this.securityID = id;
	}
	
	public Object clone() {
	      
		Object clone = null;
	    
		try {
			clone = super.clone();
	    } catch (CloneNotSupportedException e) {
	        e.printStackTrace();
	    }
	    
		return clone;
	 }
	
}
