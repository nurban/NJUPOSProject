/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posproject;

/**
 *
 * @author nurban
 */
public class BlackFridayDiscountStrategy implements IDiscountStrategy {
    //final variable which sets this discount rate to 85%
    private final double DISCOUNT_RATE = .85;
    @Override
    public double getDiscount(double price, int quantity) {
        return price * quantity * DISCOUNT_RATE;
    }
    
}
