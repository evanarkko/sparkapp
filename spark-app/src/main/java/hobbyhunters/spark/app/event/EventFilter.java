package hobbyhunters.spark.app.event;

import hobbyhunters.spark.app.event.Event;
import hobbyhunters.spark.app.user.User;
import java.util.ArrayList;
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
    
    /**
     * Filter out results that cannot be applied to the given user.
     * 
     * @param user the user to filter out events for.
     * @return this event filter with modified event candidates.
     */
    public EventFilter filter(User user) {
        List<Event> toFilter = new ArrayList<>();
        candidates.stream()
                .filter((event) -> (!event.attendableBy(user)))
                .forEach((event) -> {
            toFilter.add(event);
        });
        candidates.removeAll(toFilter);
        return this;
    }
    
    /**
     * Filter out results that cannot be applied to the given users.
     * 
     * @param users the users to filter out events for.
     * @return this event filter with modified event candidates.
     */
    public EventFilter filter(User... users) {
        for(User user : users) {
            filter(user);
        }
        return this;
    }
    
    /**
     * Get the candidates of this event filter.
     * 
     * @return candidates.
     */
    public List<Event> get() {
        return candidates;
    }

}
