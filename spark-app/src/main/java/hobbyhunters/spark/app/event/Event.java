package hobbyhunters.spark.app.event;

import hobbyhunters.spark.app.user.User;
import java.util.List;

/**
 * Represents an event.
 * 
 * @author Axel Wallin
 */
public class Event {
   
    private double price;
    private String name, description;
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
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Event name: ").append(name).append("\n");
        builder.append("Event price: ").append(price).append("\n");
        builder.append("Event attributes {\n");
        for(EventAttribute attr : attributes) {
            builder.append("\t name: ").append(attr.getName()).append("\n");
            builder.append("\t value: ").append(attr.getValue()).append("\n");
        }
        builder.append("}");
        return builder.toString();
    }
}
