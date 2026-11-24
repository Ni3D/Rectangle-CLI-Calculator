package main;
import java.util.Scanner;

import menu.MenuDecoration;
import model.Rectangle;

public class App {
	public static void main(String[] args) {
		MenuDecoration.title();

		Scanner input = new Scanner(System.in);
		Rectangle.calc(input);
	}
}
