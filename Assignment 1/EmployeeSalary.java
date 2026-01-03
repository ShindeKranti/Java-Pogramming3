import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int empId;
        double basic, hra, da, tax, takeHome;

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();

        hra = 0.10 * basic;    
        da = 0.30 * basic;      
        tax = 0.05 * basic;    

        takeHome = basic + hra + da - tax;

        System.out.println("\nEmployee ID: " + empId);
        System.out.println("Take Home Salary: " + takeHome);

            }
}