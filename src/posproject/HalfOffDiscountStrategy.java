
package posproject;

/**
 *
 * @author nurban
 * Version: 1.0
 */
public class HalfOffDiscountStrategy implements IDiscountStrategy {
    //final variable which sets this discount rate to 50%
    private final double DISCOUNT_RATE = .50;
    
    @Override
    public double getDiscount(double price, int quantity) {
        return price * quantity * DISCOUNT_RATE;
    }
    
}
