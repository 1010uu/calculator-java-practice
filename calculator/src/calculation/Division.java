package calculation;

public class Division extends Calculation{

	public Division(double num1, double num2) {
		super(num1, num2);
	}

	@Override
	public double execute() {
		double divValue = 0;
		try {
		divValue = num1 / num2;
		}
		catch (ArithmeticException  e) {
			e.printStackTrace();
		}
		return divValue;
	}
}
