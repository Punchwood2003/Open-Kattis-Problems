import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EyeOfSauron {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String[] line = file.readLine().split("\\(\\)");
		out.println(line[0].length() == line[1].length() ? "correct" : "fix");
		out.close();
	}
}
