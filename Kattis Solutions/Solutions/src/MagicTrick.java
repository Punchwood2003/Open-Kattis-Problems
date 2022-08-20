import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;

public class MagicTrick {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		char[] parse = file.readLine().toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		int output = 0;
		for(char c : parse) {
			if(set.add(c)) {
				output = 1;
				break;
			}
		}
		out.println(output);
		out.close();
		file.close();
	} 
}
