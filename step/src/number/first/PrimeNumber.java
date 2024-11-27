package number.first;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		
		int prime = -1;
		int sum = 0;
		for(int i=m; i<=n; i++) {
			boolean check = true;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					check = false;
					break;
				}
			}
			if(i==2) {
				check = true;
			}
			else if(i==1){
				check = false;
			}
			if(check) {
				if(sum == 0) {
					prime = i;
				}
				sum += i;
			}
		}
		if(prime == -1) {
			System.out.println(prime);
		}
		else {
			System.out.println(sum);
			System.out.println(prime);
		}
		scanner.close();
	}
}
