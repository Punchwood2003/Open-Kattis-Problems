import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class OddEcho {
	public static void main(String[] agrs) throws IOException {
		new OddEcho().run();
	}
	public void run() throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int numTimes = Integer.parseInt(file.readLine());
		for(int i = 0; i < numTimes; i ++) {
			if(i % 2 == 0) {
				out.println(file.readLine());
			} else {
				file.readLine();
			}
		}
		file.close();
		out.close();
	}
}
