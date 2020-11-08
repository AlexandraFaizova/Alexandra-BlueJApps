import java.util.Random;

/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * Modified by Alexandra Faizova
 * Version 0.1
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;
    private Random generator;  
    

    /**
     * Stock manager with all available sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        manager = new StockManager();
        manager.addProduct(new Product(40, "Apple"));
        manager.addProduct(new Product(41,  "Pear"));
        manager.addProduct(new Product(42,  "Strawberry"));
        manager.addProduct(new Product(43,  "Pineapple"));
        manager.addProduct(new Product(44,  "Cherry"));
        manager.addProduct(new Product(45,  "Grapes"));
        manager.addProduct(new Product(46,  "Melon"));
        manager.addProduct(new Product(47,  "Orange"));
        manager.addProduct(new Product(48,  "Mango"));
        manager.addProduct(new Product(49,  "Lemon"));
        manager.addProduct(new Product(50,  "Bannana"));
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void runDemo()
    {
        System.out.println ("The stock of Alex's shop");
        System.out.println ();
        manager.printProductDetails();
        print("Delivery");
        deliverProducts();
        print ("Sell");
        sellProducts();
    }
    
    
    private void print(String spacer)
    {
        System.out.println();
        System.out.println("Demonstrating: " + spacer);
        System.out.println ();
    }
    
    private void sellProducts()
    {
       int amount = 0;
       
       for (int id = 100; id <= 109; id++)
       {
           amount = generator.nextInt(20) + 5;
           manager.delivery(id,amount);
        }
}
    
    private void deliverProducts()
    {
        int amount = 0;
        
        for (int id = 100; id <= 109; id++)
        {
            amount = generator.nextInt(10) + 5;
            manager.delivery(id,amount);
    }
}
        
}
