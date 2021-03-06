package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() throws IllegalStateException{
		if(super.getFlag()==false) 
			throw new IllegalStateException("First Value has not been executed.") ;
	
		current = current + commonDifference; 
		return current;
	}
	public String toString(){
		
		return "Arith("+(int)this.firstValue()+","+(int)this.commonDifference+")";
	}
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 
		return n*(current+commonDifference); 
		
		}
}
