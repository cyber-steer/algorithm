package conditional;

import java.util.Scanner;

public class Alram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int h = Integer.parseInt(input.split(" ")[0]);
		int m = Integer.parseInt(input.split(" ")[1]);
		if(m-45<0) {
			m += 15;
			h = h-1<0? 23:h-1;
		}
		else {			
			m -= 45;
		}
		System.out.println(h+" "+m);
		scanner.close();
	}
}
