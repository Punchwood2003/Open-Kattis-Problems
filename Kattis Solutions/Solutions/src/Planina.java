import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Planina {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(file.readLine());
		int numNodes = (int) (Math.pow(2, n) + 1);
		out.println(numNodes * numNodes);
		out.close();
		file.close();
	}
}
