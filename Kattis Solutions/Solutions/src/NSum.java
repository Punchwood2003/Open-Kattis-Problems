import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class NSum {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int n = Integer.parseInt(file.readLine());
		StringTokenizer st = new StringTokenizer(file.readLine());
		int sum = 0;
		while(n-->0) {
			sum += Integer.parseInt(st.nextToken());
		}
		out.println(sum);
		out.close();
		file.close();
	} 
}
