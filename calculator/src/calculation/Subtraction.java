package calculation;

public class Subtraction extends Calculation{
	
	public Subtraction(double num1, double num2) {
		super(num1, num2);
	}

	@Override
	public double execute() {
		double subValue = num1 - num2;
		return subValue;
	}
}
