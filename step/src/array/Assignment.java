package array;

import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n =30;
		int[] check = new int[n];
		for(int i=0; i<n-2; i++) {
			int num = scanner.nextInt()-1;
			scanner.nextLine();
			check[num] = 1;
		}
		for(int i=0; i<n; i++) {
			if(check[i] == 0) {
				System.out.println(i+1);
			}
		}
		scanner.close();
	}
}
