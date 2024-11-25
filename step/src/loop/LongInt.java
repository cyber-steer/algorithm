package loop;

import java.util.Scanner;

public class LongInt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=0; i<n; n-=4) {
			System.out.print("long ");
		}
		System.out.println("int");
		scanner.close();
	}
}
