package loop;

import java.util.Scanner;

public class APlusB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			String input = scanner.nextLine();
			int a = Integer.parseInt(input.split(" ")[0]);
			int b = Integer.parseInt(input.split(" ")[1]);
			arr[i] = a+b;
		}
		for(int num: arr) {
			System.out.println(num);
		}
		scanner.close();
	}
}
