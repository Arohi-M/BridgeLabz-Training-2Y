import java.util.Random;

public class EmployeeBonus {

    // Method to generate salary (5-digit) and years of service (1-10)
    public static int[][] generateEmployeeData(int numEmployees) {
        int[][] data = new int[numEmployees][2]; // [salary, yearsOfService]
        Random rand = new Random();

        for (int i = 0; i < numEmployees; i++) {
            int salary = 10000 + rand.nextInt(90000); // 5-digit salary between 10000 to 99999
            int yearsOfService = 1 + rand.nextInt(10); // years 1 to 10
            data[i][0] = salary;
            data[i][1] = yearsOfService;
        }
        return data;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(int[][] employeeData) {
        int n = employeeData.length;
        double[][] newData = new double[n][3]; // [oldSalary, bonus, newSalary]

        for (int i = 0; i < n; i++) {
            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = (years > 5) ? oldSalary * 0.05 : oldSalary * 0.02;
            double newSalary = oldSalary + bonus;

            newData[i][0] = oldSalary;
            newData[i][1] = bonus;
            newData[i][2] = newSalary;
        }
        return newData;
    }

    // Method to calculate totals and display results
    public static void displayResults(double[][] newData) {
        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.println("Employee\tOld Salary\tBonus\t\tNew Salary");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < newData.length; i++) {
            double oldSalary = newData[i][0];
            double bonus = newData[i][1];
            double newSalary = newData[i][2];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", i + 1, oldSalary, bonus, newSalary);
        }

        System.out.println("----------------------------------------------------------");
        System.out.printf("TOTAL\t\t%.2f\t\t%.2f\t\t%.2f\n", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        // Step 1: Generate employee data
        int[][] employeeData = generateEmployeeData(numEmployees);

        // Step 2: Calculate bonus and new salary
        double[][] newData = calculateBonus(employeeData);

        // Step 3: Display results in tabular format
        displayResults(newData);
    }
}
