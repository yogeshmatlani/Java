package OOP_LAB_PRACTICE;
import java.util.Scanner;

public class MenuDrivenBankSystem_Q8 {
    public static class BankAccount{

        private String name;
        private double balance;

        public void setName(String name) {this.name = name;}

        public void setBalance(double balance) {this.balance = balance;}

        public String getName() {return name;}
        public double getBalance() {return balance;}

        public void deposite(double amount)
        {
            if (balance >= 0)
            {
                this.balance += amount;
            }
            else {
                System.out.println("Invalid! Deposite Entered");
            }
            System.out.println("Successfully Deposited...");
        }

        public void withdraw(double amount)
        {
            if (amount <= balance)
            {
                this.balance -= amount;
                System.out.println("Successfully Withdraw...");
            }
            else {
                System.out.println("Insufficient Balance");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        System.out.println("Enter the Account Holder Name: ");
        acc.setName(sc.nextLine());

        int choice = 0;
        do {
            System.out.println("\n1) Deposit \n2) Withdraw \n3) Check Balance \n4) Exit");
            System.out.println("Enter the Option number:");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("----- Deposite Amount ------");
                    System.out.println("Enter the Balance To Deposite: ");
                    acc.setBalance(sc.nextDouble());
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("----- Withdraw Amount ------");
                    System.out.println("Enter the Amount to Withdraw: ");
                    acc.withdraw(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("------ Account Details -------");
                    System.out.println("Account Holder: "+acc.getName()+" | Current Balance: "+acc.getBalance());
                    break;
                case 4:
                    System.out.println("Exiting.......");
                    break;
                default:
                    System.out.println("Invalid Option");
            }

        } while (choice != 4);
    }
}
