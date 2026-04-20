package OOP_LAB_PRACTICE;
import java.sql.Struct;
import java.util.Scanner;

public class FindTopStudent_Q6 {

    public static class Student{
        private String name;
        private double marks;

        public void setName(String name)
        {
            this.name = name;
        }
        public void setMarks(double marks)
        {
            if (marks >= 0 && marks <= 100)
            {
                this.marks = marks;
            }
            else {
                System.out.println("Invald Marks");
            }

        }
        public String getName(){ return name;}
        public double getMarks(){return marks;}

        public boolean ispass()
        {
            return marks>=50;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student[] std = new Student[3];


        for (int i = 0; i < std.length; i++)
        {
            std[i] = new Student();

            System.out.println("----- Student no:"+(i+1)+"-------");
            System.out.println("Enter the Name:");
            std[i].setName(sc.nextLine());
            System.out.println("Enter the Marks");
            std[i].setMarks(sc.nextDouble());
            sc.nextLine();
        }

        Student topStd = std[0];
        for (Student s: std)
        {
            if (s.getMarks() > topStd.getMarks())
            {
                topStd = s;
            }
        }

        System.out.println("------ Passed Students List -------");

        System.out.println("Top Student: "+topStd.getName() + " | Marks: "+topStd.getMarks());

    }
}
