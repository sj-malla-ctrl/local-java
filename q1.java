import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter the number to cheack");
        int n = s.nextInt();
        if (n % 2 == 0) {
            System.out.println("The number is a even number");
        } else {
            System.out.println("The number is odd");
        }
    }
}
