import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctPassword = 4545;
        int attempts = 0;
        
        while (attempts < 3) {
            System.out.print("Enter password: ");
            int userPassword = sc.nextInt();
            
            if (userPassword == correctPassword) {
                System.out.println("Login successful!");
                return;
            } else {
                attempts++;
                System.out.println("Incorrect password. Attempts left: " + (3 - attempts));
            }
        }
        
        System.out.println("You have been locked out.");
    }
}
