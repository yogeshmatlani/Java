import java.util.*;

public class BankSystem {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double currentAccount = 10000;
            double savingsAccount = 5000;

            while (true) {
                System.out.println("\n===== BANKING SYSTEM =====");
                System.out.println("1. Current Account");
                System.out.println("2. Savings Account");
                System.out.println("3. Exit");
                System.out.print("Choose option: ");

                int mainChoice = sc.nextInt();

                switch (mainChoice) {
                    case 1:
                        currentAccount = accountMenu(sc, currentAccount, "Current Account");
                        break;

                    case 2:
                        savingsAccount = accountMenu(sc, savingsAccount, "Savings Account");
                        break;

                    case 3:
                        System.out.println("Thank you for using the banking system!");
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            }
        }

        public static double accountMenu(Scanner sc, double balance, String accountType) {
            while (true) {
                System.out.println("\n--- " + accountType + " ---");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Back to Main Menu");
                System.out.print("Choose option: ");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double deposit = sc.nextDouble();
                        balance += deposit;
                        System.out.println("Deposit successful!");
                        System.out.println("Updated Balance: Rs " + balance);
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdraw = sc.nextDouble();

                        if (withdraw > balance) {
                            System.out.println("Insufficient balance!");
                        } else {
                            balance -= withdraw;
                            System.out.println("Withdrawal successful!");
                            System.out.println("Updated Balance: Rs " + balance);
                        }
                        break;

                    case 3:
                        return balance;

                    default:
                        System.out.println("Invalid choice!");

            }
        }
    }

}
