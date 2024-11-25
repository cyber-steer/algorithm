package str;

import java.util.Scanner;

public class StringFirstEnd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String[] result = new String[n];
		
		for(int i=0; i<n; i++) {
			String str = scanner.nextLine();
			char first = str.charAt(0);
			char last = str.charAt(str.length()-1);
			result[i] = String.valueOf(first) + String.valueOf(last);
		}
		for(String str: result) {
			System.out.println(str);
		}
		scanner.close();
	}
}
