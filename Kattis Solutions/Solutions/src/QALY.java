import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class QALY {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer(file.readLine());
		int numTimes = Integer.parseInt(st.nextToken());
		double qaly = 0.0;
		while(numTimes-->0) {
			st = new StringTokenizer(file.readLine());
			qaly += Double.parseDouble(st.nextToken()) * Double.parseDouble(st.nextToken());
		}
		out.println(String.format("%.3f", qaly));
		out.close();
		file.close();
	}
}
