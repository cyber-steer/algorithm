package deepening.first;

import java.util.Scanner;

public class Chess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] inputs = scanner.nextLine().split(" ");
		int[] result = new int[6];
		int[] chess = {1, 1, 2, 2, 2, 8};
		for(int i=0; i<6; i++) {
			int n = Integer.parseInt(inputs[i]);
			result[i] = chess[i] - n;
		}
		for(int n: result) {
			System.out.print(n+" ");
		}
		scanner.close();
	}
}
