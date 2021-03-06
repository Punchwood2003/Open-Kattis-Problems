import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Pot {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int numTimes = Integer.parseInt(file.readLine());
		
		long result = 0;
		while(numTimes-->0) {
			String st = file.readLine();
			result += Math.pow(Long.parseLong(st.substring(0, st.length()-1)), Long.parseLong(st.substring(st.length()-1)));
		}
		out.println(result);
		out.close();
		file.close();
	}
}
