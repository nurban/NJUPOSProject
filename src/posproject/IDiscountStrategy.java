
package posproject;

/**
 *
 * @author Neil Urban
 * Version: 1.0
 */
public interface IDiscountStrategy {
   public abstract double getDiscount(double price, int quantity);
}
