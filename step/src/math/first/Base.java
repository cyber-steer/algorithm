package math.first;

import java.util.Scanner;

public class Base {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] inputs = scanner.nextLine().split(" ");
		String n = inputs[0];
		int sum = 0;
		int b = Integer.parseInt(inputs[1]);
		for(int i=0; i<n.length(); i++) {
			int num = -1;
			int idx = n.length()-1-i;
			char c = n.charAt(idx);
			try {
				num = Integer.parseInt(String.valueOf(c));
			}catch(Exception e){
				num = (int)c - 55;
			}
			int x = 1;
			for(int j=0; j<i; j++) {
				x *=b;
			}
			sum += x*num;
		}
		System.out.println(sum);
		scanner.close();
	}
}
