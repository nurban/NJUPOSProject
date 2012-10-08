package posproject;

import java.text.NumberFormat;

/**
 *
 * @author Neil Urban
 * Version: 1.0
 */
public class Receipt {

    private double finalTotal;
    private double discountTotal;
    private double finalTotalWithDiscount;
    private double grandTotalOfPurchase = 0.0;
    //create a new customer object.
    Customer customer;

    public final void setCustomerInfo(Customer customer) {
        //validation is needed.
        this.customer = customer;
    }

    public final Customer getAllCustomerDetails() {
        return customer;
    }
    
    //create an array of line item objects with 0 current items.
    private LineItem[] lineItems = new LineItem[0];

    public final void addNewLineItem(Product product, int quantity) {
        LineItem item = new LineItem(product, quantity);
        addToArray(item);
    }

    private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }

    public final void printReceipt() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        //print customer information
        System.out.println(this.customer.getCustomerName());
        System.out.println(this.customer.getCustomerAddress());
        System.out.println("---------------------------------");
        System.out.println("ID    Description            Qty  Price       Total     Discount    Final $");
        System.out.println("~~    ~~~~~~~~~~~            ~~~  ~~~~~       ~~~~~     ~~~~~~~~    ~~~~~~~");

        //print product data from the line items
        for (LineItem items : lineItems) {
            System.out.println(items.getLineItemDetails());
            this.grandTotalOfPurchase += items.getTotalBeforeDiscount();
            this.discountTotal += items.getDiscountedAmount();
        }
        System.out.println("\nGrand Total of Purchase: " + currencyFormat.format(this.grandTotalOfPurchase));
        System.out.println("Total of Discount:         " + currencyFormat.format(this.discountTotal));
        System.out.println("Net Grand Total:         "
                + currencyFormat.format(this.grandTotalOfPurchase - this.discountTotal));
    }
}
