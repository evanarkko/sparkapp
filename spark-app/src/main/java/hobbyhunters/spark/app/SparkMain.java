package hobbyhunters.spark.app;

import java.util.HashMap;
import spark.ModelAndView;
import static spark.Spark.*;

public class SparkMain {
    
    public static void main(String[] args) {
        port(Constants.PORT);
        get("/EventSpark", (req, res) -> {
            HashMap map = new HashMap<>();

            return new ModelAndView(map, "mainpage");
        });
    }

}
