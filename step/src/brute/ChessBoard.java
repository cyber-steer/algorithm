package brute;

import java.util.Scanner;

public class ChessBoard {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.nextLine();
		char[][] board = new char[n][m];
		for(int i=0; i<n; i++) {
			String input = scanner.nextLine();
			board[i] = input.toCharArray();
		}
		int min = 65;
		for(int i=0; i<n-7; i++) {
			for(int j=0; j<m-7; j++) {
				char a = '0';
				char b = '0';
				for(int o=0; o<2; o++) {
					if(o%2==0) {
						a = 'B';
						b = 'W';
					}
					else {
						a = 'W';
						b = 'B';
					}
					int count = 0;
					for(int k=i; k<i+8;k++) {
						for(int l=j; l<j+8; l++) {
							if((k+l)%2==0 && board[k][l]!=a) {
								count++;
							}
							else if((k+l)%2!=0 && board[k][l]!=b) {
								count++;
							}
						}
					}
					min = min>count? count: min;
				}
			}
		}
		System.out.println(min);
		scanner.close();
	}
}
