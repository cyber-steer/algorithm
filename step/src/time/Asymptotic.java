package time;

import java.util.Scanner;

public class Asymptotic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a1 = scanner.nextInt();
		int a0 = scanner.nextInt();
		int c = scanner.nextInt();
		int n0 = scanner.nextInt();
		
		int result = 1;
		for(int i=n0; i<=100; i++) {
			if(!(a1*i+a0 <= c*i)) {
				result = 0;
			}
		}
		System.out.println(result);
		scanner.close();
	}
}
