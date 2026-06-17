import java.util.ArrayList;

public class EmployeeService {

    public static void showReports(ArrayList<Employee> employees) {
        System.out.println("\n=== REPORTS ===");
        System.out.println("Total Payroll: " + calculateTotalPayroll(employees));
        System.out.println("Total Employees: " + employees.size());

        if (!employees.isEmpty()) {
            System.out.println("Average Salary: " +
                    (calculateTotalPayroll(employees) / employees.size()));
        }

        System.out.println("\n--- All Employees ---");
        printAll(employees);
    }

    public static double calculateTotalPayroll(ArrayList<Employee> employees) {
        double total = 0;

        for (Employee e : employees) {
            total += e.totalSalary();
        }

        return total;
    }

    public static void printAll(ArrayList<Employee> employees) {
        for (Employee e : employees) {
            e.printEmpData();
            System.out.println("----------------");
        }
    }

    public static Employee findById(ArrayList<Employee> employees, int id) {
        for (Employee e : employees) {
            if (e.getEmpId() == id) {
                return e;
            }
        }
        return null;
    }

    public static void deleteById(ArrayList<Employee> employees, int id) {
        Employee e = findById(employees, id);

        if (e != null) {
            employees.remove(e);
            System.out.println("Employee deleted");
        } else {
            System.out.println("Employee Not Found");
        }
    }

    public static void updateSalary(ArrayList<Employee> employees, int id, double salary) {
        Employee e = findById(employees, id);

        if (e != null) {
            e.setSalary(salary);
            System.out.println("Salary Updated");
        } else {
            System.out.println("Employee Not Found");
        }
    }
}