package OOP_LAB_PRACTICE;
import java.util.Scanner;

public class ProductInventory_Q4 {
    public static class Product{
        private String name;
        private double price;
        private int quantity;

        public void setName(String name)
        {
            this.name = name;
        }
        public void setPrice(double price)
        {
            if (price >= 0)
            {
                this.price = price;
            }
            else {
                System.out.println("Price Must be Greter than 0");
            }
        }
        public void setQuantity(int quantity)
        {
            if (quantity >= 0)
            {
                this.quantity = quantity;
            }
            else {
                System.out.println("The Quantity must be Greater than 0");
            }
        }

        public String getName(){return name;}
        public double getPrice(){return price;}
        public int getQuantity() {return quantity;}

        public double getTotalvalue()
        {
            return price*quantity;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[3];

        for (int i = 0; i < products.length; i++)
        {
            products[i] = new Product();

            System.out.println("------ Product no: "+(i+1)+"-------");
            System.out.println("Enter the Product Name: ");
            products[i].setName(sc.nextLine());
            System.out.println("Enter the Price:");
            products[i].setPrice(sc.nextDouble());
            System.out.println("Enter the Quantity:");
            products[i].setQuantity(sc.nextInt());
            sc.nextLine();
        }

        System.out.println("-------------------- Product List --------------------");
        for (Product p: products)
        {
            System.out.println("Product: "+p.getName()+" | Price: "+p.getPrice()+" | Quantity: "+p.getQuantity()+" | Total Value: "+p.getTotalvalue());
        }
    }
}
