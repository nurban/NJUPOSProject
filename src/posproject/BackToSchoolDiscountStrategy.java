
package posproject;

/**
 *
 * @author Neil Urban
 * Version: 1.0
 */
public class BackToSchoolDiscountStrategy implements IDiscountStrategy {
    //final variable which sets this discount rate to 50%
    private final double DISCOUNT_PRICE = .35;
    
    @Override
    public double getDiscount(double price, int quantity) {
        return price * quantity * DISCOUNT_PRICE;
    }
    
}
