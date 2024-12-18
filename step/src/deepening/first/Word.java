package deepening.first;

import java.util.Scanner;

public class Word {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		input = input.toUpperCase();
		int[] table = new int[26];
		for(int i=0; i<input.length(); i++) {
			int n = (int) input.charAt(i);
			n -= 65;
			table[n]++;
		}
		int max = -1;
		int idx = -1;
		for(int i=0; i<26; i++) {
			if(max < table[i]) {
				max = table[i];
				idx = i;
			}
		}
		int count = 0;
		for(int n: table) {
			if(max == n) {
				count++;
			}
		}
		idx = count>1? -1: idx;
		char c = idx != -1 ? (char) (65+idx): '?';
		System.out.println(c);
		scanner.close();
	}
}
