import java.util.Scanner;

public class BookingARoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long r = scan.nextLong(); long n = scan.nextLong();
        boolean[] booked = new boolean[(int) r];
        for(int i = 0; i < n; i++) {
            booked[scan.nextInt()-1] = true;
        }
        int roomNumber = -1;
        for(int i = 0; i < booked.length; i++) {
            if(!booked[i]) {
                roomNumber = i+1;
                break;
            }
        }
        System.out.println(roomNumber == -1 ? "too late" : ("" + roomNumber));
    }
}