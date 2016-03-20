package hobbyhunters.spark.app.user;

/**
 * Scoping settings.
 * 
 * @author Axel Wallin
 */
public class Scope {
    
    private boolean charitable;
    public double[] price;
    public int[] physicalSettings, adrenalineSettings;
    
    public Scope(boolean charitable, double[] priceRange,
            int[] physicalSettings, int[] adrenalineSettings) {
        this.charitable = charitable;
        this.price = priceRange;
        this.physicalSettings = physicalSettings;
        this.adrenalineSettings = adrenalineSettings;
    }
    
    public boolean isCharitable() {
        return charitable;
    }
    
    public double[] getPriceRange() {
        return price;
    }
    
    public int[] getPhysicalSettings() {
        return physicalSettings;
    }
    
    public int[] getAdrenalineSettings() {
        return adrenalineSettings;
    }

}
