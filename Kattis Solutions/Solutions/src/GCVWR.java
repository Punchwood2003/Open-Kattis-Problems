import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class GCVWR {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String[] line = file.readLine().split(" ");
		int G = Integer.parseInt(line[0]);
		int T = Integer.parseInt(line[1]);
		int numTimes = Integer.parseInt(line[2]);
		G -= T;
		G *= 0.9;
		line = file.readLine().split(" ");
		while(numTimes-->0) {
			G -= Integer.parseInt(line[numTimes]);
		}
		out.println(G);
		out.close();
	}
}
