import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Input marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for student " + (i + 1));

            // Physics
            do {
                System.out.print("Physics: ");
                physics[i] = sc.nextInt();
            } while (physics[i] < 0);

            // Chemistry
            do {
                System.out.print("Chemistry: ");
                chemistry[i] = sc.nextInt();
            } while (chemistry[i] < 0);

            // Maths
            do {
                System.out.print("Maths: ");
                maths[i] = sc.nextInt();
            } while (maths[i] < 0);

            // Calculate percentage
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            // Assign grade
            if (percentage[i] >= 80) grade[i] = 'A';
            else if (percentage[i] >= 70) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 50) grade[i] = 'D';
            else if (percentage[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        // Display results
        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                    " | Physics: " + physics[i] +
                    " | Chemistry: " + chemistry[i] +
                    " | Maths: " + maths[i] +
                    " | Percentage: " + String.format("%.2f", percentage[i]) +
                    "% | Grade: " + grade[i]);
        }
    }
}
