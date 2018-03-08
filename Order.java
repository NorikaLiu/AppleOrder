import java.util.LinkedList;
import java.util.Queue;

public class Order {
	private String CustomerName;
	int year;
	private String Apples; 
	
	public Order (String Name, int years , String AppleTypes) {
	// public static void main(String[] args) {
		CustomerName = Name; 
	     year = years; 
		Apples = AppleTypes; 
	}
	

    public String getApples() {
    	return Apples;
			    }
			
		
	public String getNames() {
		return CustomerName;
	}
	public int getYear() {
		return year;
	}
}
