package str;

import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		for(int i=97; i<97+26; i++) {
			char c = (char) i;
			int idx = str.indexOf(c);
			System.out.print(idx + " ");
		}
		scanner.close();
	}
}
