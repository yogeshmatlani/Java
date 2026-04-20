package OOP_LAB_PRACTICE;
import java.util.Scanner;

public class CarShowroomMostExpensive_Q9 {

    public static class Car{
        private String brand;
        private double price;
        private int year;

        public void setBrand(String brand){this.brand = brand;}
        public void setPrice(double price)
        {
            if (price >= 0)
            {
                this.price = price;
            }
            else {
                System.out.println("Invalid! Price Entered");
            }
        }
        public void setYear(int year)
        {
            if (year >= 1990)
            {
                this.year = year;
            }
            else {
                System.out.println("Year Must Be Greater Than 1990");
            }
        }

        public String getBrand(){ return brand;}
        public double getPrice(){return price;}
        public int getYear(){ return year;}

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] car = new Car[3];

        for (int i = 0; i < car.length; i++)
        {
            car[i] = new Car();

            System.out.println("------ Car no: "+(i+1)+" ------");
            System.out.println("Enter the Car Name:");
            car[i].setBrand(sc.nextLine());
            System.out.println("Enter the Car Price:");
            car[i].setPrice(sc.nextDouble());
            System.out.println("Enter the Car Year");
            car[i].setYear(sc.nextInt());
            sc.nextLine();
        }


        Car expensive = car[0];

        for (Car c:car)
        {
            if (c.getPrice() > expensive.getPrice())
            {
                expensive = c;
            }
        }

        System.out.println("-------- Expensive Luxery Car --------");
        System.out.println("Car: "+expensive.brand+" | Price: "+expensive.price+" | Modal Year: "+ expensive.year);
    }
}
