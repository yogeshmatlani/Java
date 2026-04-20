package OOP_LAB_PRACTICE;
import java.util.Scanner;

public class UpdateStudentMarks_Q11 {

    private static class Student{

        private String name;
        private double marks;

        public void setName(String name){this.name = name;}
        public void setMarks(double marks)
        {
            if (marks >= 0 && marks <= 100)
            {
                this.marks = marks;
            }
            else {
                System.out.println("Invalid! Marks Entered");
            }
        }
        public String getName() {return name;}
        public double getMarks(){return marks;}
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student[] std = new Student[3];

        for (int i = 0; i < std.length; i++)
        {
            std[i] = new Student();
            System.out.println("---------- Student no:"+(i+1)+"----------");
            System.out.println("Enter the Name:");
            std[i].setName(sc.nextLine());
            System.out.println("Enter the Marks:");
            std[i].setMarks(sc.nextDouble());
            sc.nextLine();
        }

        System.out.println("------- Update Marks -----");
        System.out.println("Enter the Student Name:");
        String search = sc.nextLine();

        boolean found = false;

        for (Student s:std)
        {
            if (s.getName().equalsIgnoreCase(search))
            {
                System.out.println("Enter the New Marks: ");
                s.setMarks(sc.nextDouble());
                sc.nextLine();
                found = true;
                break;
            }
        }

        if (!found){
            System.out.println("Student Not Found!");
        }

        System.out.println("------------------ Updated Student Marks --------------------");
        for (Student s:std)
        {
            System.out.println("Name: "+s.getName()+" | Marks: "+s.getMarks());
        }
    }
}
