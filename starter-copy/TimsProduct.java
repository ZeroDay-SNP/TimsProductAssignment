
/**
 * Ancestor class for each item on the menu.
 *
 * @author      Zachary Sousa
 * @version     1.00
 */
public abstract class TimsProduct implements Commodity
{
    private String name;
    private double cost;
    private double price;
    
    /**
     * Constructor for the TimsProduct
     * @param name      the name of the product
     * @param cost      the cost to make the product
     * @param price     the price to buy the product
     */
    public TimsProduct(String name, double cost, double price) {
        this.name = name;
        this.cost = cost;
        this.price = price;
    }
    
    /**
     * getName
     * @return name
     */
    public String getName() {
        return name;
    }
    
    /**
     * getProductionCost
     * @return cost
     */
    public double getProductionCost() {
        return cost;
    }
    
    /**
     * getRetailPrice
     * @return price
     */
    public double getRetailPrice() {
        return price;
    }
    
    /**
     * toString
     * @return      useful info about the TimsProduct
     */
    public String toString() {
        return name + " COST: $" + cost + " PRICE: $" + price;
    }
}
