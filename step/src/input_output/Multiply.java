package input_output;

import java.util.Scanner;

public class Multiply {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int firstNum = b/100;
		int secondNum = (b-firstNum*100)/10;
		int thirdNum = b-firstNum*100 - secondNum*10;
		System.out.println(thirdNum*a);
		System.out.println(secondNum*a);
		System.out.println(firstNum*a);
		System.out.println(a*b);
		scanner.close();
	}
}
