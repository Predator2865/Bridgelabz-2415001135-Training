import java.util.Scanner;

public class LoginSystem {

    
    public static boolean validateAge(String ageInput) {
        try {
            
            int age = Integer.parseInt(ageInput);

            
            return age >= 18;
        } 
        catch (NumberFormatException e) {
            
            System.out.println("Invalid input! Age must be a number.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter your age: ");
        String userAge = sc.nextLine();

        if (validateAge(userAge)) {
            System.out.println("Signup successful! Age verified.");
        } else {
            System.out.println("Signup failed! Invalid or underage user.");
        }

        sc.close();
    }
}
