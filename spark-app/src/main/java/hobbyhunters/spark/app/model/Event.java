package hobbyhunters.spark.app.model;

import hobbyhunters.spark.app.user.User;
import java.util.stream.Stream;

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

    public boolean attendableBy(User user) {
        return false;
    }
}
