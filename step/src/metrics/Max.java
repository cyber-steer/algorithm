package metrics;

import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] table = new int[9][9];
		int max = -1;
		int idxX = -1, idxY = -1;
		for(int i=0; i<9; i++) {
			String[] inputs = scanner.nextLine().split(" ");
			for(int j=0; j<9; j++) {
				table[i][j] = Integer.parseInt(inputs[j]);
				if(max < table[i][j]) {
					max = table[i][j];
					idxX = i;
					idxY = j;
				}
			}
		}
		System.out.println(max);
		System.out.println((idxX+1)+" "+(idxY+1));
		scanner.close();
	}
}
