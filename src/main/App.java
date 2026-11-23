package main;

import java.util.Scanner;

import menu.Menu;

public class App {
	public static void main(String[] args) {
		Scanner inputParams = new Scanner(System.in);

		Menu.title();

		double a = InputValidator.validateInputParams(inputParams, "Введите длину прямоугольника: ");
		double b = InputValidator.validateInputParams(inputParams, "Введите длину прямоугольника: ");

		Menu.border();
		System.out.println("Параметры прямоугольника: a = " + a + ", b = " + b);
		Menu.border();

		Menu.menuList();

	}
}
