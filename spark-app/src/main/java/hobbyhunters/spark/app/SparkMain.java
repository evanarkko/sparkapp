package hobbyhunters.spark.app;

import hobbyhunters.spark.app.user.Gender;
import hobbyhunters.spark.app.user.User;
import java.util.HashMap;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

public class SparkMain {
    
    public static void main(String[] args)  throws ClassNotFoundException {
        port(Constants.PORT);
        User u = new User("Evan", 19, Gender.MALE);
        
        get("/login", (req, res) -> {
            HashMap map = new HashMap<>();
            return new ModelAndView(map, "login");
        }, new ThymeleafTemplateEngine());
        
        post("/login", (req, res) -> {
            String name = req.queryParams("name");
            String password = req.queryParams("password");
            return name + " passu:"+ password;
        });
        
        get("/spark", (req, res) -> {
            HashMap map = new HashMap<>();
            map.put("usersName", u.getName());
            map.put("usersAge", u.getAge());
            map.put("usersGender", u.getGender());

            return new ModelAndView(map, "spark");
        }, new ThymeleafTemplateEngine());
        
        
        
    }

}
