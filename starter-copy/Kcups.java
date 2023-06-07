import javafx.scene.paint.Color;
import java.util.Scanner;

/**
 * Tim Hortons Kcups. You can buy it.
 *
 * @author      Zachary Sousa
 * @version     1.00
 */
public class Kcups extends TimsProduct
{
    private String flavor;
    
    /**
     * Constructor for the Kcups
     * @param name      the name of the product
     * @param cost      the cost to make the product
     * @param price     the price to buy the product
     * @param flavor    the flavor of the Kcups
     */
    private Kcups(String name, double cost, double price, String flavor) {
        super(name, cost, price);
        this.flavor = flavor;
    }
    
    /**
     * create
     * @return new Kcups
     */
    public static Kcups create() {
        Scanner in = new Scanner(System.in);
        String temp;
        String flav;
        while(true) {
            System.out.print("\tEnter 1 for Original Blend, 2 for Double Double : ");
            temp = in.nextLine();
            if(Integer.parseInt(temp) == 1) {
                in.close();
                flav = "Original Blend";
                break;
            } else if(Integer.parseInt(temp) == 2) {
                in.close();
                flav = "Double Double";
                break;
            } else {
                System.out.println("Not an option.");
            }
        }
        in.close();
        return new Kcups("K-Cups", 15.50, 28.99, flav);
    }
    
    /**
     * getFlavor
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }
    
    /**
     * toString
     * @return      useful info about the Kcups
     */
    public String toString() {
        return super.toString() + " FLAVOR: " + flavor;
    }
}
