package main;
import java.util.Scanner;

import menu.Menu;

public class App {
	public static void main(String[] args) {
		Scanner inputRectanleParams = new Scanner(System.in);

		Menu.title();

		double a = readRectangleParams(inputRectanleParams, "Введите длину прямоугольника: ");
		double b = readRectangleParams(inputRectanleParams, "Введите ширину прямоугольника: ");

		Menu.border();
		System.out.println("Параметры прямоугольника: a = " + a + ", b = " + b);
		Menu.border();
		Menu.menuList();

	}

	private static double readRectangleParams(Scanner input, String promt) {
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
