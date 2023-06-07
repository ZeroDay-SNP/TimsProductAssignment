
/**
 * An interface for the TimsProduct to use for eating.
 *
 * @author      Zachary Sousa
 * @version     1.00
 */
public interface Consumable
{
    /**
     * getCalorieCount
     * @return int      the calorie count
     */
    public int getCalorieCount();
    
    /**
     * getConsumptionMethod
     * @return String       the cost to purchase the product
     */
    public String getConsumptionMethod();
}
