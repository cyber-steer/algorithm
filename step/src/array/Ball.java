package array;

import java.util.Scanner;

public class Ball {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] inputs = scanner.nextLine().split(" ");
		int n = Integer.parseInt(inputs[0]);
		int m = Integer.parseInt(inputs[1]);
		int[] bukket = new int[n];
		for(int i=0; i<m; i++) {
			inputs = scanner.nextLine().split(" ");
			int start = Integer.parseInt(inputs[0]);
			int end = Integer.parseInt(inputs[1]);
			int num = Integer.parseInt(inputs[2]);
			for(int j=start-1; j<end; j++) {
				bukket[j] = num;
			}
			
		}
		for(int i: bukket) {
			System.out.print(i+" ");
		}
		scanner.close();
	}
}
