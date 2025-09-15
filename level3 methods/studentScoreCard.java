import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random 2-digit scores for PCM for all students
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Maths
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 10 + (int)(Math.random() * 90); // Physics
            scores[i][1] = 10 + (int)(Math.random() * 90); // Chemistry
            scores[i][2] = 10 + (int)(Math.random() * 90); // Maths
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateTotals(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; // total, average, percentage

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = (double)total / 3;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }

    // Method to display the scorecard in tabular format
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("-----------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f%%\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();

        // Step 1: Generate random scores
        int[][] scores = generateScores(numStudents);

        // Step 2: Calculate total, average, and percentage
        double[][] results = calculateTotals(scores);

        // Step 3: Display scorecard
        displayScoreCard(scores, results);

        sc.close();
    }
}
