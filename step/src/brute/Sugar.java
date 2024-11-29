package brute;

import java.util.Scanner;

public class Sugar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int min = 5001;
		for(int i=0; i<=5000/3; i++) {
			for(int j=0; j<=5000/5; j++) {
				if(3*i+5*j==n) {
					min = i+j>min? min: i+j;
				}
			}
		}
		min = min>5000? -1: min;
		System.out.println(min);
		scanner.close();
	}
}
