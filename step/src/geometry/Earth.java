package geometry;

import java.util.Scanner;

public class Earth {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		int minX = 10001, minY = 10001, maxX = -10001, maxY = -10001;
		for(int i=0; i<n; i++) {
			String[] inputs = scanner.nextLine().split(" ");
			int x = Integer.parseInt(inputs[0]);
			int y = Integer.parseInt(inputs[1]);
			minX = minX>x? x: minX;
			maxX = maxX<x? x: maxX;
			minY = minY>y? y: minY;
			maxY = maxY<y? y: maxY;
		}
		System.out.println((maxX-minX)*(maxY-minY));
		scanner.close();
	}
}
