package main;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = 0;
		boolean isValid = false;
		
		System.out.println("Введите длину прямоугольника: ");
		
		while (!isValid) {
			if (input.hasNextDouble()) {
				a = input.nextDouble();
				if (a > 0) {
					isValid = true;
				} else {
					System.out.println("Ошибка: число должно быть больше 0.");
				}
			} else {
				System.out.println("Ошибка: введено не число.");
				input.next();
			}
		}
		
		double b = 0;
		isValid = false;
		
		System.out.println("Введите ширину прямоугольника: ");
		
		while (!isValid) {
			if (input.hasNextDouble()) {
				b = input.nextDouble();
				if (b > 0) {
					isValid = true;
				} else {
					System.out.println("Ошибка: число должно быть больше 0.");
				}
			} else {
				System.out.println("Ошибка: введено не число.");
				input.next();
			}
		}
		
		System.out.println("Длина прямоугольника: " + a);
		System.out.println("Ширна прямоугольника: " + b);
	}
}
