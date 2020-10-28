
/**
 * Class of Course that students will enrol in.
 *
 * @author Alexandra Faizova
 * @version Version 0.1
 */
public class Course
{
    // instance variables - String and CourseCode
    public String codeNo;
    
    public String title;
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNo,String title)
    {
        this.codeNo = codeNo;
        this.title = title; 
        this.finalGrade = null;
        this.finalMark = 0;
    }
    
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    private int finalMark;
    
    private Grades finalGrade;
    
    public boolean coursePassed;
    
    /**
     * Modules with preconcieved data and information.
     */
    public void createModule()
    {
        module1 = new Module ("Psychology", "CL394");
        module2 = new Module ("English Literature", "CL432");
        module3 = new Module ("Sociology", "CL999");
        module4 = new Module ("Paleontology", "CL4434");
        
    }


    /**
     * Prints details of the course
     */
    public void print ()
    {
        System.out.println("Course " + codeNo + " - " + title);
        System.out.println( "Final Mark = " + finalMark);
       
    }
    
    /**
     * Marks awarded for the module.
     */
    public void addMark(int mark, int moduleNo) 
    {
        if(moduleNo == 1)
        {
            module1.awardMark(mark);
        }
        else if (moduleNo ==2)
        {
            module2.awardMark(mark);
        }
        else if (moduleNo ==3)
        {
            module3.awardMark(mark);
        }
        else if (moduleNo ==4)
        {
            module4.awardMark(mark);
        }
        else
        {
            System.out.println ("The module isn't assigned to the course");
        }
    }
    
    /**
     * Turns marks into a letter for a grade.
     */
    private Grades convertToGrade(int mark)
    {
        if((mark >= 0) && (mark < 40))
        {
            return Grades.F;
        }
        else if ((mark >=40) && (mark <50))
        {
            return Grades.D;
        }
        else if ((mark >=50) && (mark <60))
        {
            return Grades.C;
        }
        else if ((mark >=60) && (mark <70))
        {
            return Grades.B;
        }
        else if ((mark >=70) && (mark <=100))
        {
            return Grades.A;
        }
        else
        {
            return Grades.X;
        }
        
    }
    
    /**
     * 
     */
    public void calculateFinalMark()
    {
        if(coursePassed()==true)
        {
            int totalMark = module1.getMark() + module2.getMark() + 
            module3.getMark() + module4.getMark();
            
            finalMark = totalMark / 4;
            System.out.println("Final Grade: " + convertToGrade(finalMark));
        }
        else
        {
            System.out.println ("Can't calculate final grade");
        }
    }
    
    /**
     * Checking to see whether modules have passed or failed.
     */
    public boolean coursePassed()
    {
        if((((module1.ispassed()) && module2.ispassed())
        && module3.ispassed()) && module4.ispassed())
        {
            return true;
        }
        else return false;
        }
        
    }
