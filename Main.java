import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner mainObj = new Scanner(System.in);

        System.out.print("Tinggi: ");
        double height = mainObj.nextDouble();

        System.out.print("Berat: ");
        double weight = mainObj.nextDouble();

        double BMI = weight / Math.pow(height/100, 2);    
        System.out.println("BMI: " + BMI);
    }
}

