import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class JumboJavelin {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int numTimes = Integer.parseInt(file.readLine());
		int total = 0;
		while(numTimes-->0) {
			total += Integer.parseInt(file.readLine()) - 1;
		}
		out.println(total + 1);
		out.close();
		file.close();
	}
}
