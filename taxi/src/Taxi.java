public class Taxi {
    private String name;

    public Taxi(String name){
        this.name=name;
    }

    public void take(Customer customer){
        if (preCondition(customer)){
            System.out.println("Taxi "+getName()+ " is taking "+customer.getName());
            Service service=service();
            System.out.println(service);
        }else
            System.out.println("taxi could not take the customer "+customer.getName()+ " due to the long distance");
    }
    public boolean preCondition(Customer customer){
        if (customer.getDistance()<1000)
            return true;
        else
            return false;
    }

    public Service service(){
        return new Service();
    }
    public String getName(){
        return name;
    }
}
