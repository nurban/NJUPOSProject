
package posproject;

/**
 *
 * @author Neil Urban
 * Version: Beta (not fully functional yet)
 */
public class CashRegister {
    //create a new receipt object -- used to at call the method which outputs
    //completed receipt.
    private Receipt receipt;
    //create an array of products and pass values to variables in Product class
    private Product[] products = {
        new Product("A101", "Nintendo 3DS", 199.99, new ChristmasDiscountStrategy()),
        new Product("B205", "XL Abercrombie Hoodie", 35.50, new BackToSchoolDiscountStrategy()),
        new Product("C222", "Men's Underwear", 9.50, new NoDiscountStrategy())
    };
    //create an array of customers and pass values to variables in Customer class
    private Customer[] customers = {
        new Customer("A117", "Adam Smith", "1234 S Main Street, Waukesha, WI"),
        new Customer("F22J", "Jessica Rodriguez", "9753 Mapleton Drive, Watertown, WI"),
        new Customer("B379", "Joe Shmoe", "4631 W Java Drive, Madison, WI")  
    };
    
    public void addPurchasedProductToLine(String productID, int quantity) {
        Product product = null;
        for(Product p : products) {
            if(productID.equals(p.getProductID())) {
                product = p;
                break;
            }
        }
        
        if(product != null) {
            receipt.addNewLineItemToArray(product, quantity);
        }
        
    }
}
