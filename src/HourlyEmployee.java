public class HourlyEmployee extends Employee{
    private int hours;
    private double hourRate;

    public HourlyEmployee(){}

    public HourlyEmployee(int id , String name , String depart, double salary , double bonus , boolean resident, int hours , double hourRate){
        super(id, name, depart, bonus, salary,resident);
        this.hours = hours;
        this.hourRate = hourRate;
    }

    @Override
    public double totalSalary(){
        return (hours*hourRate) + getBonus();
    }

}
