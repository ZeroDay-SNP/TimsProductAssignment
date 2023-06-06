
/**
 * An interface for the TimsProduct to use for pricing.
 *
 * @author      Zachary Sousa
 * @version     1.00
 */
public interface Commodity
{
    /**
     * getProductionCost
     * @return double       the cost to make the product
     */
    public double getProductionCost();
    
    /**
     * getRetailPrice
     * @return double       the cost to purchase the product
     */
    public double getRetailPrice();
}
