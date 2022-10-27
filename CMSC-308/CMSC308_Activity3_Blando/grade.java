import java.util.Scanner;

public class Grade
{
    public static void main(String args[])
    {
              
        Scanner scan = new Scanner(System.in);
    System.out.print("Math     : ");
    double Math = scan.nextDouble();
    System.out.print("English  : " );
    double Eng = scan.nextDouble();
    System.out.print("Science  : ");
    double Sci = scan.nextDouble();
    System.out.print("MAPEH    : ");
    double MAPEH = scan.nextDouble();
    
    double total = Math + Eng + Sci + MAPEH;
           
       double avg = total / 4;
        if(avg>=100)
        {
            System.out.print("Invalid");
        }
        else if(avg>=98 && avg<99.99)
        {
           System.out.print("Average  : " + avg);
           System.out.print("\nWith Highest Honor");
        } 
        else if(avg>=95 && avg<97.99)
        {
            System.out.print("Average  : " + avg);
            System.out.print("\nWith High Honor");
        }
        else if(avg>=90 && avg<94.99)
        {
            System.out.print("Average  : " + avg);
            System.out.print("\nWith Honor");
        }
        else if(avg>=75 && avg<89.99)
        {
            System.out.print("Average  : " + avg);
            System.out.print("\nPassed");
        }
        else
        {
            System.out.print("Average  : " + avg);
            System.out.print("\nFailed");
        }
    }
}
