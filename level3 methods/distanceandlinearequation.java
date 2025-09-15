import java.util.Scanner;

public class DistanceAndLineEquation {

    // Method to calculate Euclidean distance
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    // Method to calculate slope and y-intercept of line
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] equation = new double[2]; // [slope, y-intercept]
        double slope = (y2 - y1) / (x2 - x1);  // m = (y2-y1)/(x2-x1)
        double yIntercept = y1 - slope * x1;    // b = y1 - m*x1

        equation[0] = slope;
        equation[1] = yIntercept;

        return equation;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input points
        System.out.print("Enter x1, y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2, y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Calculate distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean distance between the points: " + distance);

        // Calculate line equation
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        System.out.printf("Equation of the line: y = %.2fx + %.2f\n", lineEquation[0], lineEquation[1]);

        sc.close();
    }
}
