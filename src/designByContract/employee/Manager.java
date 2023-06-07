package designByContract.employee;

public class Manager extends Employee{
    protected String departmentManaged;
    public static final int MANAGEMENT_SALARY = 3000;

    public Manager(int no, int year, String name, String workingDepartment, String departmentManaged){
        super(no,year,name,workingDepartment);
        this.departmentManaged=departmentManaged;
    }
    public void work(){
        System.out.println(" Manager is working");
        manage();
    }
    public void manage(){
        System.out.println("Manager manages department: "+departmentManaged);
    }
    public double calculateSalary(){
        return super.calculateSalary() + MANAGEMENT_SALARY;
    }
    public String getDepartmentManaged(){
        return departmentManaged;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Managing Department: " + departmentManaged);
    }

    @Override
    public String toString() {
        return "Manager [departmentManaged=" + departmentManaged + ", no=" + no + ", name=" + name + ", year=" + year
                + ", department=" + department + ", salary=" + salary + "]";
    }
}
