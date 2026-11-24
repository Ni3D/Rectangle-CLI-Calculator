package menu;

public class MenuDecoration {
	public static void title() {
		String titleBorder = String.valueOf("=").repeat(24);
		System.out.println(titleBorder + "\nRectangle CLI Calculator\n" + titleBorder);
	}

	public static void border() {
		String border = String.valueOf("-").repeat(24);
		System.out.println(border);
	}
}
