public class HourlyEmployee extends Employee{
    private int hours;
    private double hourRate;

    public HourlyEmployee(){}

    public HourlyEmployee(int id , String name , Department department,double salary , double bonus , boolean resident, int hours , double hourRate){
        super(id, name, department, salary, bonus,resident);
        this.hours = hours;
        this.hourRate = hourRate;
    }

    @Override
    public double totalSalary(){
        return (hours*hourRate) + getBonus();
    }

    @Override
    public EmployeeType getEmployeeType(){
        return EmployeeType.Hourly;
    }

}
