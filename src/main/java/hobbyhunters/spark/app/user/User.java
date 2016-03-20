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
    private Scope scope;
    private Gender gender;

    public User(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
        this.gender = gender;
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
    
    public Scope getScope() {
        return scope;
    }
    
    public void setScope(Scope scope) {
        this.scope = scope;
    }
    
    public void addFriend(User user){
        friends.add(user);
    }
    
    public Gender getGender() {
        return gender;
    }
    
    public enum Gender {
        
        FEMALE,
        MALE,
        OTHER;
        
    }
}