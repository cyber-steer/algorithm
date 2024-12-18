package array;

import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		String[] input = scanner.nextLine().split(" ");
		int min = 1000001;
		int max = -1000001;
		
		for(String s: input) {
			int x = Integer.parseInt(s);
			if(x<min) {
				min = x;
			}
			if(x>max) {
				max = x;
			}
		}
		System.out.println(min+" "+max);
		scanner.close();
	}
}
