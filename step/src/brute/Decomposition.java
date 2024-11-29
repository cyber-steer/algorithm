package brute;

import java.util.Scanner;

public class Decomposition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long min = 0;
		for(long i = 1; i<=n; i++) {
			long m = i;
			long temp = i;
			long z;
			int count=0;
			for(z=i;z>0;z /=10) {
				count++;
			}
			for(int j=0; j<count; j++) {
				int ten=1;
				for(int k=0; k<count-j-1; k++) {
					ten *=10;
				}
				long a= m/ten;
				m = m-a*ten;
				temp+=a;
			}
			if(temp == n) {
				min = i;
				break;
			}
			
		}
		System.out.println(min);
		scanner.close();
	}
}
