package designByContract.taxi;

public class Test {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Mehmet", 800);
        Taxi taxi1 = new Taxi("Orhan");
        customer1.callTaxi(taxi1);


        Customer customer2 = new Customer("Kamil", 1200);
        Taxi taxi2 = new Taxi("Zafer");
        customer2.callTaxi(taxi2);
        System.out.println("mrb");
        System.out.println("kkkkkg");
        System.out.println("hhhhhh");
        System.out.println("gg");


    }
}
