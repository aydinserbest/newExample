package designByContract.employee;

public class Director extends Manager{

    protected double bonus;
    
    protected int num;

    public Director(int no, int year,String name, String workingDepartment, String managingDepartment , double bonus){
        super(no,year,name, workingDepartment,managingDepartment);
        this.bonus=bonus;
    }
    public void work(){
        System.out.println("Director is working");
        manage();
    }
    public void manage(){
        System.out.println("Director manages whole company");
        makeAStrategicPlan();
    }
    public void makeAStrategicPlan(){
        System.out.println("Director makes a strategic plan for the company");
    }
    public double getBonus(){
        return bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
    public void printInfo(){
        System.out.println("\nDirector Info");
        super.printInfo();
    }

    @Override
    public String toString() {
        return "Director [bonus=" + bonus + ", departmentManaged=" + departmentManaged + ", no=" + no + ", name=" + name
                + ", year=" + year + ", department=" + department + ", salary=" + salary + "]";
    }
}
