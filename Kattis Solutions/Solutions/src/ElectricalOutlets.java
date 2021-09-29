import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ElectricalOutlets {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st;
		int n = Integer.parseInt(file.readLine());
		while(n-->0) {
			st = new StringTokenizer(file.readLine());
			int k = Integer.parseInt(st.nextToken());
			int total = 0;
			while(k-->0) {
				total += Integer.parseInt(st.nextToken()) - 1;
			}
			out.println(total+1);
		}
		out.close();
		file.close();
	}
}
