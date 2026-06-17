public class SalariedEmployee extends Employee{
    private double deduction;

    public SalariedEmployee(){}

    public SalariedEmployee (int id , String name , Department department , double salary , double bonus , boolean resident , double deduction){
        super(id , name , department, salary , bonus , resident);
        this.deduction = deduction;
    }

    @Override
    public double totalSalary (){
        return (getSalary() + getBonus())  - deduction;
    }

    @Override
    public void printEmpData(){
         super.printEmpData();
         System.out.println("deduction: " + deduction);

        System.out.println( "net salary: "+totalSalary());
    }
    @Override
    public EmployeeType getEmployeeType(){
        return EmployeeType.Salaried;
    }
}
