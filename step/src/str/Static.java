package str;

import java.util.Scanner;

public class Static {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] inputs = scanner.nextLine().split(" ");
		for(int i=0; i<2; i++) {
			char a = inputs[i].charAt(0);
			char b = inputs[i].charAt(1);
			char c = inputs[i].charAt(2);
			inputs[i] = ""+c+b+a;
		}
		int a = Integer.parseInt(inputs[0]);
		int b = Integer.parseInt(inputs[1]);
		if(a>b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
		scanner.close();
	}
}
