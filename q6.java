import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value greater than 2");
        int v = s.nextInt();
        int flag = -1;
        if (v > 2) {
            while (v >= 2) {
                v = v / 2;
                flag++;
            }
            System.out
                    .println("The number of time the " + v + "needs to be divided by 2 to get a less than 2 is" + flag);
        }

    }
}
