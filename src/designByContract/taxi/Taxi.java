package designByContract.taxi;

public class Taxi {

    private String name;
    private Customer customer;

    public Taxi(String name) {
        this.name = name;
    }

    public void take(Customer customer) {
        if (preCondition(customer)) {
           // this.customer = customer;
            System.out.println("Taxi " + getName() + " is taking the customer.");
            Service service = service();
            System.out.println(service);

        } else
            System.out.println("Taxi could not take the customer " + customer.getName() + " due to large distance");
    }


    public boolean preCondition(Customer customer) {
        if (customer.getDistance() < 1000) {
            return true;
        }else
            return false;
    }
    private Service service(){
        return new Service();

    }

    public String getName(){
        return name;
    }
}
