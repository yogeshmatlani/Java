package OOP_LAB_PRACTICE;
import java.util.Scanner;

public class LibraryBookSearch_Q7 {

    public static class Book{

        private String title;
        private String author;
        private double price;

        public void setTitle(String title)
        {
            this.title = title;
        }
        public void setAuthor(String author)
        {
            this.author = author;
        }
        public void setPrice(double price)
        {
            if (price >= 0)
            {
                this.price = price;
            }
            else {
                System.out.println("Price Must be Greater than 0");
            }

        }

        public String getTitle(){ return title;}
        public String getAuthor(){ return author;}
        public double getPrice(){ return price;}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[3];

        for (int i = 0; i < books.length; i++)
        {
            books[i] = new Book();

            System.out.println("------- Book no:"+(i+1)+" ---------");
            System.out.println("Enter the Title:");
            books[i].setTitle(sc.nextLine());
            System.out.println("Enter the Author:");
            books[i].setAuthor(sc.nextLine());
            System.out.println("Enter the Price");
            books[i].setPrice(sc.nextDouble());
            sc.nextLine();
        }

        System.out.println("----- Search the Book ------");

        System.out.println("Enter the Title to Search:");
        String search = sc.nextLine();

        boolean found = false;
        for (Book b:books)
        {
            if (b.getTitle().equalsIgnoreCase(search))
            {
                System.out.println("BooK: "+b.getTitle()+" | Author: "+b.getAuthor()+" | Price:"+b.getPrice());
                found = true;
                break;
            }
        }

        if (!found)
        {
            System.out.println("Book Not Founded!");
        }
    }
}
