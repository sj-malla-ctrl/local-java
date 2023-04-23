import java.util.Scanner;

class complex {
    int real;
    int img;

    void Display() {
        System.out.println(real + "+" + img + "i");
    }

    void input(int real, int img) {
        this.img = img;
        this.real = real;

    }

    public static complex add(complex c1, complex c2) {
        complex sum = new complex();
        sum.real = c1.real + c2.real;
        sum.img = c1.img + c2.img;
        return sum;
    }
}

public class q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        complex c1 = new complex();
        System.out.println("enter the real and imaginary part respectivly of the first comlex number:");
        int real11 = s.nextInt();
        int img11 = s.nextInt();
        c1.input(real11, img11);
        c1.Display();
        complex c2 = new complex();
        System.out.println("Enter the real and imaginary part of the second complex number respectivly:");
        int real12 = s.nextInt();
        int img12 = s.nextInt();
        c2.input(real12, img12);
        c2.Display();
        complex sum = complex.add(c1, c2);
        System.out.println("the summation of both the complex number is");
        sum.Display();
    }
}
