import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        // Soal 2
        Scanner exObj = new Scanner(System.in);

        System.out.print("a: ");
        int a = exObj.nextInt();

        System.out.print("b: ");
        int b = exObj.nextInt();

        System.out.print("c: ");
        int c = exObj.nextInt();

        if(a >= b && a >= c)
            System.out.println("The largest number is " + a);

        else if (b >= a && b >= c)
            System.out.println("The largest number is " + b);

        else
            System.out.println("The largest number is " + c);
    }
}
