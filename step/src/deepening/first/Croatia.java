package deepening.first;

import java.util.Scanner;

public class Croatia {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		input = input.replace("dz=", "0");
		input = input.replace("c=", "0");
		input = input.replace("c-", "0");
		input = input.replace("d-", "0");
		input = input.replace("lj", "0");
		input = input.replace("nj", "0");
		input = input.replace("s=", "0");
		input = input.replace("z=", "0");
		System.out.println(input.length());
		scanner.close();
	}
}
