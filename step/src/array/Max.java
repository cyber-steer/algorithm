package array;

import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[9];
		for(int i=0; i<9; i++) {
			arr[i] = scanner.nextInt();
			scanner.nextLine();
		}
		int idx = -1;
		int max = -1;
		for(int i=0; i<9; i++) {
			if(max < arr[i]) {
				max = arr[i];
				idx = i+1;
			}
		}
		System.out.println(max);
		System.out.println(idx);
		scanner.close();
	}
}
