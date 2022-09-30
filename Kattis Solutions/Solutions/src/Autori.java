import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Autori {
	public static void main(String[] args) throws IOException {
		new Autori().run();
	}
	public void run() throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		out.println(file.readLine().replaceAll("[^A-Z]", ""));
		file.close();
		out.close();
	}
}
