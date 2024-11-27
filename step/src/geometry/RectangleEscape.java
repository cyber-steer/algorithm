package geometry;

import java.util.Scanner;

public class RectangleEscape {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] inputs = scanner.nextLine().split(" ");
		int x = Integer.parseInt(inputs[0]);
		int y = Integer.parseInt(inputs[1]);
		int w = Integer.parseInt(inputs[2]);
		int h = Integer.parseInt(inputs[3]);
		
		int a = x>w-x?w-x:x;
		int b = y>h-y?h-y:y;
		int min = a<b?a:b;
		System.out.println(min);
		scanner.close();
	}
}