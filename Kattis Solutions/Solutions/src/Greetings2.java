import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Greetings2 {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String line = file.readLine();
		out.println('h' + line.substring(1, line.length()-1) + line.substring(1, line.length()-1) + 'y');
		out.close();
		file.close();
	}
}
