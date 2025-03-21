public class Main {
    public static void main(String[] args) {
        double height = 165;
        double weight = 45;
        double BMI = weight / (Math.pow(height/100, height/100));
        
        System.out.println("BMI: " + BMI);
    }
}

