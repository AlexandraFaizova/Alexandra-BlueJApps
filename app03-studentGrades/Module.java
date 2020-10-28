
/**
 * All the information stored in Class Module, module code and percentage mark.
 *
 * @author Alexandra Faizova
 * @version 0.1
 */
public class Module
{
    // instance variables - replace the example below with your own
    private String title;
    
    private String codeNo; 
    
    private int mark;
    
    private int credit;
    
    private boolean passed;
    
    /**
     * Construtor for objects of the Class Module
     */
    public Module(String title, String codeNo)
    
    {
        mark = -1;
        this.title = title;
        this.codeNo = codeNo;
        credit = 20;
        passed = false;
    }
    
    public void awardMark(int mark)
    {
        if ((mark >= 0) && (mark <= 100))
        {
            this.mark = mark;
        }
        else
        {
            System.out.print("Invalid mark!");
            
        }
        
    }
    
    public void print ()
    {
        System.out.println("Module: " + codeNo + " " + title + ", Mark = " + 
        mark); 
        
    }
    
    public int getMark()
    
    {
        return mark;
    }
    
    public String getCodeNo()
    
    {
        return codeNo;
    }
    
    public boolean ispassed()
    
   {
       return mark >=0;
    }
    
}
