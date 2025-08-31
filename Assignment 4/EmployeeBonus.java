import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMPLOYEES = 10;
        double[] salary = new double[EMPLOYEES];
        double[] years = new double[EMPLOYEES];
        double[] bonus = new double[EMPLOYEES];
        double[] newSalary = new double[EMPLOYEES];

        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;

        // Input salaries and years of service
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            // Salary input validation
            System.out.print("Salary: ");
            double sal = sc.nextDouble();
            if (sal <= 0) {
                System.out.println("Invalid salary! Enter again.");
                i--; // decrement index to re-enter this employee’s details
                continue;
            }

            // Years of service input validation
            System.out.print("Years of Service: ");
            double yrs = sc.nextDouble();
            if (yrs < 0) {
                System.out.println("Invalid years of service! Enter again.");
                i--; 
                continue;
            }

            salary[i] = sal;
            years[i] = yrs;
        }

        // Calculate bonus, new salary, totals
        for (int i = 0; i < EMPLOYEES; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Print details
        System.out.println("\nEmployee Salary Details:");
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.printf("Employee %d -> Old Salary: %.2f, Bonus: %.2f, New Salary: %.2f%n",
                    (i + 1), salary[i], bonus[i], newSalary[i]);
        }

        System.out.println("\nCompany Summary (Zara):");
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);

        sc.close();
    }
}
