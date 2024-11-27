package geometry;

import java.util.Scanner;

public class Dot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] xArr = new int[3];
		int[] yArr = new int[3];
		for(int i=0; i<3; i++) {
			String[] inputs = scanner.nextLine().split(" ");
			xArr[i] = Integer.parseInt(inputs[0]);
			yArr[i] = Integer.parseInt(inputs[1]);
		}
		int resultX = -1;
		int resultY = -1;
		for(int i=0; i<3; i++) {
			boolean checkX = true;
			boolean checkY = true;
			for(int j=0; j<3; j++) {
				if(i==j) {
					continue;
				}
				if(xArr[i]== xArr[j]) {
					checkX = false;
				}
				if(yArr[i]== yArr[j]) {
					checkY = false;
				}
			}
			if(checkX) {
				resultX = xArr[i];
			}
			if(checkY) {
				resultY = yArr[i];
			}
		}
		resultX = resultX!=-1?resultX:xArr[2];
		resultY = resultY!=-1?resultY:yArr[2];
		System.out.println(resultX +" "+resultY);
		scanner.close();
		
	}	
}
