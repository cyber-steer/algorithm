package deepening.first;

import java.util.Scanner;

public class Rating {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		double sum = 0;
		for(int i=0; i<20; i++) {
			String[] inputs = scanner.nextLine().split(" ");
			if(inputs[2].equals("P")) continue;
			double a = Double.parseDouble(inputs[1]);
			double b= -1;
			switch(inputs[2]) {
				case "A+":
					b = 4.5;
					break;
				case "A0":
					b = 4.0;
					break;
				case "B+":
					b = 3.5;
					break;
				case "B0":
					b = 3.0;
					break;
				case "C+":
					b = 2.5;
					break;
				case "C0":
					b = 2.0;
					break;
				case "D+":
					b = 1.5;
					break;
				case "D0":
					b = 1.0;
					break;
				case "F":
					b = 0.0;
					break;
			}
			sum += b*a;
			count += a;
		}
		System.out.println(sum/count);
		scanner.close();
	}
}
