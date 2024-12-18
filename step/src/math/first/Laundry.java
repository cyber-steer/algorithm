package math.first;

import java.util.Scanner;

public class Laundry {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] coins = new int[n][4];
		for(int i=0; i<n; i++) {
			float money = scanner.nextFloat();
			
			coins[i][0] = (int)money/25;
			money %= 25;
			coins[i][1] = (int)money/10;
			money %= 10;
			coins[i][2] = (int)money/5;
			money %= 5;
			coins[i][3] = (int)money;
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(coins[i][j] +" ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
