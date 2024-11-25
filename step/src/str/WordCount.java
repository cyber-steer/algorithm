package str;

import java.util.Scanner;

public class WordCount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		str = str.trim();
		System.out.println(str.isEmpty() ? 0 : str.split(" ").length);
		scanner.close();
	}
}
