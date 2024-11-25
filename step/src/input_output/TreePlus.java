package input_output;

import java.util.Scanner;

public class TreePlus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		long a = Long.parseLong(input.split(" ")[0]);
		long b = Long.parseLong(input.split(" ")[1]);
		long c = Long.parseLong(input.split(" ")[2]);
		System.out.println(a+b+c);
		scanner.close();
	}
}
