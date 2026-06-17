
enum Department  {it , HR , accountant};
enum EmployeeType {Manager , Salaried , Hourly};

public abstract class Employee {
    private int empId;
    private String name;
    private Department department;

    private double salary;
    private double bonus;
    private boolean resident;
    private static int count = 0;

    public Employee(){
        empId = 100;
        name = "no name";
        department = Department.HR;
        salary = 5000;
        bonus = 300;
        resident = true;
        count++;

    }
    public Employee (int id , String name){
        this.empId = id;
        this.name = (name == null || name.isBlank())?"no name":name;
        count++;

    }

    public Employee (int id , String name , boolean resident){
        this (id, name);
        this.resident = resident;


    }

    public Employee (int id , String name , Department department , double salary , double bonus , boolean resident){


        this (id, name, resident);
        this.department = department;
        this.salary = (salary < 0) ? 0 : salary;
        this.bonus = (bonus < 0)?0:bonus;

    }

    public void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
    }

    public void setBonus(double bonus) {
        if (bonus >= 0)
            this.bonus = bonus;
    }

    public void setDepartment(Department department) {
        if (department != null )
            this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public abstract EmployeeType getEmployeeType();

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public Department getDepartment() {
        return department;
    }

    public boolean isResident() {
        return resident;
    }

    public abstract double totalSalary ();

    public void printEmpData (){
        System.out.println("ID: " + empId);
        System.out.println("NAME: " + name);
        System.out.println("DEPART: " + department);
        System.out.println("Type: " + this.getEmployeeType());
        System.out.println("SALARY: " + salary);
        System.out.println("BONUS: " + bonus);
        System.out.println("TOTAL SALARY: "+this.totalSalary());
        System.out.println("RESIDENT: " + isResident());


    }

    public static int getCount() {
        return count;
    }
}
