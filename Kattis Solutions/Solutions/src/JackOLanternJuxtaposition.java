import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class JackOLanternJuxtaposition {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer(file.readLine());
		long result = 1;
		while(st.hasMoreTokens()) {
			result *= Integer.parseInt(st.nextToken());
		}
		out.println(result);
		out.close();
		file.close();
	}
}
