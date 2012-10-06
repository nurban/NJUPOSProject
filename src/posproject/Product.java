
package posproject;

/**
 *
 * @author Neil Urban
 * Version: Beta (not fully functional yet)
 */
public class Product {
    private String productID;
    private String productName;
    private double productPrice;
    //private IDiscountStrategy discount;
    
    public Product(String productID, String productName, double productPrice,
                   IDiscountStrategy discount) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    /**
     * @return the productID
     */
    public String getProductID() {
        return productID;
    }

    /**
     * @param productID the productID to set
     */
    public void setProductID(String productID) {
        //needs validation.
        this.productID = productID;
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
     * @return the productPrice
     */
    public double getProductPrice() {
        return productPrice;
    }

    /**
     * @param productPrice the productPrice to set
     */
    public void setProductPrice(double productPrice) {
        //needs validation.
        this.productPrice = productPrice;
    }
    
    public void calculateDiscount(int quantity) {
        
    }
}
