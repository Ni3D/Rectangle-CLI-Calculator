package menu;

import java.util.List;

public class Menu {
	public static void title() {
		String titleBorder = String.valueOf("=").repeat(24);
		System.out.println(titleBorder + "\nRectangle CLI Calculator\n" + titleBorder);
	}

	public static void border() {
		String border = String.valueOf("-").repeat(24);
		System.out.println(border);
	}

	public static void menuList() {
		System.out.println("Выберите действие:");
		List<String> menuItems = List.of(
					"1) Периметр P = 2(a + b)",
					"2) Площадь  S = a * b",
					"3) Диагональ d = sqrt(a^2 + b^2)",
					"4) Длина описанной окружности C = π * d",
					"5) Радиус вписанной окружности (только квадрат)",
					"6) Ввести новые параметры",
					"7) Выход"
				);
		for (String item : menuItems) {
			System.out.println(item);
		}
	}
}
