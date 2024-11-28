package geometry;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a==b && b==c && c==60) {
			System.out.println("Equilateral");
		}
		else if(a+b+c == 180) {
			if(a==b || b==c || c==a){
				System.out.println("Isosceles");
			}
			else {
				System.out.println("Scalene");
			}
		}
		else {
			System.out.println("Error");
		}
	}
}
