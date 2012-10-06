
package posproject;

/**
 *
 * @author Neil Urban
 * Version: Beta (not fully functional yet)
 */
public interface IDiscountStrategy {
   public abstract void getDiscount(int quantity, double price);
}
