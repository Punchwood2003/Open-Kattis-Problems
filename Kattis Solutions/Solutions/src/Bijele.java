import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Bijele {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer(file.readLine());
		int[] pieces = {1,1,2,2,2,8};
		for(int i = 0; i < 6; i++) {
			int temp = Integer.parseInt(st.nextToken());
			out.print(pieces[i]-temp + " ");
		}
		out.close();
		file.close();
	}
}
