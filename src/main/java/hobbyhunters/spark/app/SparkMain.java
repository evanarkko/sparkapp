package hobbyhunters.spark.app;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

/**
 * The main class of SparkApp.
 * 
 * @author Axel Wallin
 */
public class SparkMain {
    
   /**
    * Program entry point, binds some GETs/POSTs.
    * 
    * @param args the arguments.
    */
   public static void main(String[] args) {
        staticFileLocation("/public");
        port(Constants.PORT);
        /* When scoping window is opened */
        get("/scope", (req, res) -> {
            Map map = new HashMap<>();
            map.put("baseUrl", Constants.BASE_URL);
            return new ModelAndView(map, "scope");
        }, new ThymeleafTemplateEngine());
        
        /* When the scope is submitted and should be saved. */
        post("/submitScope", (req, res) -> {
            Map map = new HashMap<>();
            Set<String> data = req.queryParams();
            data.stream().forEach((s) -> {
                System.out.println("s: " + s);
            });
            return new ModelAndView(map, "main");
        }, new ThymeleafTemplateEngine());
        init();
    }
}
