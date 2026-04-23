package bankApplication;
import java.util.Scanner;

public class Main {

    public static class Account {

        double current = 10000;
        double saving = 5000;

        public void Deposit(double amount, String account)
        {
            System.out.println("--------- "+account+" ------------");
            if (account.equalsIgnoreCase("current"))
            {
                current+=amount;
                System.out.println("Deposit Successfully: +"+amount);
                System.out.println("Current Balance: "+current);
            }
            else if (account.equalsIgnoreCase("saving"))
            {
                saving+=amount;
                System.out.println("Deposit Successfully: +"+amount);
                System.out.println("Current Balance: "+saving);
            }
            else {
                System.out.println("Invalid");
            }
        }

        public void withdraw(double amount, String account)
        {
            System.out.println("--------- "+account+" ------------");
            if (account.equalsIgnoreCase("current"))
            {
                if (amount <= current)
                {
                    current-=amount;
                    System.out.println("Withdraw Successfully: -"+amount);
                    System.out.println("Current Balance: "+current);
                }
                else {
                    System.out.println("Insufficient Balance");
                }
            }
            else if (account.equalsIgnoreCase("saving"))
            {
                if (amount <= saving)
                {
                    saving-=amount;
                    System.out.println("Withdraw Successfully: -"+amount);
                    System.out.println("Current Balance: "+saving);
                }
                else {
                    System.out.println("Insufficient Balance");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account();

        double amount = 0;
        String account = "";

        while (true)
        {
            System.out.println("--------------------- Bank Account ----------------------");
            System.out.println("1) Current Account \n2) Saving Account \n3) Exit");
            int choice = sc.nextInt();

            if (choice == 3)
            {
                System.out.println("Thankyou For Use Our Service, Good Bye!");
                return;
            }

            if (choice == 1)
            {
                account = "current";
            }
            else if (choice == 2)
            {
                account = "saving";
            }

            int subManu;
            do {
                System.out.println("---------------------------------");
                System.out.println("1) Deposit \n2) Withdraw \n3) Back Manu");
                subManu = sc.nextInt();

                switch (subManu)
                {
                    case 1:
                        System.out.println("Enter the Amount to Deposit:");
                        amount = sc.nextDouble();

                        acc.Deposit(amount,account);
                        break;

                    case 2:
                        System.out.println("Enter the Amount to Withdraw:");
                        amount = sc.nextDouble();

                        acc.withdraw(amount,account);
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Invalid");
                }

            }while (subManu != 3);
        }
    }
}

