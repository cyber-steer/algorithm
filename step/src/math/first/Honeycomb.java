package math.first;

import java.util.Scanner;

public class Honeycomb {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i =1;
		int result = 1;
		int temp = 1;
		int newTemp = 1;
		while(true) {
			if(i==1) {
				if(n ==1) {
					break;
				}
			}
			else {
				newTemp = 6*(i-1) + temp;
			}
			if(temp<n && n<=newTemp) {
				result = i;
				break;
			}
			temp = newTemp;
			i++;
		}
		System.out.println(result);
		scanner.close();
	}
}