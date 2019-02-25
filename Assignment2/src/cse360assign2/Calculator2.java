/**Name: Daniel Martinez
 *Class ID: 475
 *Assignment #: 2
 *Description: This is going to be assignment number 2 
 */


package cse360assign2;

public class Calculator2 {
	
	
private int total;//this is the variable were we are going to be storing the total value.
	
	public Calculator2 () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = total += value;//this is going to be  summing the values of total and value
	}
	
	public void subtract (int value) {
		total = total -= value;// this is going to be subtracting the the two values
	}
	
	public void multiply (int value) {
		total = total*value;// this is going to be multiplying the two values
	}
	
	public void divide (int value) {
		
		
		if(value == 0) { //this if statement is going to check to see if the value == 0 if so set the total equal to zero since we cant divide by 0
			total = 0;
		} else {
			total = total/value;//dividing the total by the value.
		}
	}
	
	public String getHistory () {
		return "";
	}
	
	
	
	
	
	

}
