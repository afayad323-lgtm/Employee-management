public class SalariedEmployee extends Employee{
    private double deduction;

    public SalariedEmployee(){}

    public SalariedEmployee (int id , String name , String depart , double salary , double bonus , boolean resident , double deduction){
        super(id , name , depart , salary , bonus , resident);
        this.deduction = deduction;
    }

    @Override
    public double totalSalary (){
        return super.totalSalary() - deduction;
    }

    @Override
    public void printEmpData(){
         super.printEmpData();
         System.out.println("deduction: " + deduction);

        System.out.println( "net salary: "+totalSalary());
    }
}
