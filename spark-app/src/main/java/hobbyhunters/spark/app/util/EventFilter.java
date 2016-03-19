package hobbyhunters.spark.app.util;

import hobbyhunters.spark.app.model.Event;
import java.util.List;

/**
 * Handy class to filter events according to user prefs.
 * 
 * @author Axel Wallin
 */
public class EventFilter {
    
    /**
     * The initial list of events that are attendable.
     */
    private List<Event> candidates;
    
    public EventFilter(List<Event> candidates) {
        this.candidates = candidates;
    }
    
    public EventFilter filter(User user) {
        List<Event> toFilter = new ArrayList<Event>();
        candidates.stream()
                .filter((event) -> (!event.attendableBy(user)))
                .forEach((event) -> {
            toFilter.add(event);
        });
        candidates.removeAll(toFilter);
        return this;
    }
    
    public EventFilter filter(User... users) {
        for(User user : users) {
            filter(user);
        }
        return this;
    }
    
    public List<Event> get() {
        return candidates;
    }

}
