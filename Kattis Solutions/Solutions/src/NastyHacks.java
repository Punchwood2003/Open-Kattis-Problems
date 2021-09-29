import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class NastyHacks {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer(file.readLine());
		int numTimes = Integer.parseInt(st.nextToken());
		while(numTimes-->0) {
			st = new StringTokenizer(file.readLine());
			int r = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int advertise = e-c;
			if(advertise == r) {
				out.println("does not matter");
			}
			else {
				int best = Math.max(advertise, r);
				
				if(best == r) {
					out.println("do not advertise");
				}
				else {
					out.println("advertise");
				}
			}
		}
		out.close();
		file.close();
	}
}
