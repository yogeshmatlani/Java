package OOP_LAB_PRACTICE;
import java.util.Scanner;

public class EmployeeExperience_Q13 {
    public static class Employee{

        private String name;
        private double salary;
        private int experience;

        public void setName(String name){this.name = name;}
        public void setSalary(double salary)
        {
            if (salary >= 0)
            {
                this.salary = salary;
            }
            else {
                System.out.println("Invalid Salary Entered");
            }
        }
        public void setExperience(int experience)
        {
            if (experience >= 0)
            {
                this.experience = experience;
            }
            else {
                System.out.println("Invalid");
            }
        }

        public String getName(){return name;}
        public double getSalary(){return salary;}
        public int getExperience(){return experience;}

        public boolean display()
        {
            return salary >= 50000 && experience >= 5;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[3];

        for (int i = 0; i < emp.length; i++)
        {
            emp[i] = new Employee();

            System.out.println("--------- Employee no:"+(i+1)+" -----------");
            System.out.println("Enter the Name:");
            emp[i].setName(sc.nextLine());
            System.out.println("Enter the Salary:");
            emp[i].setSalary(sc.nextDouble());
            System.out.println("Enter the Experience:");
            emp[i].setExperience(sc.nextInt());
            sc.nextLine();
        }

        System.out.println("\n------------------ Employees Experience Above 5 year & Salary >= 50K ----------------------\n");
        for (Employee e:emp)
        {
            if (e.display())
            {
                System.out.println("Name:"+e.getName()+" | Salary:"+e.getSalary()+" | Experience:"+e.getExperience());
            }
        }
    }
}
