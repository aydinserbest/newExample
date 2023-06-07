package designByContract.taxi;

public class Customer {
    private String name;

    private int distance;

    public Customer(String name, int distance){
        this.name=name;
        this.distance=distance;
    }

    public void callTaxi(Taxi taxi){
        taxi.take(this);
    }

    public void payTaxi(Taxi taxi){
        System.out.println("paying taxi "+taxi.getName());
    }


    public String getName(){
        return name;
    }
    public int getDistance(){
        return distance;
    }

}
