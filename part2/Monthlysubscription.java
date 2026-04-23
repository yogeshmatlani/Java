import java.util.*;

public class Monthlysubscription {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age < 0 || age > 122) {
                System.out.println("Invalid age!");
                return;
            }

            System.out.print("Are you a student? (Y/N): ");
            char student = sc.next().charAt(0);

            System.out.println("Select Package:");
            System.out.println("1. Package 1");
            System.out.println("2. Package 2");
            System.out.println("3. Package 3");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            int basePrice = 1500;

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    double finalPrice = basePrice;

                    if (age < 18) {
                        finalPrice = finalPrice - (finalPrice * 0.20);
                    }

                    if (student == 'Y' || student == 'y') {
                        finalPrice = finalPrice - (finalPrice * 0.10);
                    }

                    System.out.println("Final Subscription Charge: Rs " + finalPrice);
                    break;

                case 4:
                    System.out.println("Exiting from program!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}