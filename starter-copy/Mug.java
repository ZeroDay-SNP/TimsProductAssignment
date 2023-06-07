import javafx.scene.paint.Color;
import java.util.Scanner;

/**
 * Tim Hortons mug. You can buy it.
 *
 * @author      Zachary Sousa
 * @version     1.00
 */
public class Mug extends TimsProduct
{
    private Color color;
    
    /**
     * Constructor for the Mug
     * @param name      the name of the product
     * @param cost      the cost to make the product
     * @param price     the price to buy the product
     * @param color     the color of the mug
     */
    private Mug(String name, double cost, double price, Color color) {
        super(name, cost, price);
        this.color = color;
    }
    
    /**
     * create
     * @return new Mug
     */
    public static Mug create() {
        Scanner in = new Scanner(System.in);
        Color tempCol;
        System.out.print("\t\tEnter color for the mug (hex code value supported, ex. #0000FF) : ");
        while(true) {
            String temp = in.nextLine();
            try {
                tempCol = Color.web(temp);
                break;
            } catch(Exception e) {
                System.out.print("\t\tAn error occured. Make sure you've entered a valid hex code. ");
            }
        }
        in.close();
        return new Mug("Mug", 3.65, 9.99, tempCol);
    }
    
    /**
     * getColor
     * @return color
     */
    public Color getColor() {
        return color;
    }
    
    /**
     * toString
     * @return      useful info about the Mug
     */
    public String toString() {
        return super.toString() + " COLOR: " + color;
    }
}
