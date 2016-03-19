package hobbyhunters.spark.app.model;

public class Event {
   
    private double price;
    private String name;
    
    public Event(double price, String name) {
        this.price = price;
        this.name = name;      
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getName() {
        return name;
    }
}
