/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hobbyhunters.spark.app.user.meta;

/**
 * 
 * @author mcrintah
 */
public class Scale {
    
    int value=0;
    
    public boolean Scale(int i) {
        value=i;
        return checkRange();
    }
    
    public boolean setValue(int i) {
        value=i;
        return checkRange();
    }
    
    public int getValue() {
        return value;
    }
    
    private boolean checkRange() {
        if(value > 100) {
            value = 100;
            return false;
        }
        if(value < 0) {
            value = 0;
            return false;
        }
        return true;
    }
    
}
