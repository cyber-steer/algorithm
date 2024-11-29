package brute;

import java.util.Scanner;

public class Blackjack {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] cards = new int[n];
		for(int i=0; i<n; i++) {
			cards[i] = scanner.nextInt();
		}
		int max = 0;
		for(int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-1; j++) {
				for(int k=j+1; k<n; k++) {
					int temp = cards[i]+cards[j]+cards[k];
					max = temp<=m && max<temp? temp: max;
				}
			}
		}
		System.out.println(max);
		scanner.close();
	}
}
