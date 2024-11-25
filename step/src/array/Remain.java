package array;

import java.util.Scanner;

public class Remain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] check = new int[42];
		for(int i=0; i<10; i++) {
			int num = scanner.nextInt();
			num %= 42;
			scanner.nextLine();
			check[num] = 1;
		}
		int count = 0;
		for(int i=0; i<42; i++) {
			if(check[i] == 1) {
				count++;
			}
		}
		System.out.println(count);
		scanner.close();
	}
}
