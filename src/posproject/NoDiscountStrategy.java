
package posproject;

/**
 *
 * @author Neil Urban
 * Version: Beta (not fully functional yet)
 */
public class NoDiscountStrategy implements IDiscountStrategy {
    //there is no discount here.
    
    @Override
    public double getDiscount(double price, int quantity) {
        return quantity * price;
    }
}
