package math.first;

import java.util.Scanner;

public class Snail {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] inputs = scanner.nextLine().split(" ");
		int a = Integer.parseInt(inputs[0]);
		int b = Integer.parseInt(inputs[1]);
		int v = Integer.parseInt(inputs[2]);

		int day = 0;
		v -= a;
		
		int move = a-b;
		day = v/move;
		if(move*day == v) {
			day++;
		}
		else if(move*day < v) {
			day += 2;
		}
		System.out.println(day);
		scanner.close();
	}
}