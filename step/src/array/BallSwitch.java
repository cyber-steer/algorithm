package array;

import java.util.Scanner;

public class BallSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] inpus = scanner.nextLine().split(" ");
		int n = Integer.parseInt(inpus[0]);
		int m = Integer.parseInt(inpus[1]);
		int[] bukket = new int[n];
		for(int i=0; i<n; i++) {
			bukket[i] = i+1;
		}
		for(int i=0; i<m; i++) {
			inpus = scanner.nextLine().split(" ");
			int a = Integer.parseInt(inpus[0])-1;
			int b = Integer.parseInt(inpus[1])-1;
			
			int temp = bukket[a];
			bukket[a] = bukket[b];
			bukket[b] = temp;
			
		}
		for(int num: bukket) {
			System.out.print(num+" ");
		}
		scanner.close();
	}
}
