package number.first;

import java.util.Scanner;

public class Divisor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] inputs = scanner.nextLine().split(" ");
		int a = Integer.parseInt(inputs[0]);
		int b = Integer.parseInt(inputs[1]);
		int count = 0;
		for(int i=1; i<a+1; i++) {
			if(a%i == 0) {
				count++;
				if(count==b) {
					System.out.println(i);
					break;
				}
			}
		}
		if(count<b) {
			System.out.println(0);
		}
		scanner.close();
	}
}
