package input_output;

import java.util.Scanner;

public class ASubB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int a = Integer.parseInt(input.split(" ")[0]);
		int b = Integer.parseInt(input.split(" ")[1]);
		System.out.println(a-b);
		scanner.close();
	}
}