package hobbyhunters.spark.app.user;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an user.
 * 
 * @author Evan Miller
 * @author Axel Wallin
 */
public class User {
    
    private String name, location;
    private int age;
    private double priceMin, priceMax;
    private List<User> friends;

    public User(String name, int age, double priceMin, double priceMax) {
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
        this.priceMin = priceMin;
        this.priceMax = priceMax;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public double getPriceMin() {
        return priceMin;
    }
    
    public double getPriceMax() {
        return priceMax;
    }
    
    public void setPriceRange(int min, int max) {
        this.priceMin = min;
        this.priceMax = max;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addFriend(User user){
        friends.add(user);
    }
}