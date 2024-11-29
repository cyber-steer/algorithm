package geometry;

import java.util.Scanner;

public class TrianglePerimeter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] inputs = scanner.nextLine().split(" ");
		int a = Integer.parseInt(inputs[0]);
		int b = Integer.parseInt(inputs[1]);
		int c = Integer.parseInt(inputs[2]);
		
		int max = a>b? a:b;
		max = max>c? max:c;
		
		if(max>= a+b+c-max) {
			System.out.println(a+b+c-max+a+b+c-max-1);
		}
		else {
			System.out.println(a+b+c);
		}
		scanner.close();
	}
}
