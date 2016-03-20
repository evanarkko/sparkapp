package hobbyhunters.spark.app;

<<<<<<< HEAD:src/main/java/hobbyhunters/spark/app/SparkMain.java
import hobbyhunters.spark.app.event.Event;
import hobbyhunters.spark.app.parsers.AbstractParser;
import hobbyhunters.spark.app.parsers.EventParser;
=======
import hobbyhunters.spark.app.user.Gender;
import hobbyhunters.spark.app.user.User;
>>>>>>> evan:spark-app/src/main/java/hobbyhunters/spark/app/SparkMain.java
import java.util.HashMap;
import java.util.List;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

public class SparkMain {
    
<<<<<<< HEAD:src/main/java/hobbyhunters/spark/app/SparkMain.java
    public static void main(String[] args) {
        staticFileLocation("/public");
        port(Constants.PORT);
        get("/sivu", (req, res) -> {
            return "Hei maailma";
//            HashMap map = new HashMap<>();
//
//            return new ModelAndView(map, "index");
        });//, new ThymeleafTemplateEngine());
        post("/fblogin", (req, res) -> {
            HashMap map = new HashMap<>();
            System.out.println();
            return new ModelAndView(map, "index");
        }, new ThymeleafTemplateEngine());
        init();
=======
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
        
        
        
>>>>>>> evan:spark-app/src/main/java/hobbyhunters/spark/app/SparkMain.java
    }

}
