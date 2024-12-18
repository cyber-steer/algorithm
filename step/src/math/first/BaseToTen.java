package math.first;

import java.util.Scanner;

public class BaseToTen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] inputs = scanner.nextLine().split(" ");
		long n = Integer.parseInt(inputs[0]);
		long b = Integer.parseInt(inputs[1]);
		String result = "";
		while(true) {
			if(n>=b) {
				long x = n/b;
				long y = n%b;
				n=x;
				if(y>9) {
					char c = (char)(65+y-10);
					result +=c;
				}
				else {
					result +=y;
				}				
			}
			else {
				if(n>9) {
					char c = (char)(65+n-10);
					result +=c;
				}
				else {
					result +=n;
				}
				break;
				
			}
		}
		char[] arr = result.toCharArray();
		for(int i=0; i<result.length()/2; i++) {
			char temp = arr[i];
			arr[i] = arr[result.length()-i-1];
			arr[result.length()-1-i] = temp;
		}
		result = String.valueOf(arr);
		System.out.println(result);
		scanner.close();
	}
}
