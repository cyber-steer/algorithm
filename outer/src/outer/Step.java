package outer;

import java.util.Scanner;

public class Step {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		System.out.println(i);
		String str = scanner.nextLine();
		System.out.println(str);
		scanner.close();
	}
}
