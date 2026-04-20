package OOP_LAB_PRACTICE;
import java.util.Scanner;

public class EmployeeRecordSystem_Q5 {
    public static class Employee{
        private String name;
        private double salary;
        private int years;

        public void setName(String name){ this.name = name;}

        public void setSalary(double salary){
            if (salary >= 0){
                this.salary = salary;
            }
            else {
                System.out.println("Salary must be Greater than 0");
            }
        }

        public void setYears(int years)
        {
            if (years >= 0)
            {
                this.years = years;
            }
        }

        public String getName(){return name;}
        public double getSalary(){return salary;}
        public int getYears(){return years;}

        public double calculateBonus()
        {
            if (years >= 5)
            {
                return salary*0.2;
            }
            else {
                return salary*0.1;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[3];

        for (int i = 0; i < emp.length; i++)
        {
            emp[i] = new Employee();

            System.out.println("------- Employee no:"+(i+1)+"--------");
            System.out.println("Enter the Name:");
            emp[i].setName(sc.nextLine());
            System.out.println("Enter the Salary:");
            emp[i].setSalary(sc.nextDouble());
            System.out.println("Enter the Experince");
            emp[i].setYears(sc.nextInt());
            sc.nextLine();
        }

        System.out.println("---------------- Employee List ------------------");
        for (Employee e:emp)
        {
            System.out.println("Name:"+e.getName()+" | Salary: "+e.getSalary()+" | Experience: "+e.getYears()+" | Bonus: "+e.calculateBonus());
        }
    }
}
