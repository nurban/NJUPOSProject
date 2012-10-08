
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
    
    //Instantiate Discount Strategy objects for each sub-type of discount.
    IDiscountStrategy xmasDiscount = new ChristmasDiscountStrategy();
    IDiscountStrategy halfDiscount = new HalfOffDiscountStrategy();
    IDiscountStrategy noDiscount = new NoDiscountStrategy();
    IDiscountStrategy schoolDiscount = new BackToSchoolDiscountStrategy();
    IDiscountStrategy quarterDiscount = new QuarterOffDiscountStrategy();
    IDiscountStrategy blackFridayDiscount = new BlackFridayDiscountStrategy();
    
    //create an array of products and pass the values over to Product class.
    //objects of the varying discount strategy types are used to pass discounts.
    private Product[] products = {
        new Product("A101", "Nintendo 3DS", 199.99, xmasDiscount),
        new Product("B205", "XL Abercrombie Hoodie", 35.50, halfDiscount),
        new Product("C222", "Men's Underwear", 9.50, noDiscount),
        new Product("L135", "Backpack", 17.95, schoolDiscount),
        new Product("F198", "MacBook Pro", 1499.99, quarterDiscount),
        new Product("H123", "Hoover Vacuum", 249.99, blackFridayDiscount)   
    };
    
    //method which adds each product to the item line.
    public final void addPurchasedProductToLine(String productID, int quantity) {
        Product product = null;
        for(Product p : products) {
            if(productID.equals(p.getProductName())) {
                product = p;
                break;
            }
        }
        if(product != null) {
            receipt.addNewLineItem(product, quantity);
        }
    }
    
    //create an array of customers and pass the values over to Customer class.
    private Customer[] customers = {
        new Customer("A117", "Adam Smith", "1234 S Main Street, Waukesha, WI"),
        new Customer("F22J", "Jessica Rodriguez", "9753 Mapleton Drive, Watertown, WI"),
        new Customer("B379", "Joe Shmoe", "4631 W Java Drive, Madison, WI")  
    };
    
    //method which adds each customer to the item line.
    public final void addCustomerToReceipt(String customerID) {
        Customer customer = null;
        //check to see if a 
        for(Customer c : customers) {
            if(customerID.equals(c.getCustomerID())) {
            customer = c;
            break;
        }
            //add the customer to the receipt, if one is found.
            if (customer != null) {
            receipt.setCustomerInfo(customer);
            }
        }
    } 
   
    //calls the method in Receipt, to print the complete receipt.
    public final void printCompleteReceipt() {
        receipt.printReceipt();
    }
}
