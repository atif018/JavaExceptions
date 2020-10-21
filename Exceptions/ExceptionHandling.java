
/** This program will show working knowledge of how to handle exceptions */

import java.util.Scanner;
import java.io.IOException;

public class ExceptionHandling
{
    
    public static void main(String[] args)
    {
        
        run();
        
    }
    
    public static void run () 
    {
        
        int userNumber = 0;
        
        Scanner input = new Scanner(System.in);
        
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("We have an array of length 5 named numbers and has 1, 2, 3, 4 and 5 stored in it respectively.");
        System.out.println("Please enter a position in the array that you would like to check.");
        userNumber = input.nextInt();
        
        try
        {
            
            System.out.println(numbers[userNumber]); // Tries printing the value stored at a specific place of the array as specified by user
            
        }
        catch (Exception e) // Exception caught if something went wrong in try part
        {
            
            System.out.println("No valid position in array!");
            
        }
        
        finally // Closes Scanner object
        {
            input.close();
        }
        
    }
    
}
