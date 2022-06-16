package calculation;

public abstract class Calculation {
	
	double num1;
	double num2;
	String operater;
	
	public Calculation() {}
	public Calculation(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public Calculation(double num1, double num2, String operater) {
		this.num1 = num1;
		this.num2 = num2;
		this.operater = operater;
	}
	
	public double getNum1() {
		return num1;
	}

	public double getNum2() {
		return num2;
	}
	public String getOperater() {
		return operater;
	}
	
	public abstract double execute(); //abstract 추상클래스, 추상메서드 
	 
}
