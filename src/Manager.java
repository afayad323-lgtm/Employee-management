public class Manager extends Employee{
    private double allowance;

    public Manager(){
        super();
        allowance = 1000;
    }

    public Manager (int id , String name , Department department, double salary , double bonus , boolean resident , double allowance){
        super(id, name, department,salary, bonus, resident);
        this.allowance = allowance;
    }

    public void setAllowance(double allowance) {
        if (allowance >= 0)
        this.allowance = allowance;
    }
    public double getAllowance(){
        return allowance;
    }

    public double totalSalary(){
        return getSalary() + getBonus() + allowance;
    }

    @Override
    public EmployeeType getEmployeeType() {
        return EmployeeType.Manager;
    }
}
