package hobbyhunters.spark.app;

import java.util.HashMap;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

public class SparkMain {
    
    public static void main(String[] args)  throws ClassNotFoundException {
        port(Constants.PORT);
        get("/sivu", (req, res) -> {
//            return "Hei maailma";
            HashMap map = new HashMap<>();

            return new ModelAndView(map, "index");
        }, new ThymeleafTemplateEngine());
    }

}
