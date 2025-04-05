import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class Main16a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            try {
                if (age < 0) throw new InvalidAgeException("Negative age not allowed.");
                if (age < 18) throw new InvalidAgeException("You're too young to register!");
                System.out.println("Access granted. You're " + age + " years old.");
            } catch (InvalidAgeException e) {
                System.out.println("Custom Exception: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }

        sc.close();
    }
}
