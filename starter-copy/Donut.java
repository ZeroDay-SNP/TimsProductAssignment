import javafx.scene.paint.Color;
import java.util.Scanner;

/**
 * Tim Hortons Donut. You can buy it.
 *
 * @author      Zachary Sousa
 * @version     1.00
 */
public class Donut extends TimsProduct implements Consumable
{
    private String description;
    private int calories;
    
    /**
     * Constructor for the Donut
     * @param name          the name of the product
     * @param cost          the cost to make the product
     * @param price         the price to buy the product
     * @param calories      the calories of the Donut
     * @param description   the description of the Donut
     */
    private Donut(String name, double cost, double price, int calories, String description) {
        super(name, cost, price);
        this.calories = calories;
        this.description = description;
    }
    
    /**
     * create
     * @return new Donut
     */
    public static Donut create() {
        return new Donut("Donut", 1.50, 4.50, 220, "Chocolate Dip Donut");
    }
    
    /**
     * getDescription
     * @return description
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * getCalorieCount
     * @return calories
     */
    public int getCalorieCount() {
        return calories;
    }
    
    /**
     * getConsumptionMethod
     * @return consumption method
     */
    public String getConsumptionMethod() {
        return "Eat";
    }
    
    /**
     * toString
     * @return      useful info about the Donut
     */
    public String toString() {
        return super.toString() + " DESCRIPTION: " + description + " CALORIES: " + calories;
    }
}
