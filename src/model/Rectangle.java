package model;
import java.util.List;
import java.util.Scanner;

import main.InputValidator;
import menu.MenuDecoration;

public class Rectangle {

	private record Params(double a, double b) {}

	private static final List<String> menuItems = List.of(
			"1) Периметр P = 2(a + b)",
			"2) Площадь  S = a * b",
			"3) Диагональ d = sqrt(a^2 + b^2)",
			"4) Длина описанной окружности C = π * d",
			"5) Радиус вписанной окружности (только квадрат)",
			"6) Ввести новые параметры",
			"7) Выход"
			);

	public static void calc(Scanner input) {
		Params p = inputParams(input);
		showParams(p);

		while (true) {
			System.out.println("Выберите действие:");
			showMenu();

			int choice = InputValidator.validateMenuChoice(input, menuItems.size());

			switch (choice) {
			case 1 -> System.out.println("Периметр");
			case 2 -> System.out.println("Площадь");
			case 3 -> System.out.println("Диагональ");
			case 4 -> System.out.println("Длина описанной окружности");
			case 5 -> System.out.println("Радиус вписанной окружности (только квадрат)");
			case 6 -> {
				System.out.println("Ввести новые параметры");
				p = inputParams(input);
				showParams(p);
			}
			case 7 -> {
				System.out.println("Выход");
				return;
			}
			default -> System.out.println("Неизвестное действие");
			}
		}
	}

	private static void showMenu() {
		for (String item : menuItems) {
			System.out.println(item);
		}
	}

	private static Params inputParams(Scanner input) {
		double a = InputValidator.validateInputParams(input, "Введите длину прямоугольника: ");
		double b = InputValidator.validateInputParams(input, "Введите ширину прямоугольника: ");
		return new Params(a, b);
	}

	private static void showParams(Params p) {
		MenuDecoration.border();
		System.out.println("Параметры прямоугольника: a = " + p.a() + ", b = " + p.b());
		MenuDecoration.border();
	}
}