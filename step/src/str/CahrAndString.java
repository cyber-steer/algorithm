package str;

import java.util.Scanner;

public class CahrAndString {
	public static void main(StringFirstEnd[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int idx = scanner.nextInt()-1;
		System.out.println(str.charAt(idx));
		scanner.close();
	}
}
