package hobbyhunters.spark.app.user.meta;

/**
 * This class will store attributes.
 * @author mcrintah
 */
public class ScopingSettings {
    
    private Scale adrenaline, physical;
    private PriceRange priceRange;
    
    public ScopingSettings(int adrenalineLvl, int physicalLvl, PriceRange priceRange) {
        this.adrenaline.setValue(adrenalineLvl);
        this.physical.setValue(physicalLvl);
        this.priceRange = priceRange;
    }
    
    public void setAdrenaline(int level) {
        adrenaline.setValue(level);
    }
    
    public void setPhysical(int level) {
        physical.setValue(level);
    }
    
    public int getAdrenaline() {
        return adrenaline.value;
    }
    
    public int getPhysical() {
        return physical.value;
    }
    
}
