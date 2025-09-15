import java.util.Arrays;

public class FootballTeamHeights {

    // Method to generate random heights for 11 players
    public int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + (int)(Math.random() * 101); // Range 150–250
        }
        return heights;
    }

    // Method to calculate sum of array
    public int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Method to calculate mean
    public double calculateMean(int[] arr) {
        int sum = calculateSum(arr);
        return (double) sum / arr.length;
    }

    // Method to find shortest height
    public int findShortest(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Method to find tallest height
    public int findTallest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        FootballTeamHeights fth = new FootballTeamHeights();

        // Generate random heights for 11 players
        int[] heights = fth.generateHeights(11);
        System.out.println("Heights of Players: " + Arrays.toString(heights));

        // Find results
        int shortest = fth.findShortest(heights);
        int tallest = fth.findTallest(heights);
        double mean = fth.calculateMean(heights);

        // Display results
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
        System.out.println("Mean Height: " + mean + " cm");
    }
}
