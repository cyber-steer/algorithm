package loop;

import java.util.Scanner;

public class Receipt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		scanner.nextLine();
		int n = scanner.nextInt();
		scanner.nextLine();
		for(int i=0; i<n; i++) {
			String input = scanner.nextLine();
			int a = Integer.parseInt(input.split(" ")[0]);
			int b = Integer.parseInt(input.split(" ")[1]);
			money -= a*b;
		}
		if(money == 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		scanner.close();
	}
}
