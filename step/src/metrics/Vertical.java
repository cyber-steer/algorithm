package metrics;

import java.util.Scanner;

public class Vertical {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String result = "";
		char[][] table = new char[5][15];
		for(int i=0; i<5; i++) {
			for(int j=0; j<15; j++) {
				table[i][j] = '_';
			}
		}
		for(int i=0; i<5; i++) {
			String input = scanner.nextLine();
			for(int j=0; j<input.length(); j++) {
				table[i][j] = input.charAt(j);
			}
		}
		for(int i=0; i<15; i++) {
			for(int j=0; j<5; j++) {
				result += String.valueOf(table[j][i]);
			}
		}
		result = result.replace("_", "");
		System.out.println(result);
		scanner.close();
	}
}
