package OOP_LAB_PRACTICE;
import java.util.Scanner;

public class BankAccount_Q2 {

    public static class BankAccout{
        private String name;
        private double balance;

        public void setName(String name)
        {
            this.name = name;
        }
        public String getName(){return name;}

        public void deposit(double balance){
            if (balance >= 0)
            {
                this.balance += balance;
            }
            else {
                System.out.println("Invalid! Amount Deposit");
            }
        }

        public void withdraw(double balance)
        {
            if (balance >= 0)
            {
                if (balance <= this.balance)
                {
                    this.balance-=balance;
                }
                else {
                    System.out.println("Insufficient Balance");
                }
            }
            else {
                System.out.println("Amount Must Be Positive!");
            }
        }

        public double getBalance(){return balance;}

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccout acc = new BankAccout();

        System.out.println("------ Banking System ------");

        System.out.println("Enter the Account Holder Name:");
        acc.setName(sc.nextLine());
        System.out.println("Deposit the Balance");
        acc.deposit(sc.nextDouble());
        sc.nextLine();


        System.out.println("Enter the Amount To Withdraw:");
        acc.withdraw(sc.nextDouble());


        System.out.println("---- Current Balance ----");
        System.out.println("Account Holder: "+acc.getName()+" | Current Balance: "+acc.getBalance());
    }
}
