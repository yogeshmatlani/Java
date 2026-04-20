package OOP_LAB_PRACTICE;
import java.util.Scanner;

public class LibraryMenuSystem_Q14 {
    public static class Book{
        private String tile;
        private double price;
        private int copies;

        public void setTile(String tile){this.tile = tile;}

        private void setPrice(double price){
            if (price >= 0) {this.price = price;}
            else {System.out.println("Invalid Price Entered");}
        }

        private void setCopies(int copies)
        {if (copies >= 0) {this.copies = copies;}
        else {System.out.println("Invalid Copies Entered");}
        }

        public String getTile(){return tile;}
        private double getPrice(){return price;}
        private int getCopies(){return copies;}

        public void Borrow()
        {
            if (copies > 0) {copies--; System.out.println("Successfully Borrowed...."); }
            else {System.out.println("Copies Not Avialable");}

        }

        public void Return()
        {
            copies++;
            System.out.println("Successfully Returned...");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[]  books = new Book[3];

        for (int i = 0; i < books.length; i++)
        {
            books[i] = new Book();

            System.out.println("\n------------- Book no:"+(i+1)+" -------------");
            System.out.println("Enter the Book Title:");
            books[i].setTile(sc.nextLine());
            System.out.println("Enter the Price:");
            books[i].setPrice(sc.nextDouble());
            System.out.println("Enter the Copies:");
            books[i].setCopies(sc.nextInt());
            sc.nextLine();
        }

        int choice = 0;
        boolean found;
        do {
            System.out.println("----------------------------");
            System.out.println("\n1) Show all books \n2) Borrow a book \n3) Return a book \n4) Exit");
            System.out.println("Enter the Option Number: ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("\n------- Displaye All Books --------");
                    for (Book b:books)
                    {
                        System.out.println("Book: "+b.getTile()+" | Price: "+b.getPrice()+" | Copies: "+b.getCopies());
                    }
                    break;
                case 2:
                    System.out.println("\n-------- Borrow Books ----------");
                    System.out.println("Enter the Book Name:");
                    sc.nextLine();
                    String take = sc.nextLine();

                    found = false;
                    for (Book b:books)
                    {
                        if (b.getTile().equalsIgnoreCase(take))
                        {
                            b.Borrow();
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                    {
                        System.out.println("Book Not Found");
                    }
                    break;
                case 3:
                    System.out.println("--------- Return Book -----------");
                    System.out.println("Enter the Book Name:");
                    sc.nextLine();
                    String give = sc.nextLine();

                    found = false;
                    for (Book b:books)
                    {
                        if (b.getTile().equalsIgnoreCase(give))
                        {
                            b.Return();
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                    {
                        System.out.println("Book Not Found");
                    }
                    break;
                case 4:
                    System.out.println("Exiting.........");
                    break;
                default:
                    System.out.println("Invalid");
            }
        } while (choice != 4);
    }
}
