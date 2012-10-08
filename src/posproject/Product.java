
package posproject;

import java.text.NumberFormat;
    
  

// Retrieves the amount of the Discount to a LineItem call
/**
 *
 * @author Neil Urban
 * Version: Beta (not fully functional yet)
 */
public class Product {
    private String productName;
    private String productDescription;
    private double productPrice;
    
    //create a new object Discount Strategy object. 
    private IDiscountStrategy discount;
        
    public Product(String productName, String productDescription, double productPrice,
                   IDiscountStrategy discount) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.discount = discount;
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
    public final void setProductName(String productName) {
        //validation is needed.
        this.productName = productName;
    }

    /**
     * @return the productDescription
     */
    public final String getProductDescription() {
        return productDescription;
    }

    /**
     * @param productDescription the productDescription to set
     */
    public final void  setProductDescription(String productDescription) {
        //validation is needed.
        this.productDescription = productDescription;
    }

    /**
     * @return the productPrice
     */
    public final double getProductPrice() {
        return productPrice;
    }

    /**
     * @param productPrice the productPrice to set
     */
    public final void setProductPrice(double productPrice) {
        //validation is needed.
        this.productPrice = productPrice;
    }
    
    /**
     * @return the discount
     */
    public final IDiscountStrategy getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public final void setDiscount(IDiscountStrategy discount) {
        //validation is needed.
        this.discount = discount;
    }
         
    public final double getSaleDiscount(int quantity){
        //validation is needed.
        return this.discount.getDiscount(productPrice, quantity);
    }
    
    public final IDiscountStrategy getIDiscountStrategy() {
        return discount;
    }

    public final void setIDiscountStrategy(IDiscountStrategy discount) {
        //validation is needed.
        this.discount = discount;
    }
}