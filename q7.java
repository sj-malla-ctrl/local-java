import java.util.*;

class student {
    int roll;
    String name;
    int dmark;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name ,roll number and mark secured in dsa respectivly:");
        System.out.println("Enter your name: ");
        this.name = sc.nextLine();
        System.out.println("Enter your roll: ");
        this.roll = sc.nextInt();
        System.out.println("Enter your mark: ");
        this.dmark = sc.nextInt();
        // sc.close();

    }

    void showdata() {
        System.out.println("The student " + name + " having roll number " + roll + " have secured in dsa " + dmark);
    }

    // public String toString() {
    // return ("The student " + name + " having roll number " + roll + " have
    // secured in dsa:" + dmark);
    // }
}

public class q7 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.getdata();
        student s2 = new student();
        s2.getdata();
        student s3 = new student();
        s3.getdata();
        student s4 = new student();
        s4.getdata();
        student s5 = new student();
        s5.getdata();

        s1.showdata();
        s2.showdata();
        s3.showdata();
        s4.showdata();
        s5.showdata();

    }
}
