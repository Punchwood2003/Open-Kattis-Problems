import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CountTheVowels {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int count = 0;
		String[] line = file.readLine().split("");
		for(int i = 0; i < line.length; i++) {
			if(line[i].matches("[AEIOUaeiou]")) {
				count++;
			}
		}
		out.println(count);
		out.close();
	}
}
