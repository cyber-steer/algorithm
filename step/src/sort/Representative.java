package sort;

import java.util.Scanner;

public class Representative {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int[] arr = new int[5];
		for(int i=0; i<5; i++) {
			int n = scanner.nextInt();
			arr[i] = n;
			sum+=n;
		}
		for(int i=0; i<4; i++) {
			for(int j=i+1; j<5; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(sum/5);
		System.out.println(arr[2]);
		scanner.close();
	}
}
