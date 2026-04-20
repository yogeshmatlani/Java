package OOP_LAB_PRACTICE;
import java.util.Scanner;

public class InventorySortbyPrice_Q12 {
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
            else{
                System.out.println("Invalid Price Entered");
            }
        }

        public void setQuantity(int quantity)
        {
            if (quantity >= 0)
            {
                this.quantity = quantity;
            }
            else {
                System.out.println("Invalid Quantity Entered");
            }

        }

        public String getName(){return name;}
        public double getPrice(){return price;}
        public int getQuantity(){return quantity;}

        public double getTotalValue()
        {
            return quantity*price;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[3];

        for (int i = 0; i < products.length; i++)
        {
            products[i] = new Product();
            System.out.println("------- Product no:"+(i+1)+"-------");
            System.out.println("Enter the Product Name:");
            products[i].setName(sc.nextLine());
            System.out.println("Enter the Price:");
            products[i].setPrice(sc.nextDouble());
            System.out.println("Enter the Quantity:");
            products[i].setQuantity(sc.nextInt());
            sc.nextLine();
        }

        for (int i = 0; i < products.length; i++)
        {
            for (int j = i+1; j < products.length-1; j++)
            {
                if (products[i].getPrice() > products[j].getPrice())
                {
                    Product temp = products[i];
                    products[i] = products[j];
                    products[j] = temp;
                }
            }
        }


        System.out.println("---------------------- All Products -----------------------");
        for (Product p:products)
        {
            System.out.println("Product: "+p.getName() + " | Price: "+p.getPrice()+" | Quantity:"+p.getQuantity()+" | Total Value:"+p.getTotalValue());
        }
    }
}
