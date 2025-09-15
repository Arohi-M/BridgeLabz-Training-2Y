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

    // Method to find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check if number is Harshad
    public static boolean isHarshadNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10]; // digits 0–9
        for (int d : digits) {
            freq[d]++;
        }

        // Count how many unique digits are present
        int count = 0;
        for (int f : freq) {
            if (f > 0) count++;
        }

        // Store in 2D array: digit, frequency
        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }
        return result;
    }

    // Main method
    public static void main(String[] args) {
        int number = 221; // Example input

        System.out.println("Number: " + number);

        // Digits array
        int[] digits = getDigitsArray(number);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        // Count of digits
        System.out.println("Count of Digits: " + countDigits(number));

        // Sum of digits
        System.out.println("Sum of Digits: " + sumOfDigits(digits));

        // Sum of squares
        System.out.println("Sum of Squares of Digits: " + sumOfSquaresOfDigits(digits));

        // Harshad number check
        System.out.println("Is Harshad Number? " + isHarshadNumber(number));

        // Digit frequency
        int[][] freqArray = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int[] row : freqArray) {
            System.out.println("Digit " + row[0] + " => " + row[1] + " times");
        }
    }
}
