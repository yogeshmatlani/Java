import java.util.Scanner;
public class MathematicalCalculation {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int choice;

            while (true) {
                System.out.println("\n--- Mathematical Menu ---");
                System.out.println("1. MAX function");
                System.out.println("2. PRIME function");
                System.out.println("3. MULTIPLICATION_TABLE");
                System.out.println("4. ARITHMETIC_SERIES");
                System.out.println("5. GCD function");
                System.out.println("6. Exit");
                System.out.print("Select an option: ");

                choice = input.nextInt();

                if (choice == 1) {
                    findMax(input);
                } else if (choice == 2) {
                    checkPrime(input);
                } else if (choice == 3) {
                    printTable(input);
                } else if (choice == 4) {
                    printSeries(input);
                } else if (choice == 5) {
                    findGCD(input);
                } else if (choice == 6) {
                    System.out.println("Program Terminated.");
                    break;
                } else {
                    System.out.println("Invalid choice! Please try again.");
                }
            }
        }

        // 1. MAX - Using simple if-else
        public static void findMax(Scanner sc) {
            System.out.print("Enter three numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int max = a;
            if (b > max) max = b;
            if (c > max) max = c;

            System.out.println("Maximum is: " + max);
        }

        // 2. PRIME - Using a simple for-loop
        public static void checkPrime(Scanner sc) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            boolean isPrime = true;

            if (n <= 1) isPrime = false;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) System.out.println(n + " is Prime.");
            else System.out.println(n + " is not Prime.");
        }

        // 3. Multiplication Table
        public static void printTable(Scanner sc) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }

        // 4. Arithmetic Series (a, d, n)
        public static void printSeries(Scanner sc) {
            System.out.print("Enter a (start): ");
            int a = sc.nextInt();
            System.out.print("Enter d (diff): ");
            int d = sc.nextInt();
            System.out.print("Enter n (terms): ");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print(a + (i * d) + " ");
            }
            System.out.println();
        }

        // 5. GCD - Using a simple while loop (no Math.abs)
        public static void findGCD(Scanner sc) {
            System.out.print("Enter two numbers: ");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            if (n1 == 0 && n2 == 0) {
                System.out.println("Invalid input: Both numbers cannot be zero.");
                return;
            }

            // Make numbers positive manually if they are negative
            if (n1 < 0) n1 = -n1;
            if (n2 < 0) n2 = -n2;

            while (n1 != n2) {
                if (n1 > n2) n1 = n1 - n2;
                else n2 = n2 - n1;
            }
            System.out.println("GCD is: " + n1);
        
    }
}
