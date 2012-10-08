
package posproject;

import java.text.NumberFormat;
/**
 *
 * @author Neil Urban
 * Version: 1.0
 */
public class LineItem {
    private int quantity;

    //Create an object of type Product.
    private Product product;
    
    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public final String getLineItemDetails() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        // Discount is not determined until here in case a price would
        // be reset
        double discount = getProduct().getSaleDiscount(getQuantity());

        String itemDetail = "";
        itemDetail += product.getProductName() + "  ";
        itemDetail += product.getProductDescription() + "   ";
        itemDetail += this.getQuantity() + "   ";
        itemDetail += currencyFormat.format(product.getProductPrice()) + "     ";
        itemDetail += currencyFormat.format(getTotalBeforeDiscount()) + "   ";
        itemDetail += currencyFormat.format(discount) + "     ";
        itemDetail += currencyFormat.format(getTotalBeforeDiscount() - discount);

        return itemDetail;
    }


    private final Product getProduct() {
        return product;
    }
    
    public final double getTotalBeforeDiscount(){
        return quantity * product.getProductPrice();
    }
   
    public final double getDiscountedAmount(){
//        return this.getProduct().getSaleDiscount(this.getQuantity());
        return this.product.getSaleDiscount(this.getQuantity());
    }
   
    /**
     * @return the quantity
     */
    public final int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public final void setQuantity(int quantity) {
        //needs validation.
        this.quantity = quantity;
    }
}