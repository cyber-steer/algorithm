package str;

import java.util.Scanner;

public class StringLoop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String[] results = new String[n];
		for(int i=0; i<n; i++) {
			String[] inputs = scanner.nextLine().split(" ");
			int loop = Integer.parseInt(inputs[0]);
			String str = inputs[1];
			String result = "";
			for(int j=0; j<str.length(); j++) {
				for(int k=0; k<loop; k++) {
					result += String.valueOf(str.charAt(j));
				}
			}
			results[i] = result;
		}
		for(String str: results) {
			System.out.println(str);
		}
		scanner.close();
	}
}
