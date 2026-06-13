public class Employee {
    private int empId;
    private String name;
    private String department;
    private double salary;
    private double bonus;
    private boolean resident;
    private static int count = 0;

    public Employee(){
        empId = 100;
        name = "no name";
        department = "not assigned yet";
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

    public Employee (int id , String name , String depart , double salary , double bonus , boolean resident){


        this (id, name, resident);
        this.department = (depart == null || depart.isBlank())?"no department":depart;
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

    public void setDepartment(String department) {
        if (department != null && !department.isBlank())
            this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public String getDepartment() {
        return department;
    }

    public boolean isResident() {
        return resident;
    }

    public double totalSalary (){
        return salary + bonus;
}
    public void printEmpData (){
        System.out.println("ID: " + empId);
        System.out.println("NAME: " + name);
        System.out.println("DEPART: " + department);
        System.out.println("SALARY: " + salary);
        System.out.println("BONUS: " + bonus);
        System.out.println("TOTAL SALARY: "+this.totalSalary());
        System.out.println("RESIDENT: " + isResident());


    }

    public static int getCount() {
        return count;
    }
}
