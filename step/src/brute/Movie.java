package brute;

import java.util.Scanner;

public class Movie {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		int i;
		for(i=1;;i++) {
			String num = i+"";
			int sixCount = 0;
			for(int j =0; j<num.length(); j++) {
				if(num.charAt(j) == '6') {
					sixCount++;
				}
				else {
					sixCount = 0;
				}
				if(sixCount>2) {
					break;
				}
			}
			if(sixCount>2) {
				count++;
			}
			if(n==count) {
				break;
			}
		}
		System.out.println(i);
		scanner.close();
	}
}
