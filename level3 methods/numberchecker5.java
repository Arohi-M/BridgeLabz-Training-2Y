public class NumberChecker {

    // Method to calculate sum of proper divisors
    public static int sumOfDivisors(int number) {
        int sum = 1; // 1 is always a divisor
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return number == 1 ? 0 : sum;
    }

    // Method to check Perfect Number
    public static boolean isPerfect(int number) {
        return number > 0 && sumOfDivisors(number) == number;
    }

    // Method to check Abundant Number
    public static boolean isAbundant(int number) {
        return number > 0 && sumOfDivisors(number) > number;
    }

    // Method to check Deficient Number
    public static boolean isDeficient(int number) {
        return number > 0 && sumOfDivisors(number) < number;
    }

    // Method to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check Strong Number
    public static boolean isStrong(int number) {
        int temp = number, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Main method
    public static void main(String[] args) {
        int number = 28; // Example input

        System.out.println("Number: " + number);
        System.out.println("Is Perfect? " + isPerfect(number));
        System.out.println("Is Abundant? " + isAbundant(number));
        System.out.println("Is Deficient? " + isDeficient(number));
        System.out.println("Is Strong? " + isStrong(number));
    }
}
