
package posproject;

/**
 *
 * @author Neil Urban
 * Version: 1.0
 */
public class NoDiscountStrategy implements IDiscountStrategy {
    //there is no discount here.
    
    @Override
    public double getDiscount(double price, int quantity) {
        return 0;
    }
}
