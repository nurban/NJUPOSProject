/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posproject;

/**
 *
 * @author nurban
 */
public class QuarterOffDiscountStrategy implements IDiscountStrategy {
    //final variable which sets this discount rate to 25%
    private final double DISCOUNT_RATE = .25;
    
    public double getDiscount(double price, int quantity) {
        return price * quantity * DISCOUNT_RATE;
    }
}
