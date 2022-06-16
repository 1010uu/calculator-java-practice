package project;

import java.util.Scanner;
import calculation.Calculation;
import manager.InputManager;
import manager.OutputManager;

public class projectMain {
	
	public static void main(String[] args) {
	
		OutputManager output = new OutputManager();
		InputManager input = new InputManager();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			output.printMenu();

			int choice = input.selectMenu();
			if(choice == 1) {
				Calculation enterdData = input.inputNumber();
				output.printResult(enterdData);
				continue;
			}
			if(choice == 2) {
				return;
			}

		}
	}
}
