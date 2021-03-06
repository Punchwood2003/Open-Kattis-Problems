import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Cold {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st;
		int numTimes = Integer.parseInt(file.readLine());
		st = new StringTokenizer(file.readLine());
		int l = 0;
		while(numTimes-->0) {
			l += Integer.parseInt(st.nextToken()) < 0 ? 1 : 0;
		}
		out.println(l);
		out.close();
		file.close();
	}
}
