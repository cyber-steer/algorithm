package number.first;

import java.util.Scanner;

public class DivisorSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int n = scanner.nextInt();
			if(n == -1) {
				break;
			}
			int sum = 1;
			String result = "1";
			for(int i=2; i<n; i++) {
				if(n%i ==0) {
					sum += i;
					result = result +" + " + i;
				}
			}
			if(sum == n) {
				System.out.println(n+" = "+result);
			}
			else {
				System.out.println(n+" is NOT perfect.");
			}
		}
		scanner.close();
	}
}
