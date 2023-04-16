import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter principle ,time and rate respectivly");
        int p = s.nextInt();
        int t = s.nextInt();
        int r = s.nextInt();
        int si = p * t * r;
        System.out.println("the simple interesst as per the given data is" + si);
    }
}