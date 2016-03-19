package hobbyhunters.spark.app.user.meta;

public enum PriceRange {
    
    FREE(0, 0),
    CHEAP(0, 10),
    MEDIUM(10, 15),
    EXPENSIVE(15, 25),
    VERY_EXPENSIVE(25, 100);

    private int lower, upper;
    
    PriceRange(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
    }
    
    public int getLower() {
        return lower;
    }
    
    public int getUpper() {
        return upper;
    }
    
    public boolean withinBounds(int price) {
        return price >= lower && price <= upper;
    }
}
