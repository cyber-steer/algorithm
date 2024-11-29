package brute;

import java.util.Scanner;

public class Equations {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[6];
		for(int i=0; i<6; i++) {
			arr[i] = scanner.nextInt();
		}
		int resultX=1000, resultY=1000;
		for(int x=-999; x<=999;x++) {
			for(int y=-999; y<=999; y++) {
				if(arr[0]*x+arr[1]*y==arr[2] && arr[3]*x+arr[4]*y==arr[5]) {
					resultX = x;
					resultY = y;
					break;
				}
			}
			if(resultX!= 1000) {
				break;
			}
		}
		System.out.println(resultX+" "+resultY);
		scanner.close();
	}
}
