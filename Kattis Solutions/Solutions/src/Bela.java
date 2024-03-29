import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Bela {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer(file.readLine());
		int N = Integer.parseInt(st.nextToken());
		char dominate = st.nextToken().charAt(0);
		String index = "AKQJT987";
		int[] dominateScores = {11,4,3,20,10,14,0,0};
		int[] nonDominateScores = {11,4,3,2,10,0,0,0};
		int count = 0;
		for(int i = 0; i < 4*N; i++) {
			String temp = file.readLine();
			char number = temp.charAt(0);
			char suit = temp.charAt(1);
			int j = index.indexOf(number);
			if(suit == dominate) {
				count += dominateScores[j];
			}
			else {
				count += nonDominateScores[j];
			}
		}
		out.println(count);
		out.close();
		file.close();
	}
}
