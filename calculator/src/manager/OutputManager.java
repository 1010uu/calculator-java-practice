package manager;

import calculation.Addition;
import calculation.Calculation;
import calculation.Division;
import calculation.Multiplication;
import calculation.Subtraction;

public class OutputManager {
	
	Calculation calculation = new Calculation();
	
	//메뉴 출력
	public void printMenu() {
		System.out.println("#Calculator Start");
		System.out.println();
		System.out.println("1.계산기 실행 2.프로그램 종료");
		System.out.println("=====================================");
		System.out.print("선택 : ");
	}

	//계산
	public void printResult(Calculation enterdData) {
		
		final double num1 = enterdData.getNum1();
		final double num2 = enterdData.getNum2();
		String operater = enterdData.getOperater();
		String data = num1 + operater + num2 + "=";
		
		if(operater.equals("+")) {
			Calculation add = new Addition(num1, num2);
			double totalValue = add.execute();
			System.out.printf("결과: %.3f\n", totalValue);
		}
		if(operater.equals("-")) {
			Calculation sub = new Subtraction(num1, num2);
			double totalValue = sub.execute();
			System.out.printf("결과: %.3f\n", totalValue);
		}
		if(operater.equals("*")) {
			Calculation multi = new Multiplication(num1, num2);
			double totalValue = multi.execute();
			System.out.printf("결과: %.3f\n", totalValue);
		}
		if(operater.equals("/")) {
			Calculation div = new Division(num1, num2);
			double totalValue = div.execute();
			System.out.printf("결과: %.3f\n", totalValue);
		}
		
	}
}
