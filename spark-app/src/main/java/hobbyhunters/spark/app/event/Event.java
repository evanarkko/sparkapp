package hobbyhunters.spark.app.event;

import hobbyhunters.spark.app.user.User;
import java.util.List;

public class Event {
   
    private double price;
    private String name;
    private List<EventAttribute<Object>> attributes;
    
    public Event(double price, String name, 
            List<EventAttribute<Object>> attributes) {
        this.price = price;
        this.name = name;
        this.attributes = attributes;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getName() {
        return name;
    }
    
    public List<EventAttribute<Object>> getAttributes() {
        return attributes;
    }

    public boolean attendableBy(User user) {
        return false;
    }
}
