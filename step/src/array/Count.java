package array;

import java.util.Scanner;

public class Count {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String[] arr= scanner.nextLine().split(" ");
		int target = scanner.nextInt();
		scanner.nextLine();
		int count =0;
		for(int i=0; i<n; i++) {
			if(target == Integer.parseInt(arr[i])) {
				count++;
			}
		}
		System.out.println(count);
		scanner.close();
	}
}