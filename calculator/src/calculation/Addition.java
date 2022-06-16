package calculation;

public class Addition extends Calculation{
	
	public Addition(double num1, double num2) {
		super(num1, num2);
	}

	@Override
	public double execute() {
		double addValue = num1 + num2; 
		return addValue;
	}
}
