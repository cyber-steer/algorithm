package str;

import java.util.Scanner;

public class NumPlus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String num = scanner.nextLine();
		int sum =0;
		for(int i=0; i<n; i++) {
			sum += Integer.parseInt(String.valueOf(num.charAt(i)));
		}
		System.out.println(sum);
		scanner.close();
	}
}