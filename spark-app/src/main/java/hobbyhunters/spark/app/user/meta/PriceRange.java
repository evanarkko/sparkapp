package hobbyhunters.spark.app.user.meta;

public enum PriceRange {
    
    NOT_EXPENSIVE(0, 10);

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
