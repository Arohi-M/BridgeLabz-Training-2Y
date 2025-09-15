import java.util.Scanner;

public class MinMaxThreeNumbers {

    public static int[] findMinMax(int a, int b, int c) {
        int smallest = a;
        int largest = a;

        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;

        if (b > largest) largest = b;
        if (c > largest) largest = c;

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: "); int num1 = sc.nextInt();
        System.out.print("Enter second number: "); int num2 = sc.nextInt();
        System.out.print("Enter third number: "); int num3 = sc.nextInt();

        int[] result = findMinMax(num1, num2, num3);
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);
    }
}
