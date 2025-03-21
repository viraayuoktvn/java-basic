import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        // Soal 1
        Scanner exObj = new Scanner(System.in);

        System.out.print("a: ");
        int a = exObj.nextInt();

        System.out.print("b: ");
        int b = exObj.nextInt();

        System.out.println("Before swapping: a = " + a + " b = " + b);
        swapValues(a, b);
    }

    static void swapValues (int a, int b) {
        // Swapping the values
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + " b = " + b);
    }
}
