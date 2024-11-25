package str;

import java.util.Scanner;

public class Literally {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			System.out.println(scanner.nextLine());
		}
		scanner.close();
	}
}
