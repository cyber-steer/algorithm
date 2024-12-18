package metrics;

import java.util.Scanner;

public class Confetti {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] table = new int[100][100];
		int n = scanner.nextInt();
		scanner.nextLine();
		for(int i=0; i<n; i++) {
			String[] inputs = scanner.nextLine().split(" ");
			int x = Integer.parseInt(inputs[0]);
			int y = Integer.parseInt(inputs[1]);
			
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					table[j][k] = 1;
				}
			}
		}
		int count = 0;
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(table[i][j] == 1) {
					count++;
				}
			}
		}
		System.out.println(count);
		scanner.close();
	}
}
