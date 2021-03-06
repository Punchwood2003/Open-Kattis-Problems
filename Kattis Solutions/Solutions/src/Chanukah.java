import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Chanukah {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int numTimes = Integer.parseInt(file.readLine());
		int[] candles = new int[100001];
		generateCandles(candles);
		for(int i = 0; i < numTimes; i++) {
			StringTokenizer st = new StringTokenizer(file.readLine());
			st.nextToken();
			int day = Integer.parseInt(st.nextToken());
			out.println(i+1 + " " + (candles[day+1]-1));
		}
		out.close();
		file.close();
	}
	public static void generateCandles(int[] arr) {
		arr[1] = 1;
		for(int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1] + (i);
		}
	}
}
