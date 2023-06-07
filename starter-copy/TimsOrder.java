import java.util.Scanner;
import java.lang.reflect.*;

/**
 * A TimsOrder stores every item that the user wishes to purchase.
 *
 * @author      Zachary Sousa
 * @version     1.00
 */
public class TimsOrder
{
    /*Order info*/
    private int size;
    private String name;
    private TimsProduct[] items;
    
    /**
     * TimsOrder constructor, called by the create() method.
     * @param name      the name of the customer
     * @param size      the amount of items to purchase
     */
    private TimsOrder(String name, int size) {
        this.name = name;
        this.size = size;
        items = new TimsProduct[size];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < size; i++) {
            while(true) {
                String temp;
                System.out.println("\tWhat can I get you?");
                System.out.print("\t\t(Item choices: Mug, Donut, Muffin, Kcups) : ");
                temp = in.nextLine();
                if(temp.equals("Mug") || temp.equals("Donut") || temp.equals("Muffin") || temp.equals("Kcups")) {
                    try {
                        Class<?> clazz = Class.forName(temp);               //get class with name
                        Method meth = clazz.getMethod("create", null);      //get the create method                            
                        items[i] = (TimsProduct)meth.invoke(null);          //set the latest item to the instantiated TimsProduct from the casted invocation of the create method
                        
                        break;
                    } catch(Exception e) {
                        //System.err.println(e);
                        System.out.println("An error occured when adding item: \"" + temp +"\"");
                    }
                } else {
                    System.out.println("\tNot an item.");
                }
            }
        }
        in.close();
    }
    
    /**
     * create prompts the user with questions about their order, then creates an instance of TimsOrder.
     * @return new TimsOrder
     */
    public static TimsOrder create() {
        Scanner in = new Scanner(System.in);
        
        String tempName;
        int tempSize;
        
        System.out.println("Welcome to Tim Horton's -- Order Placement --");
        System.out.print("Enter your name: ");
        tempName = in.nextLine();
        System.out.print("Enter order length: ");
        while(true) {
            try {
                tempSize = Integer.parseInt(in.nextLine());
                break;
            } catch(Exception e) {
                System.out.println("Answer must be numeric.");
                System.out.print("\nEnter order length: ");
            }
        }
        System.out.println("");
        in.close();
        return new TimsOrder(tempName, tempSize);
    }
    
    /**
     * getAmountDue
     * @return double       the price of the order
     */
    public double getAmountDue() {
        double price = 0;
        for(int i = 0; i < size; i ++) {
            price += items[i].getRetailPrice();
        }
        return Math.round(price * 100.0) / 100.0; 
    }
    
    /**
     * toString
     * @return  useful information about the TimsOrder
     */
    public String toString() {
        String out = "\n" + name + "'s order:   order size: " + size + "\n";
        for(int i = 0; i < size; i ++) {
            out = out + "\n\t" + items[i].toString();
        }
        out += "\n\n";
        return out;
    }
    
    
    
}
