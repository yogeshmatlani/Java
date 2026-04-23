package GeometricShapes;
import java.util.Scanner;

public class Main {

    public static class Calculation {

        public void Circle(Scanner sc)
        {
            final double pi = 3.14;

            System.out.println("Enter the Radius");
            double radius = sc.nextDouble();

            double area = pi*radius*radius;
            System.out.println("The Area Of Circle is: "+area);
        }

        public void Rectangle(Scanner sc)
        {
            System.out.println("Enter the length: ");
            double length = sc.nextDouble();
            System.out.println("Enter the Width: ");
            double width = sc.nextDouble();

            double ractangle = width*length;
            System.out.println("The Ractangle is: "+ractangle);
        }

        public void Tringle(Scanner sc)
        {
            System.out.println("Enter the Base");
            double base = sc.nextDouble();
            System.out.println("Enter the Height: ");
            double height = sc.nextDouble();

            double tringle = 0.5*base*height;
            System.out.println("The Tringle is: "+tringle);
        }

        public void Square(Scanner sc)
        {
            System.out.println("Enter the Side A: ");
            double a = sc.nextDouble();
            System.out.println("Enter the Side B: ");
            double b = sc.nextDouble();

            double square = a*b;
            System.out.println("The Square:" + square);
        }

        public void Parallelogram(Scanner sc)
        {
            System.out.println("Enter the Height:");
            double height = sc.nextDouble();
            System.out.println("Enter the Base: ");
            double base = sc.nextDouble();

            double parallelogram = base*height;
            System.out.println("The Parallelogram is: "+parallelogram);
        }

        public void Trapezoid(Scanner sc)
        {
            System.out.println("Enter the height: ");
            double height = sc.nextDouble();
            System.out.println("Enter the Base1: ");
            double base1 = sc.nextDouble();
            System.out.println("Enter the Base2");
            double base2 = sc.nextDouble();

            double trapezoid = 0.5*(base1+base2)*height;
            System.out.println(trapezoid);
        }

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculation f = new Calculation();

        int choice = 0;

        do {
            System.out.println("------------------------------");
            System.out.println("1) Circle \n2) Rectangle \n3) Tringle \n4) Square \n5) Parallelogram \n6) Trapezoid \n7) Exit");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    f.Circle(sc);
                    break;
                case 2:
                    f.Rectangle(sc);
                    break;
                case 3:
                    f.Tringle(sc);
                    break;
                case 4:
                    f.Square(sc);
                    break;
                case 5:
                    f.Parallelogram(sc);
                    break;
                case 6:
                    f.Trapezoid(sc);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid");
            }

        }while (choice != 7);
    }
}
