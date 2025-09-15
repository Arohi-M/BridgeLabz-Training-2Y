import java.util.Scanner;

public class TriangularRun {

    public static int calculateRounds(double a, double b, double c, double totalDistance) {
        double perimeter = a + b + c;
        return (int) Math.ceil(totalDistance / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 (meters): "); double a = sc.nextDouble();
        System.out.print("Enter side 2 (meters): "); double b = sc.nextDouble();
        System.out.print("Enter side 3 (meters): "); double c = sc.nextDouble();

        int rounds = calculateRounds(a, b, c, 5000); // 5 km = 5000 meters
        System.out.println("The athlete must complete " + rounds + " rounds to run 5 km.");
    }
}
