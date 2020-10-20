import java.util.Date;

/**
 * A ticket holding the information for the date, price and destination.
 * 
 *
 * @author Alexandra Faizova
 * @version 0.1)
 */
public class Ticket
{
    // Attributes
    
    private Date dateTime;
    
    private int price;
    
    private String destination;
   
   
    /**
     * Constructor for objects of class Ticket destination and price being 
     * set.
     */
    public Ticket(String destination, int price )
    {
       this.destination = destination;
       this.price = price;
       
       
       dateTime = new Date();
    }

   
    /**
     * The print system for the information on the ticket.
     */
    public void print ()
    {
         System.out.println("Ticket " + destination + "Price : " + price + 
           " Recieved " + dateTime);
    }
}
