package loop;

import java.util.Scanner;

public class APlusBWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			try {
				String input = scanner.nextLine();
				int a = Integer.parseInt(input.split(" ")[0]);
				int b = Integer.parseInt(input.split(" ")[1]);
				System.out.println(a+b);				
			} catch (Exception e) {
				break;
			}
		}
		scanner.close();
	}
}
