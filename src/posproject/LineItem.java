
package posproject;

/**
 *
 * @author Neil Urban
 * Version: Beta (not fully functional yet)
 */
public class LineItem {
    private String productName;
    private int quantity;
    private double discountAmnt;
    private double netAmnt;
    
    public LineItem(Product product, int quantity) {
        //this.productName = productName;
        this.quantity = quantity;
        //this.discountAmnt = discountAmnt;
        //this.netAmnt = netAmnt;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        //needs validation.
        this.productName = productName;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        //needs validation.
        this.quantity = quantity;
    }

    /**
     * @return the discountAmnt
     */
    public double getDiscountAmnt() {
        return discountAmnt;
    }

    /**
     * @param discountAmnt the discountAmnt to set
     */
    public void setDiscountAmnt(double discountAmnt) {
        //needs validation.
        this.discountAmnt = discountAmnt;
    }

    /**
     * @return the netAmnt
     */
    public double getNetAmnt() {
        return netAmnt;
    }

    /**
     * @param netAmnt the netAmnt to set
     */
    public void setNetAmnt(double netAmnt) {
        //needs validation.
        this.netAmnt = netAmnt;
    }
    
    public void retreiveDiscount(Product product, int quantity) {
        product.calculateDiscount(quantity);
    }
    
    
}
