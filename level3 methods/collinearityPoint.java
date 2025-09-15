import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using slope formula
    public static boolean isCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate slopes
        double slopeAB = (double)(y2 - y1) / (x2 - x1);
        double slopeBC = (double)(y3 - y2) / (x3 - x2);
        double slopeAC = (double)(y3 - y1) / (x3 - x1);

        // Check if all slopes are equal
        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    // Method to check collinearity using area of triangle formula
    public static boolean isCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 3 points
        System.out.print("Enter x1, y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2, y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3, y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // Check using slope method
        if (isCollinearSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear (Slope method).");
        } else {
            System.out.println("Points are not collinear (Slope method).");
        }

        // Check using area method
        if (isCollinearArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear (Area method).");
        } else {
            System.out.println("Points are not collinear (Area method).");
        }

        sc.close();
    }
}
