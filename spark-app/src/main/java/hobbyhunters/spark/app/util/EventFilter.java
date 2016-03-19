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
    
    public List<Event> filter() {
        return null;
    }

}
