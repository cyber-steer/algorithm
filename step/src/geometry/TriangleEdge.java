package geometry;

import java.util.Scanner;

public class TriangleEdge {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String[] inputs = scanner.nextLine().split(" ");
			int a = Integer.parseInt(inputs[0]);
			int b = Integer.parseInt(inputs[1]);
			int c = Integer.parseInt(inputs[2]);
			if(a==b && b==c) {
				if(a==0) {
					break;					
				}
				else {
					System.out.println("Equilateral");
				}
			}
			else {
				int max = a>b? a:b;
				max = max>c? max:c;
				if(max >= a+b+c-max) {
					System.out.println("Invalid");
				}
				else if(a==b || b==c || c==a) {
					System.out.println("Isosceles");
				}
				else {
					System.out.println("Scalene");
				}
			}
		}
		scanner.close();
	}
}
