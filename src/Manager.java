public class Manager extends Employee{
    private double allowance;

    public Manager(){
        super();
        allowance = 1000;
    }

    public Manager (int id , String name , String depart , double salary , double bonus , boolean resident , double allowance){
        super(id, name, depart, salary, bonus, resident);
        this.allowance = allowance;
    }

    public void setAllowance(double allowance) {
        if (allowance >= 0)
        this.allowance = allowance;
    }
    public double getAllowance(){
        return allowance;
    }

    public double totalIncome(){
        return getSalary() + getBonus() + allowance;
    }

}
