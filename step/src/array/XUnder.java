package array;

import java.util.Scanner;

public class XUnder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int n = Integer.parseInt(input.split(" ")[0]);
		int x = Integer.parseInt(input.split(" ")[1]);
		int[] arr = new int[n];
		
		String[] inputs= scanner.nextLine().split(" ");
		for(int i=0; i<n; i++) {
			if(x > Integer.parseInt(inputs[i])) {
				arr[i] = Integer.parseInt(inputs[i]);
			}
		}
		for(int i: arr) {
			if(i!=0) {
				System.out.print(i+" ");
			}
		}
		scanner.close();
	}
}