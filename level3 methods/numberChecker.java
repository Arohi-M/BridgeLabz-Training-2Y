import java.util.Arrays;

public class NumberChecker {

    // Method to find count of digits
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store digits in an array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    // Method to check if Duck number (contains 0, but not as first digit)
    public static boolean isDuckNumber(int number) {
        String numStr = String.valueOf(number);
        return numStr.contains("0") && numStr.charAt(0) != '0';
    }

    // Method to check Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int power = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == number;
    }

    // Method to find largest and second largest digit
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find smallest and second smallest digit
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    // Main Method
    public static void main(String[] args) {
        int number = 153; // Example number

        System.out.println("Number: " + number);

        // Count digits
        int count = countDigits(number);
        System.out.println("Count of Digits: " + count);

        // Get digits array
        int[] digits = getDigitsArray(number);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        // Duck number check
        System.out.println("Is Duck Number? " + isDuckNumber(number));

        // Armstrong number check
        System.out.println("Is Armstrong Number? " + isArmstrongNumber(number));

        // Largest and second largest
        int[] largest = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);

        // Smallest and second smallest
        int[] smallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }
}
