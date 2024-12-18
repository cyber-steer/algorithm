package deepening.first;

import java.util.Scanner;

public class GroupWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		int count = 0;
		for(int i=0; i<n; i++) {
			String input = scanner.nextLine();
			input = input.toUpperCase();
			int[] arr = new int[26];
			char last = '_';
			for(int j=0; j<input.length(); j++) {
				char c = input.charAt(j);
				if(c != last) {
					if(arr[c-65] != 0) {
						count --;
						break;
					}
					else {
						arr[c-65] = 1;
						last = c;
					}
				}
			}
			count++;
		}
		System.out.println(count);
		scanner.close();
	}
}
