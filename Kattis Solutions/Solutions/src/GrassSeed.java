import java.util.Scanner;

public class GrassSeed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double C = scan.nextDouble();
        long L = scan.nextLong();
        double total = 0;
        for(long i = 0; i < L; i++) {
            double w = scan.nextDouble();
            double l = scan.nextDouble();
            total += (w * l) * C;
        }
        System.out.printf("%.8f", total);
    }
}