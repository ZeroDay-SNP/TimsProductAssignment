import java.util.Scanner;

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
    //private TimsProduct[] items;
    
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
                System.out.print("\t\t(Item choices: Mug, Donut, MUffin, Kcups) : ");
                temp = in.nextLine();
                if(temp.equals("Mug") || temp.equals("Donut") || temp.equals("Muffin") || temp.equals("Kcups")) {
                    
                }
            }
        }
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
                tempSize = Integer.parseInt(in.nextLine() + 1);
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
        return 0;
    }
    
    /**
     * toString
     * @return  useful information about the TimsOrder
     */
    public String toString() {
        return "";
    }
    
    
    
}
