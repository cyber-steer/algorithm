package metrics;

import java.util.Scanner;

public class Plus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] inputs = scanner.nextLine().split(" ");
		int n = Integer.parseInt(inputs[0]);
		int m = Integer.parseInt(inputs[1]);
		int[][] arr1 = new int[n][m];
		int[][] arr2 = new int[n][m];
		
		for(int i=0; i<n; i++) {
			inputs = scanner.nextLine().split(" ");
			for(int j=0; j<m; j++) {
				arr1[i][j] = Integer.parseInt(inputs[j]);
			}
		}
		for(int i=0; i<n; i++) {
			inputs = scanner.nextLine().split(" ");
			for(int j=0; j<m; j++) {
				arr2[i][j] = Integer.parseInt(inputs[j]);
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print((arr1[i][j]+arr2[i][j])+" ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
