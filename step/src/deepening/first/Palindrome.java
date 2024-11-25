package deepening.first;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		boolean check = true;
		for(int i=0; i<input.length()/2; i++) {
			char c1 = input.charAt(i);
			char c2 = input.charAt(input.length()-1-i);
			if(c1 != c2) {
				check = false;
				break;
			}
		}
		if(check) {
			System.out.println(1);
		}
		else {
			System.out.println(0);			
		}
		scanner.close();
	}
}
