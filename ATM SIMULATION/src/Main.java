
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Initial balance and variables
        double balance = 5000.00; // Starting balance
        int choice;
        double amount;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM Simulator!");
        while (true) {
            // Display menu options
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Check Balance
                    System.out.printf("Your current balance is: $%.2f%n", balance);
                    break;

                case 2:
                    // Deposit Money
                    System.out.print("Enter the amount to deposit: $");
                    amount = scanner.nextDouble();
                    if (amount > 0) {
                        balance += amount;
                        System.out.printf("$%.2f has been deposited. New balance: $%.2f%n", amount, balance);
                    } else {
                        System.out.println("Invalid deposit amount. Please try again.");
                    }
                    break;

                case 3:
                    // Withdraw Money
                    System.out.print("Enter the amount to withdraw: $");
                    amount = scanner.nextDouble();
                    if (amount > 0 && amount <= balance) {
                        balance -= amount;
                        System.out.printf("$%.2f has been withdrawn. Remaining balance: $%.2f%n", amount, balance);
                    } else if (amount > balance) {
                        System.out.println("Insufficient funds. Please try again.");
                    } else {
                        System.out.println("Invalid withdrawal amount. Please try again.");
                    }
                    break;

                case 4:
                    // Exit
                    System.out.println("Thank you for using the ATM Simulator. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
