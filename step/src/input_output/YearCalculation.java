package input_output;

import java.util.Scanner;

public class YearCalculation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		System.out.println(year-543);
		scanner.close();
	}
}
