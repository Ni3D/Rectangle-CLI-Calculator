package main;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner inputRectanleParams = new Scanner(System.in);
		
		double a = readRectangleParams(inputRectanleParams, "Введите длину прямоугольника: ");
		double b = readRectangleParams(inputRectanleParams, "Введите ширину прямоугольника: ");
		
		System.out.println("Длина прямоугольника: " + a);
		System.out.println("Ширина прямоугольника: " + b);
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
