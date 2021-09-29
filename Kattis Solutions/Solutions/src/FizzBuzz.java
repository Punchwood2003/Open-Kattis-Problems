import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class FizzBuzz {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer(file.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		for(int i = 1; i <= N; i++) {
			boolean div1 = i % x == 0;
			boolean div2 = i % y == 0;
			if(div1 && div2) {
				out.println("FizzBuzz");
			}
			else if(div1) {
				out.println("Fizz");
			}
			else if(div2) {
				out.println("Buzz");
			}
			else {
				out.println(i);
			}
		}
		out.close();
		file.close();
	}
}
