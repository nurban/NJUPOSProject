
package posproject;

/**
 *
 * @author Neil Urban
 * Version: Beta (not fully functional yet)
 */
public interface IDiscountStrategy {
   public abstract double getDiscount(double price, int quantity);
}
