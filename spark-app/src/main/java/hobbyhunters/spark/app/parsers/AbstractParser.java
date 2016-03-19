package hobbyhunters.spark.app.parsers;

import java.util.List;

/**
 * Abstract representation of a parser.
 * 
 * @param <T> the type of this parser.
 * @author Axel Wallin
 */
public interface AbstractParser<T> {
    
    /**
     * Gets all the objects.
     * 
     * @return all parsed objects. List generic is {#T}.
     */
    public List<T> getAll();
    
    /**
     * Gets one object.
     * 
     * @return a parsed object with the type {#T}.
     */
    public T getOne();

}
