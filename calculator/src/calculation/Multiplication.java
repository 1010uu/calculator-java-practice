package calculation;

public class Multiplication extends Calculation{

	public Multiplication(double num1, double num2) {
		super(num1, num2);
	}

	@Override
	public double execute() {
		double multiValue = num1 * num2;
		return multiValue;
	}
}
