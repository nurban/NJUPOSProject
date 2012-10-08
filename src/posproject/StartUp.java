
package posproject;

/**
 *
 * @author Neil Urban
 * Version: 1.0
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new object of type CashRegister
        CashRegister register = new CashRegister();
        
        //purchase the following products and add them to the item line.
        register.addPurchasedProductToLine("A101", 2);
        register.addPurchasedProductToLine("F198", 1);
        register.addPurchasedProductToLine("B205", 4);
        register.addPurchasedProductToLine("C222", 3);
        
        register.addCustomerToReceipt("A117");
        
        //print the receipt
        register.printCompleteReceipt();
    }
}
