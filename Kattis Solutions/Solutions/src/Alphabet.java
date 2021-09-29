import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pat = sc.nextLine();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int lcs = llcs(pat, alphabet);
        System.out.println(26-lcs);
    }
    
    
    public static int llcs(String pat, String alph) {
        int m = pat.length();
        int n = alph.length();
        
        int lcs[][] = new int[m+1][n+1];
        
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i==0 || j==0)
                    lcs[i][j] = 0;
                else if (pat.charAt(i-1) == alph.charAt(j-1))
                    lcs[i][j] = 1 + lcs[i-1][j-1];
                else
                    lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
            }
        }
        return lcs[m][n];
    }
}