//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Employee e1 = new Employee();
Employee e2 = new Employee();
Employee e3 = new Employee(1 , "ahmed");
Employee e4 = new Employee(3 , "ahmed" , "it" , 5000 , 300 , true);
System.out.println(Employee.getCount());

Manager m1 = new Manager(1,"ahmed","it",2500,500,true,500);

System.out.println(m1.totalIncome());

    }

}