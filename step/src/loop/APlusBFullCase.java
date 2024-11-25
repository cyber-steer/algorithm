package loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class APlusBFullCase {
	public static void main(String[] args) {
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));) 
		{
			int n = Integer.parseInt(reader.readLine());
			for(int i=0; i<n; i++) {
				StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
				int a = Integer.parseInt(tokenizer.nextToken());
				int b = Integer.parseInt(tokenizer.nextToken());
				String message = "Case #"+(i+1)+": "+a+" + "+b+" = "+(a+b)+"\n";
				writer.write(message);
			}
			writer.flush();
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
	}

}
