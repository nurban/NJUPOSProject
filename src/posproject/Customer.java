
package posproject;

/**
 *
 * @author Neil Urban
 * Version: Beta (not fully functional yet)
 */
public class Customer {
    private String customerID;
    private String customerName;
    private String customerAddress;
    
    public Customer(String customerID, String customerName,
                    String customerAddress) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }

    /**
     * @return the customerID
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(String customerID) {
        //needs validation.
        this.customerID = customerID;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        //needs validation.
        this.customerName = customerName;
    }

    /**
     * @return the customerAddress
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * @param customerAddress the customerAddress to set
     */
    public void setCustomerAddress(String customerAddress) {
        //needs validation.
        this.customerAddress = customerAddress;
    }
    
    
}
