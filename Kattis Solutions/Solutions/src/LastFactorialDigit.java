import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class LastFactorialDigit {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int numTimes = Integer.parseInt(file.readLine());
		while(numTimes-->0) {
			int n = Integer.parseInt(file.readLine());
			int fact = 1;
			for(int i = 1; i <= n; i++) {
				fact *= i;
			}
			String temp = "" + fact;
			out.println(temp.charAt(temp.length()-1));
		}
		out.close();
		file.close();
	}
}
