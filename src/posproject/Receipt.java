
package posproject;

/**
 *
 * @author Neil Urban
 * Version: Beta (not fully functional yet)
 */
public class Receipt {
    private double finalTotal;
    private double discountTotal;
    private double finalTotalWithDiscount;
    
    public void addNewLineItemToArray(Product product, int quantity) {
        LineItem item = new LineItem(product, quantity);
        addToArray(item);
    }
}
