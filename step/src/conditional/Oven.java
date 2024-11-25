package conditional;

import java.util.Scanner;

public class Oven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int h = Integer.parseInt(input.split(" ")[0]);
		int m = Integer.parseInt(input.split(" ")[1]);
		int v = scanner.nextInt();
		
		m += v;
		if(m>=60) {
			h += m/60;
			m = m%60;
		}
		if(h>=24) {
			h = h-24;
		}
		System.out.println(h+" "+m);
		scanner.close();
	}
}
