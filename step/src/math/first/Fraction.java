package math.first;

import java.util.Scanner;

public class Fraction {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int row = 1;
		int col = 1;
		int status = 1;
		for(int i=0; i<n-1; i++) {
			if(row==1) {
				if(status == 1) {
					col++;
					status = -1;
				}
				else{
					col--;
					row++;					
				}
			}
			else if(col==1) {
				if(status == -1) {
					row++;
					status = 1;
				}
				else {
					row--;
					col++;
				}
			}
			else if(status == -1) {
				col--;
				row++;
			}
			else if(status == 1) {
				row--;
				col++;
			}
		}
		System.out.println(row+"/"+col);
		scanner.close();
	}
}

