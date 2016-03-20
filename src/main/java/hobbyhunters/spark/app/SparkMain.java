package hobbyhunters.spark.app;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

public class SparkMain {
    
   public static void main(String[] args) {
        staticFileLocation("/public");
        port(Constants.PORT);
        get("/scope", (req, res) -> {
            Map map = new HashMap<>();
            map.put("baseUrl", Constants.BASE_URL);
            return new ModelAndView(map, "scope");
        }, new ThymeleafTemplateEngine());
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
