import javafx.scene.paint.Color;
import java.util.Scanner;

/**
 * Tim Hortons Muffin. You can buy it.
 *
 * @author      Zachary Sousa
 * @version     1.00
 */
public class Muffin extends TimsProduct implements Consumable
{
    private String description;
    private int calories;
    
    /**
     * Constructor for the Muffin
     * @param name          the name of the product
     * @param cost          the cost to make the product
     * @param price         the price to buy the product
     * @param calories      the calories of the Muffin
     * @param description   the description of the Muffin
     */
    private Muffin(String name, double cost, double price, int calories, String description) {
        super(name, cost, price);
        this.calories = calories;
        this.description = description;
    }
    
    /**
     * create
     * @return new Muffin
     */
    public static Muffin create() {
        return new Muffin("Muffin", 1.00, 3.00, 380, "Chocolate Chip Muffin");
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
     * @return      useful info about the Muffin
     */
    public String toString() {
        return super.toString() + " DESCRIPTION: " + description + " CALORIES: " + calories;
    }
}
