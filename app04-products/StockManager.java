import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Alexandra Faizova 
 * @version 0.1
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;
    private boolean validate;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        Product product = findProduct(id);
        if (product != null)
        {
            product.increaseQuantity(amount);
            System.out.println("Product Delivered : "
            + product); 
        }
         else
         System.out.println("Product ID" + id + 
         " unable to be found");
    }    
    
     private void validate()
    {
        if (validate != true)
        {
            System.out.println("Product unable to be found");
        }
    }
    
    public void search(String name)
    {
        validate = false;
        for(Product product : stock)
        {
            if(product.getName().equals(name))
            {
                System.out.println(product);
                validate = true;
                
            }
            
        }
        validate();
    }
    
   
    public Product findProduct(int id)
    {
        for(Product product : stock)
        {
            if(product.getID() == id)
            {
                return product;
        
    }
}

return null;
}

public void checkLowStock()
{
    int low = 2;
    for (Product product : stock)
    {
        if (product.getQuantity() <= low)
        {
            System.out.println(product.toString());
        }
    }
}

public void renameProduct(int id, String newName)
{
    Product product = findProduct(id);
    if (product != null)
    {
        System.out.println("Product: " + product.getName());
        product.renameProduct(newName);
        System.out.println("Product Renamed to : " + product.getName());
       
     }
}

public void sellMultiple(int id, int amount)
{
    Product product = findProduct(id);
    if (product != null)
    {
        product.sell(amount);
        System.out.println("Product Sold : " + product.getName() + "Amount sold : " + amount);
    }
}

public void removeProduct(int id)
{
    Product product = findProduct(id);
    if (product != null)
    {
        System.out.println("Product Removed: " + product.toString());
        stock.remove(product);
    }
    else
    System.out.println ("Product unable to be found!");
}
 
/**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        return 0;
    }

    /**
     * Print details of all the products.
     */
    public void printProductDetails()
    {
       for (Product product : stock)
       {
           System.out.println(product.toString());
    }
}

public void printAllProducts()
{
    printHeading();
    
    for(Product product : stock)
    {
        System.out.println(product);
    }
    
    System.out.println();
}

public void printHeading()
{
    System.out.println();
    System.out.println("Alex's Stock List");
    System.out.println("=================");
    System.out.println();
}
}

