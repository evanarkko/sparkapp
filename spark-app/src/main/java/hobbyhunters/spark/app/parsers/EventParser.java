package hobbyhunters.spark.app.parsers;

import hobbyhunters.spark.app.event.Event;
import hobbyhunters.spark.app.event.EventAttribute;
import java.util.ArrayList;
import java.util.List;

/**
 * Parser for event objects.
 * 
 * @author Axel Wallin
 */
public class EventParser implements AbstractParser<Event> {
    
    @Override
    public List<Event> getAll() {
        List<Event> events = new ArrayList<>();
        List<EventAttribute<Object>> attributes 
                = new ArrayList<>();
        EventAttribute<Object> charitable = 
                new EventAttribute<Object>() {

            @Override
            public Boolean getValue() {
                return Boolean.FALSE;
            }

            @Override
            public String getName() {
                return "charitable";
            }
                    
        };
        EventAttribute<Object> physicalLevel = 
                new EventAttribute<Object>() {

            @Override
            public Integer getValue() {
                return 10;
            }

            @Override
            public String getName() {
                return "physicalLevel";
            }
                    
        };
        attributes.add(physicalLevel);
        attributes.add(charitable);
        Event event = new Event(0.0d, "Full Marathon", attributes);
        events.add(event);
        return events;
    }

    @Override
    public Event getOne() {
        return null;
    }

}
