import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.TreeSet;

public class Everywhere {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int numTimes = Integer.parseInt(file.readLine());
		while(numTimes-->0) {
			TreeSet<String> cities = new TreeSet<String>();
			int numCities = Integer.parseInt(file.readLine());
			while(numCities-->0) {
				cities.add(file.readLine());
			}
			out.println(cities.size());
		}
		out.close();
		file.close();
	}
}
