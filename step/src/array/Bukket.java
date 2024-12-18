package array;

import java.util.Scanner;

public class Bukket {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] inputs = scanner.nextLine().split(" ");
		int n = Integer.parseInt(inputs[0]);
		int m = Integer.parseInt(inputs[1]);
		int[] bukket = new int[n];
		for(int i=0; i<n; i++) {
			bukket[i] = i+1;
		}
		for(int i=0; i<m; i++) {
			inputs = scanner.nextLine().split(" ");
			int start = Integer.parseInt(inputs[0])-1;
			int end = Integer.parseInt(inputs[1])-1;
			int len = end-start;
			int ableLen = len;
			
			for(int j=start; j<start+(len/2)+1; j++) {
				int temp = bukket[j];
				bukket[j] = bukket[j+ableLen];
				bukket[j+ableLen] = temp;
				ableLen -= 2;
			}
		}
		for(int num: bukket) {
			System.out.print(num+" ");
		}
		scanner.close();
	}
}