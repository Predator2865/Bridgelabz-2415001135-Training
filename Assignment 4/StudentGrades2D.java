import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // studentData[i][0] = physics, [1] = chemistry, [2] = maths, [3] = percentage
        double[][] studentData = new double[n][4];
        char[] grade = new char[n];

        // Input marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                do {
                    if (j == 0) System.out.print("Physics: ");
                    else if (j == 1) System.out.print("Chemistry: ");
                    else System.out.print("Maths: ");

                    studentData[i][j] = sc.nextDouble();

                    if (studentData[i][j] < 0)
                        System.out.println("Marks must be positive.");
                } while (studentData[i][j] < 0);
            }

            // Calculate percentage
            studentData[i][3] = (studentData[i][0] + studentData[i][1] + studentData[i][2]) / 3.0;

            // Assign grade
            if (studentData[i][3] >= 80) grade[i] = 'A';
            else if (studentData[i][3] >= 70) grade[i] = 'B';
            else if (studentData[i][3] >= 60) grade[i] = 'C';
            else if (studentData[i][3] >= 50) grade[i] = 'D';
            else if (studentData[i][3] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        // Display results
        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                    " | Physics: " + studentData[i][0] +
                    " | Chemistry: " + studentData[i][1] +
                    " | Maths: " + studentData[i][2] +
                    " | Percentage: " + String.format("%.2f", studentData[i][3]) +
                    "% | Grade: " + grade[i]);
        }
    }
}
