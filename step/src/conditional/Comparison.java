package conditional;

import java.util.Scanner;

public class Comparison {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int a = Integer.parseInt(input.split(" ")[0]);
		int b = Integer.parseInt(input.split(" ")[1]);
		if(a<b) {
			System.out.println("<");
		}
		else if(a>b) {
			System.out.println(">");
		}
		else {
			System.out.println("==");
		}
		scanner.close();
	}
}
