package array;

import java.util.Scanner;

public class Avg {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String[] inputs = scanner.nextLine().split(" ");
		float[] score = new float[n];
		int max = -1;
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(inputs[i]);
			score[i] = num;
			if(max < num) {
				max = num;
			}
		}
		float sum = 0;
		for(int i=0; i<n ;i++) {
			sum += score[i]/max*100;
		}
		System.out.println(sum/n);
		scanner.close();
	}
}
