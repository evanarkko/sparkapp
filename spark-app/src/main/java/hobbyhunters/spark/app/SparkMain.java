package hobbyhunters.spark.app;

import static spark.Spark.*;

public class SparkMain {
    
    public static void main(String[] args) {
        port(Constants.PORT);
        get("/", (req, res) -> "Hello! We're live.");
    }

}
