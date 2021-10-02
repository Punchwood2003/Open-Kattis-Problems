import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class BatterUp {
	
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer(file.readLine());
		int numElements = Integer.parseInt(st.nextToken());
		double total = 0;
		double num = 0;
		st = new StringTokenizer(file.readLine());
		for(int i = 0; i < numElements; i++) {
			double temp = Double.parseDouble(st.nextToken());
			if(temp != -1) {
				total += temp;
				num++;
			}
		}
		out.println(total / num);
		out.close();
		file.close();
	}
}
