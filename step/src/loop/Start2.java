package loop;

import java.util.Scanner;

public class Start2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=i; j<n-1; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}

}
