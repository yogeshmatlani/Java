import java.util.Scanner;

public static class Employee{
    private String name;
    private double salary;
    private int years;

    public void setName(String name){ this.name = name;}
    public void setSalary(double salary)
    {
        if (salary >= 0)
        {
            this.salary = salary;
        }
        else {
            System.out.println("Salary Must be Greater Than 0");
        }
    }
    public void setYears(int years)
    {
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getYears() {
        return years;
    }

    public double calculateBonus()
    {
        return years >= 5 ? salary*0.20 : salary*0.10;
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Employee[] emp = new Employee[3];

    for (int i = 0; i < emp.length; i++)
    {
        emp[i] = new Employee();
        System.out.println("---- Employee no:"+(i+1)+"------");
        System.out.println("Enter the Employee Name: ");
        emp[i].setName(sc.nextLine());
        System.out.println("Enter the Salary:");
        emp[i].setSalary(sc.nextDouble());
        System.out.println("Enter the Experience: ");
        emp[i].setYears(sc.nextInt());
        sc.nextLine();
    }

    Employee maxBonus = emp[0];
    for (Employee e:emp)
    {
        if (e.calculateBonus() > maxBonus.calculateBonus())
        {
            maxBonus = e;
        }
    }

    System.out.println("\n      -------- Max Bonus ----------\n");
    System.out.println("Name:"+maxBonus.getName()+" | Salary"+maxBonus.getSalary()+" | Bonus: "+maxBonus.calculateBonus());

}