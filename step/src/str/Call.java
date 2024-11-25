package str;

import java.util.Scanner;

public class Call {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int result = 0;
		for(int i=0; i<input.length(); i++) {
			int n = (int) input.charAt(i);
			n -= 65;
			n = n>15?n-1:n;
			n = n>23?n-1:n;
			n /= 3;
			result += n+3;
		}
		System.out.println(result);
		scanner.close();
	}
}