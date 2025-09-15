import java.util.Arrays;

public class NumberChecker {

    // Method to find the count of digits
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

    // Method to reverse digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check if number is palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check if number is duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    // Main
    public static void main(String[] args) {
        int number = 12021; // Example input

        System.out.println("Number: " + number);
        System.out.println("Count of Digits: " + countDigits(number));

        int[] digits = getDigitsArray(number);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        int[] reversed = reverseArray(digits);
        System.out.println("Reversed Array: " + Arrays.toString(reversed));

        System.out.println("Arrays Equal? " + areArraysEqual(digits, reversed));
        System.out.println("Is Palindrome? " + isPalindrome(number));
        System.out.println("Is Duck Number? " + isDuckNumber(number));
    }
}
