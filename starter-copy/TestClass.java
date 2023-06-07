/**
 * TestClass for Tim Hortons Assignment.
 * @author Sam Scott, Zachary Sousa (JavaDoc)
 */
public class TestClass {
    /**
     * main
     * Starts the order process.
     */ 
    public static void main(String[] args) {
        TimsOrder t = TimsOrder.create();
        System.out.println(t);
        System.out.printf("Total Price: $%.2f\n", t.getAmountDue());
    }
}