import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {

            System.out.println("\n====== EMPLOYEE SYSTEM ======");
            System.out.println("1- Add Employee");
            System.out.println("2- Delete Employee");
            System.out.println("3- Update Salary");
            System.out.println("4- Search Employee");
            System.out.println("5- Reports");
            System.out.println("6- Exit");
            System.out.print("Choice: ");

            int choice = reader.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter id, name, salary:");
                    int id = reader.nextInt();
                    String name = reader.next();
                    double salary = reader.nextDouble();

                    employees.add(new SalariedEmployee(
                            id, name, Department.HR,
                            salary, 0, true, 0
                    ));

                    break;

                case 2:
                    System.out.print("Enter id: ");
                    EmployeeService.deleteById(employees, reader.nextInt());
                    break;

                case 3:
                    System.out.print("Enter id and new salary: ");
                    int sid = reader.nextInt();
                    double newSalary = reader.nextDouble();
                    EmployeeService.updateSalary(employees, sid, newSalary);
                    break;

                case 4:
                    System.out.print("Enter id: ");
                    Employee e = EmployeeService.findById(employees, reader.nextInt());

                    if (e != null) {
                        e.printEmpData();
                    } else {
                        System.out.println("Employee Not Found");
                    }
                    break;

                case 5:
                    EmployeeService.showReports(employees);
                    break;

                case 6:
                    System.out.println("Goodbye");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}