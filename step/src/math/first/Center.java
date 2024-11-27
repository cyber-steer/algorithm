package math.first;

import java.util.Scanner;

public class Center {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int temp = 0;
		for(int i=1; i<=n; i++) {
			if(i==1) {
				temp = 3;
			}
			else {
				temp = temp*2-1;
			}
		}
		System.out.println(temp*temp);
		scanner.close();
		
	}
}
