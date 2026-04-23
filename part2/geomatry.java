import java.util.*;
public class geomatry {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            final double PI = 3.1416;
            int choice;

            do {
                System.out.println("\n===== AREA CALCULATOR =====");
                System.out.println("1. Circle");
                System.out.println("2. Rectangle");
                System.out.println("3. Triangle");
                System.out.println("4. Square");
                System.out.println("5. Parallelogram");
                System.out.println("6. Trapezoid");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();

                double area;

                switch (choice) {
                    case 1:
                        System.out.print("Enter radius: ");
                        double r = sc.nextDouble();
                        area = PI * r * r;
                        System.out.printf("Area of Circle: %.2f\n", area);
                        break;

                    case 2:
                        System.out.print("Enter length: ");
                        double length = sc.nextDouble();
                        System.out.print("Enter width: ");
                        double width = sc.nextDouble();
                        area = length * width;
                        System.out.printf("Area of Rectangle: %.2f\n", area);
                        break;

                    case 3:
                        System.out.print("Enter base: ");
                        double base = sc.nextDouble();
                        System.out.print("Enter height: ");
                        double height = sc.nextDouble();
                        area = 0.5 * base * height;
                        System.out.printf("Area of Triangle: %.2f\n", area);
                        break;

                    case 4:
                        System.out.print("Enter side: ");
                        double side = sc.nextDouble();
                        area = side * side;
                        System.out.printf("Area of Square: %.2f\n", area);
                        break;

                    case 5:
                        System.out.print("Enter base: ");
                        double pBase = sc.nextDouble();
                        System.out.print("Enter height: ");
                        double pHeight = sc.nextDouble();
                        area = pBase * pHeight;
                        System.out.printf("Area of Parallelogram: %.2f\n", area);
                        break;

                    case 6:
                        System.out.print("Enter base1: ");
                        double base1 = sc.nextDouble();
                        System.out.print("Enter base2: ");
                        double base2 = sc.nextDouble();
                        System.out.print("Enter height: ");
                        double tHeight = sc.nextDouble();
                        area = 0.5 * (base1 + base2) * tHeight;
                        System.out.printf("Area of Trapezoid: %.2f\n", area);
                        break;

                    case 7:
                        System.out.println("Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } while (choice != 7);
        }

}
