package number.first;

import java.util.Scanner;

public class MultipleDivisor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String[] inputs = scanner.nextLine().split(" ");
			int a = Integer.parseInt(inputs[0]);
			int b = Integer.parseInt(inputs[1]);
			if(a==0 && b==0) {
				break;
			}
			if(a>b) {
				if(a%b==0) {
					System.out.println("multiple");
				}
				else {
					System.out.println("neither");
				}
			}
			else {
				if(b%a==0) {
					System.out.println("factor");
				}
				else {
					System.out.println("neither");
				}
			}
		}
		scanner.close();
	}
}
