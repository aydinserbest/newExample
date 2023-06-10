import javax.swing.plaf.PanelUI;

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

    public String getName(){
        return name;
    }

    public int getDistance(){
        return distance;
    }
}
