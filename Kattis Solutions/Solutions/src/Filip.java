import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Filip {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer(file.readLine());
		StringBuilder num1 = new StringBuilder(st.nextToken());
		StringBuilder num2 = new StringBuilder(st.nextToken());
		num1 = num1.reverse();
		num2 = num2.reverse();
		int compare = num1.compareTo(num2);
		if(compare > 0) {
			out.println(num1);
		}
		else {
			out.println(num2);
		}
		out.close();
		file.close();
	}
}
