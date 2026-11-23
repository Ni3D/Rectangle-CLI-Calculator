package main;

import java.util.Scanner;

public class InputValidator {
	public static double validateInputParams(Scanner input, String promt) {
		while (true) {
			System.out.print(promt);
			String inputString = input.nextLine().strip().replace(',', '.');

			try {
				double value = Double.parseDouble(inputString);
				if (value > 0) {
					return value;
				} else {
					System.out.println("Ошибка: введите число больше 0.");
				}
			} catch(NumberFormatException e) {
				System.out.println("Ошибка: введите число.");
			}
		}
	}
}
