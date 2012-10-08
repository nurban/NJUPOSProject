
package posproject;

/**
 *
 * @author Neil Urban
 * Version: 1.0
 */
public class ChristmasDiscountStrategy implements IDiscountStrategy {
    //final variable which sets this discount rate to 75%
    private final double DISCOUNT_RATE = .75;
    
    @Override
    public double getDiscount(double price, int quantity) {
        return price * quantity * DISCOUNT_RATE;
    }
}
