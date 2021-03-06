import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Faktor {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer(file.readLine());
		double a = Integer.parseInt(st.nextToken());
		double i = Integer.parseInt(st.nextToken());
		int maxC = (int) (a * i);
		for(; maxC >= 0; maxC--) {
			if(Math.ceil(maxC / a) != i) {
				out.println(maxC+1);
				break;
			}
		}
		out.close();
		file.close();
	}
}
