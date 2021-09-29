import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class HeartRate {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st;
		int numTimes = Integer.parseInt(file.readLine());
		while(numTimes-->0) {
			st = new StringTokenizer(file.readLine());
			double b = Double.parseDouble(st.nextToken());
			double p = Double.parseDouble(st.nextToken());
			double t = 60/p;
			double BPM = (60 * b) / p;
			double minABPM = BPM - t;
			double maxABPM = BPM + t;
			out.println(String.format("%.4f %.4f %.4f", minABPM, BPM, maxABPM));
		}
		out.close();
		file.close();
	}
}
