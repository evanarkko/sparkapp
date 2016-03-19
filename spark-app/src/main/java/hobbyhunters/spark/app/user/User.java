package hobbyhunters.spark.app.user;

import hobbyhunters.spark.app.user.meta.PriceRange;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eamiller
 */
public class User {
    
    private String name;
    private int age;
    private PriceRange priceRange;
    private String location;
    private List<User> friends;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
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

    public PriceRange getPriceRange() {
        return priceRange;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriceRange(PriceRange priceRange) {
        this.priceRange = priceRange;
    }
    
    public void addFriend(User user){
        friends.add(user);
    }
    
    
    
    
}
