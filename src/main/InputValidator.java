package main;
import java.util.Scanner;

public class InputValidator {

	public static int validateMenuChoice(Scanner inputChoice, int menuCounts) {
		String errMessage = "Ошибка: неверный пункт меню.";
		while(true) {
			if (inputChoice.hasNextInt()) {
				int choice = inputChoice.nextInt();
				inputChoice.nextLine();
				if (0 < choice & choice <= menuCounts) {
					return choice;
				} else {
					System.out.println(errMessage);
				}
			} else {
				System.out.println(errMessage);
				inputChoice.nextLine();
			}
		}
	}

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
