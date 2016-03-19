package hobbyhunters.spark.app;

import hobbyhunters.spark.app.event.Event;
import hobbyhunters.spark.app.parsers.AbstractParser;
import hobbyhunters.spark.app.parsers.EventParser;
import java.util.HashMap;
import java.util.List;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

public class SparkMain {
    
    public static void main(String[] args) {
        AbstractParser parser = new EventParser();
        List<Event> events = parser.getAll();
        for(Event event : events) {
            System.out.println(event);
        }
        port(Constants.PORT);
        get("/sivu", (req, res) -> {
            return "Hei maailma";
//            HashMap map = new HashMap<>();
//
//            return new ModelAndView(map, "index");
        });//, new ThymeleafTemplateEngine());
    }

}
