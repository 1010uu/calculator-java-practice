package manager;

import java.util.Scanner;
import calculation.Calculation;

//입력 데이터 관리
public class InputManager {
	
	OutputManager output = new OutputManager();
	Scanner scanner = new Scanner(System.in);
	
	public int selectMenu() {
		
		int choice = scanner.nextInt();

		if(choice <1) {
			System.out.println("메뉴 번호 입력 오류");
		}
		if(choice >2) {
			System.out.println("메뉴 번호 입력 오류");
		}
		
		return choice;
	}
	
	public Calculation inputNumber() {
				
		System.out.print("첫번째 숫자 : ");
		double num1 = scanner.nextDouble();
		
		System.out.print("기호 입력 : ");
		String operater = scanner.next();
		
		System.out.print("두번째 숫자 : ");
		double num2 = scanner.nextDouble();
		
		Calculation calculation = new Calculation(num1, num2, operater);
		return calculation;
	}
}
