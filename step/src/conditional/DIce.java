package conditional;

import java.util.Scanner;

public class DIce {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int a = Integer.parseInt(input.split(" ")[0]);
		int b = Integer.parseInt(input.split(" ")[1]);
		int c = Integer.parseInt(input.split(" ")[2]);
		
		if(a==b&&b==c) {
			System.out.println(10000+a*1000);
		}
		else if(a==b || b==c || a==c) {
			if(a==b) {
				System.out.println(1000+a*100);
			}
			else if(b==c) {
				System.out.println(1000+b*100);
			}
			else {
				System.out.println(1000+c*100);
			}
		}
		else {
			a = a>b?a:b;
			a = a>c?a:c;
			System.out.println(a*100);
		}
		scanner.close();
	}
}
