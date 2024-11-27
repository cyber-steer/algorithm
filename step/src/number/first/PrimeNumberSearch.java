package number.first;

import java.util.Scanner;

public class PrimeNumberSearch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String[] inputs = scanner.nextLine().split(" ");
		int count = 0;
		
		for(String input: inputs) {
			int num = Integer.parseInt(input);
			for(int i=2; i<num; i++) {
				if(num%i ==0) {
					count--;
					break;
				}
			}
			if(num != 1) {
				count++;				
			}
		}
		System.out.println(count);
		scanner.close();
	}
}
