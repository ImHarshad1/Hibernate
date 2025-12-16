package Polymorphism;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class Instagram {

    private final Scanner sc = new Scanner(System.in);
    // For demo purposes we store email/mobile and password in memory.
    // Note: we store password as a char[] (better than String because we can clear it).
    private String savedEmail = "harsh123@gmail.com";
    private char[] savedPassword = "1234".toCharArray();
    private String savedMobile = "7770039985";

    // ----------------------
    // Utility: read password but try to hide input when possible
    // ----------------------
    private char[] readPasswordHiddenChars(String prompt) {
        Console console = System.console();
        if (console != null) {
            // If running in a real terminal, Console.readPassword hides typed characters and returns char[]
            return console.readPassword(prompt);
        } else {
            // Fallback for IDEs (Eclipse/IntelliJ) where System.console() is often null:
            System.out.print(prompt);
            String typed = sc.next();               // this ECHOES input (not hidden)
            return typed.toCharArray();
        }
    }

    // ----------------------
    // OTP generator (6 digits)
    // ----------------------
    private String generateOtp() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((int) (Math.random() * 10));
        }
        return sb.toString();
    }

    // ----------------------
    // Login via Mobile OTP
    // ----------------------
    public void loginByMobile() {
        String otp = generateOtp();
        // In real app, you'd send OTP via SMS. Here we simulate by printing it.
        System.out.println("Simulated OTP sent to " + savedMobile + " : " + otp);

        System.out.print("Enter OTP: ");
        String userOtp = sc.next();
        if (userOtp.equals(otp)) {
            System.out.println("✅ Login Success via Mobile OTP!");
        } else {
            System.out.println("❌ Login Failed (Wrong OTP)");
        }
    }

    // ----------------------
    // Login via Email + Password
    // ----------------------
    public void loginByEmail() {
        System.out.print("Enter Email: ");
        String enteredEmail = sc.next();

        char[] enteredPass = readPasswordHiddenChars("Enter Password: ");

        boolean emailMatches = enteredEmail.equalsIgnoreCase(savedEmail);
        boolean passMatches = Arrays.equals(enteredPass, savedPassword);

        // IMPORTANT: clear the entered password char[] as soon as comparison is done
        Arrays.fill(enteredPass, '\0');

        if (emailMatches && passMatches) {
            System.out.println("✅ Login Success via Email & Password!");
        } else {
            System.out.println("❌ Check your Email/Password");
        }
    }

    // ----------------------
    // Forgot Password flow
    // ----------------------
    public void forgotPassword() {
        System.out.print("Enter registered email: ");
        String email = sc.next();

        if (!email.equalsIgnoreCase(savedEmail)) {
            System.out.println("No account registered with that email.");
            return;
        }

        // Verify identity via OTP to saved mobile (simulated)
        String otp = generateOtp();
        System.out.println("Simulated OTP sent to " + savedMobile + " : " + otp);

        System.out.print("Enter OTP: ");
        String userOtp = sc.next();
        if (!userOtp.equals(otp)) {
            System.out.println("OTP verification failed.");
            return;
        }

        // Get new password (hidden when possible)
        char[] newPass = readPasswordHiddenChars("Enter new password: ");
        char[] confirm = readPasswordHiddenChars("Confirm new password: ");

        if (!Arrays.equals(newPass, confirm)) {
            System.out.println("Passwords do not match. Try again.");
            // clear sensitive data before returning
            Arrays.fill(newPass, '\0');
            Arrays.fill(confirm, '\0');
            return;
        }

        // Clear old saved password from memory and set new one
        Arrays.fill(savedPassword, '\0');
        savedPassword = Arrays.copyOf(newPass, newPass.length);

        // Clear temporary arrays
        Arrays.fill(newPass, '\0');
        Arrays.fill(confirm, '\0');

        System.out.println("✅ Password reset successful.");
    }

    // ----------------------
    // Simple console menu
    // ----------------------
    public void startMenu() {
        while (true) {
            System.out.println("\n===== Instagram Demo =====");
            System.out.println("1. Login with Mobile OTP");
            System.out.println("2. Login with Email & Password");
            System.out.println("3. Forgot Password");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.next());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
                continue;
            }

            switch (choice) {
                case 1 -> loginByMobile();
                case 2 -> loginByEmail();
                case 3 -> forgotPassword();
                case 4 -> {
                    System.out.println("Bye!");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    public static void main(String[] args) {
        Instagram insta = new Instagram();
        insta.startMenu();
    }
}
