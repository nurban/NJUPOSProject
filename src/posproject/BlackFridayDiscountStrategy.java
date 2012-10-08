
package posproject;

/**
 *
 * @author nurban
 * Version: 1.0
 */
public class BlackFridayDiscountStrategy implements IDiscountStrategy {
    //final variable which sets this discount rate to 85%
    private final double DISCOUNT_RATE = .85;
    
    @Override
    public double getDiscount(double price, int quantity) {
        return price * quantity * DISCOUNT_RATE;
    }
    
}
