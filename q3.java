import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the last or close to the last number of the series: ");
        int n = s.nextInt();
        int i = 0;
        int j = 1;
        int k = 0;
        while (k < n) {

            k = i + j;
            i = j;
            j = k;

            System.out.println(k + " ");
        }
    }
}
