package hobbyhunters.spark.app.event;

/**
 * Event attribute.
 * 
 * @param <T> the type of this attribute.
 * @author Axel Wallin
 */
public interface EventAttribute<T> {

    public T getValue();
    public String getName();
}
