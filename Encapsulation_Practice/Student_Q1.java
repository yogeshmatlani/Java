package OOP_LAB_PRACTICE;
import java.util.Scanner;

public class Student_Q1 {
    public static class Student{

        private String name;
        private double marks;

        public void setName(String name) {
            this.name = name;
        }
        public void setMarks(double marks)
        {
            if (marks >= 0 && marks <= 100)
            {
                this.marks = marks;
            }
            else {
                System.out.println("Invalid Marks Entered");
            }
        }

        public String getName()
        {
            return name;
        }
        public double getMarks()
        {
            return marks;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        System.out.println("\nEnter the name:");
        s1.setName(sc.nextLine());
        System.out.println("Enter the Marks:");
        s1.setMarks(sc.nextDouble());
        sc.nextLine();

        System.out.println("\n----- Students -----\n");
        System.out.println("Name: "+s1.getName()+" | Marks: "+s1.getMarks());
    }
}
