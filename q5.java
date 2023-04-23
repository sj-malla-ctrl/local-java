import java.util.*;

class phone {
    int arcode;
    int ex;
    int num;

    void input(int arcode, int ex, int num) {
        this.arcode = arcode;
        this.ex = ex;
        this.num = num;
    }

    void display() {
        System.out.println("(" + arcode + ")" + ex + "-" + num);
    }
}

public class q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        phone p1 = new phone();
        System.out.println("enter the areacode ,exchange,number of frirst phone respectivly:");
        int arcode1 = s.nextInt();
        int ex1 = s.nextInt();
        int num1 = s.nextInt();
        p1.input(arcode1, ex1, num1);
        phone p2 = new phone();
        System.out.println("enter the areacode ,exchange,number of second phone respectivly:");
        int arcode2 = s.nextInt();
        int ex2 = s.nextInt();
        int num2 = s.nextInt();
        p2.input(arcode2, ex2, num2);
        p1.display();
        p2.display();
    }
}
