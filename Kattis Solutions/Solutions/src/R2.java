import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class R2 {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String[] line = file.readLine().split(" ");
		out.println(Integer.parseInt(line[1]) * 2 - Integer.parseInt(line[0]));
		out.close();
	}
} 
