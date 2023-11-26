import java.util.Scanner;

class User {
    private String userId;
    private String pin;

    // Constructor for the id and pin
    public User(String userId, String pin) {
        this.userId = userId;
        this.pin = pin;
    }

    // Getter for User ID
    public String getUserId() {
        return userId;
    }

    // Method to check if the entered PIN is correct
    public boolean verifyPin(String enteredPin) {
        return pin.equals(enteredPin);
    }
}

class ATM {
    private User currentUser;

    // Constructor
    public ATM(User user) {
        this.currentUser = user;
    }

    // Method to display main menu
    public void displayMainMenu() {
        System.out.println("1. Transaction History");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Transfer");
        System.out.println("5. Exit");
    }

    // Method to perform selected operation
    public void performOperation(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Displaying Transaction History...");
                // Implement logic for displaying transaction history
                break;
            case 2:
                System.out.println("Withdrawal in progress...");
                // Implement logic for withdrawal
                break;
            case 3:
                System.out.println("Deposit in progress...");
                // Implement logic for deposit
                break;
            case 4:
                System.out.println("Transfer in progress...");
                // Implement logic for transfer
                break;
            case 5:
                System.out.println("Exiting ATM. Thank you!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}

public class ATM_interface {
    public static void main(String[] args) {
        // Mock user data
        User user = new User("20034", "1509");

        // Initialize ATM with the user
        ATM atm = new ATM(user);

        // Mock authentication process
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter User ID: ");
        String enteredUserId = scanner.next();

        System.out.print("Enter PIN: ");
        String enteredPin = scanner.next();

        // Verify user credentials
        if (user.getUserId().equals(enteredUserId) && user.verifyPin(enteredPin)) {
            System.out.println("Authentication successful. Welcome!");

            // Display main menu
            while (true) {
                atm.displayMainMenu();
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                atm.performOperation(choice);
            }
        } else {
            System.out.println("Authentication failed. Exiting.");
        }
    }
}
