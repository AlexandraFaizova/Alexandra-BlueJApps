import java.util.ArrayList;

/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * Alexandra Faizova
 * @version 0.2
 */
 

public class StockApp
    
{
        public static final String PRINT_ALL = "printeverything";
        public static final String RESTOCK = "restock";
        public static final String SHOW_STOCK_LOW = "show stock low";
        public static final String SEARCH = "search";
        public static final String QUIT = "quit";
        public static final String ADD = "add";
        public static final String SELL = "sell";
        public static final String DELIVER = "deliver";
        public static final String REMOVE = "remove";
        
        
        // In order to get user's input
    
    private StockManager manager = new StockManager();
    
    private StockDemo demo = new StockDemo(manager);
    
    private InputReader input = new InputReader();
    
    
    
/**
 * StockApp's Constructor
 */
public StockApp()
{
    printHeading();
}

/**
 * 
 */
       public void run()
      {
        boolean finished = false;
       
       while(!finished)
       {
           printMenuChoices();
           
           String choice = input.getString().toLowerCase();
           
           if(choice.equals(QUIT))
            finished = true;
           else
            executeMenuChoice(choice);
        }
    }
    
    /**
     * 
     */
    private void executeMenuChoice(String choice)
    {
        if(choice.equals(ADD))
        {
            addProduct();
        }
        else if (choice.equals(PRINT_ALL))
        {
             
             String value = input.getString();
        }
        else if (choice.equals(SELL))
        {
            sellProduct();
        }
        else if (choice.equals(SEARCH))
        {
            searchProduct();
        }
        else if (choice.equals(REMOVE))
        {
            removeProduct();
        }
        else if (choice.equals(DELIVER))
        {
            deliverProduct();
      
        }
        else if (choice.equals(SHOW_STOCK_LOW))
        {
            lowStockPrint();
        }
        else if (choice.equals(RESTOCK))
        {
            restock();
        }
    }
        
    /**
     * 
     */
       private void searchProduct()
       {
           System.out.println("Search Products\n");
           
           System.out.println("Enter the product's identification");
           String value = input.getString();
           int id = Integer.parseInt(value);
           
           Product product = manager.findProduct(id);
           if (product != null)
           {
               manager.findProduct(id);
               System.out.println("Product found: " + product.toString());
            }
            else
            System.out.println ("Product can't be found");
        }
        
    /**
     * 
     */
       private void deliverProduct()
        {
            System.out.println("Deliver product\n");
            
            System.out.println("Enter the product's identification");
            String value = input.getString();
            int id = Integer.parseInt(value);
            
            Product product = manager.findProduct(id);
            if (product != null)
            {
                System.out.println("Please enter amount delivered: ");
                String string = input.getString();
                int amount = Integer.parseInt(string);
                
                manager.delivery(id, amount);
            }
            else
            System.out.println ("Product can't be found");
        }
        
    /**
     * 
     */
        private void addProduct()
        {
            System.out.println("Adding new products\n");
            
            System.out.println("Enter the product's identification");
            String value = input.getString();
            int id = Integer.parseInt(value);
            
            while (manager.findProduct (id)!=null)
            {
                System.out.println
                ("Product ID already exists\n Enter another ID");
                value = input.getString();
                id = Integer.parseInt(value);
                
            }
            
            if (manager.findProduct (id) == null)
            {
                System.out.println("Enter the product's identification");
                String name = input.getString();
                while (name.length() == 0)
                
                {
                    System.out.println("Can't leave this blank");
                    name = input.getString();
                }
                Product product = new Product(id, name);
                manager.addProduct(product);
                
                System.out.println("\n you have now added an ID: " + product);
                System.out.println();
            }
        }
        
    /**
     * 
     */
        
       private void sellProduct()
        {
            System.out.println("Sell product\n");
            
            System.out.println("Enter the product's identification");
            String value = input.getString();
            int id = Integer.parseInt(value);
            
            Product product = manager.findProduct(id);
            if (product != null)
            {
                System.out.println("Enter the amount of products sold: ");
                String string = input.getString();
                int amount = Integer.parseInt(string);
                
                manager.sellMultiple(id, amount);
            }
            else
            System.out.println ("Product can't be found");
        }
        
    /**
     * 
     */
      private void removeProduct()
      {
         System.out.println("Removing current product\n");
               
         System.out.println("Enter the product's identification");
         String value = input.getString();
         int id = Integer.parseInt(value);
         
         
        
         Product product = manager.findProduct(id);
         if (product != null)
         
         
         {
          System.out.println("Product has been Removed: " 
          + product.toString()); 
         }
         else
          System.out.println ("Product can't be found");
       }
        
                
      
    /**
     * Print out a menu of operation choices
     */
    
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("\t\tMenu options");
        System.out.println("Quit:\t\tQuit program");
        System.out.println("PrintAll:\t\tPrint every product");
        System.out.println("Search:\t\tSearch for product");
        System.out.println("Show low stock:\t\tPrint low stock items");
        System.out.println("Restock:\t\tRestock Products below 3");
        
    }
    

    
    /**
     * 
     */
    private void restock()
    {
        System.out.println("Items are currently being restocked\n");
        
        
    }
    
    
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Alexandra Faizova");
        System.out.println("******************************");
    }

    /**
     * 
     */
    
    private void lowStockPrint()
    {
        System.out.println("The current items are running out of stock:\n");
        
    }
}
