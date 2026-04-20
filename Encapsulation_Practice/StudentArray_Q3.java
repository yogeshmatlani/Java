package OOP_LAB_PRACTICE;
import java.util.Scanner;

public class StudentArray_Q3 {
    public static class Student{

        private String name;
        private double marks;

        public void setName(String name){this.name = name;}
        public void setMarks(double marks){this.marks = marks;}
        public String getName(){return name;}
        public double getMarks(){return marks;}

        public boolean ispass(){return marks>=55;}
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student[] std = new Student[3];

        for (int i = 0; i < std.length; i++)
        {
            std[i] = new Student();

            System.out.println("---- Student no: "+(i+1)+"----");
            System.out.println("Enter the Name:");
            std[i].setName(sc.nextLine());
            System.out.println("Enter the Marks:");
            std[i].setMarks(sc.nextDouble());
            sc.nextLine();
        }

        System.out.println("\n---- Passed Student ------\n");

        for (Student s:std)
        {
            if (s.ispass())
            {
                System.out.println("Name: "+s.getName()+ " | Marks: "+ s.getMarks());
            }
        }
    }
}
