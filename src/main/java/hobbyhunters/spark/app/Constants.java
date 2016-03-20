
package hobbyhunters.spark.app;

import static spark.Spark.port;

/**
 * Application constants.
 * 
 * @author Axel Wallin
 */
public class Constants {
    
    public static final Integer PORT = 
            (System.getenv("PORT") == null ? 4444 : Integer.valueOf(System.getenv("PORT")));
    
    public static final String BASE_URL = "https://damp-spire-97807.herokuapp.com";
}
