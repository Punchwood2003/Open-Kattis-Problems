import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.TreeMap;

public class NVWLS {
	public static TreeMap<StringBuilder, StringBuilder> dictionary;
	public static TreeMap<StringBuilder, Integer> numVowelsUsed;
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);

		int numItems = Integer.parseInt(file.readLine());
		dictionary = new TreeMap<StringBuilder, StringBuilder>();
		numVowelsUsed = new TreeMap<StringBuilder, Integer>();
		for(int i = 0; i < numItems; i++) {
			String tempLine = file.readLine();
			
			StringBuilder line = new StringBuilder();
			line.append(tempLine);
			
			// Remove all of the vowels
			StringBuilder noVowels = new StringBuilder();
			noVowels.append(tempLine.replaceAll("[AEIOU]", ""));
			
			int currNumVowels = line.length() - noVowels.length();
			
			// "If there are multiple reconstructions, choose the one with the largest overall number of vowels"
			if(dictionary.containsKey(noVowels)) {
				int prevNumVowels = numVowelsUsed.get(noVowels);
				if(currNumVowels > prevNumVowels) {
					dictionary.put(noVowels, line);
					numVowelsUsed.put(noVowels, currNumVowels);
				}
			}
			// Else we have a new entry and we just add it 
			else {
				dictionary.put(noVowels, line);
				numVowelsUsed.put(noVowels, currNumVowels);
			}
		}
		String line = file.readLine();
		StringBuilder output = new StringBuilder();
		StringBuilder curr = new StringBuilder();
		for(int start = 0; start < line.length(); start++) {
			curr.append(line.charAt(start));
			if(dictionary.containsKey(curr)) {
				output.append(dictionary.get(curr));
				output.append(" ");
				curr = new StringBuilder();
			}
		}
		out.println(output.toString());
		out.close();
	}
}