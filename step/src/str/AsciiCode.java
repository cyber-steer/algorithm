package str;

import java.util.Scanner;

public class AsciiCode {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char c = scanner.nextLine().charAt(0);
		System.out.println((int)c);
		scanner.close();
	}
}
