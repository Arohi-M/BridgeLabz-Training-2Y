import java.util.Arrays;

public class RandomStats {

    // Method to generate array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate 4-digit number between 1000 and 9999
            numbers[i] = 1000 + (int)(Math.random() * 9000);
        }
        return numbers;
    }

    // Method to find average, min, and max of array
    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    // Main method
    public static void main(String[] args) {
        RandomStats rs = new RandomStats();

        // Generate 5 random 4-digit numbers
        int[] randomNumbers = rs.generate4DigitRandomArray(5);
        System.out.println("Generated Numbers: " + Arrays.toString(randomNumbers));

        // Find average, min, and max
        double[] results = rs.findAverageMinMax(randomNumbers);
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
