public class Test {

    public static void main(String[] args) {

        Customer customer1 = new Customer("John", 890);
        Taxi taxi1 = new Taxi("Bravo");
        customer1.callTaxi(taxi1);

        Customer customer2 = new Customer("Mike", 1290);
        Taxi taxi2 = new Taxi("Hello");
        customer2.callTaxi(taxi2);


    }
}
