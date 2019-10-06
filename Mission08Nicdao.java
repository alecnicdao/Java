/*****************
Alastair Nicdao
Mission #8
3/7/18
*****************/

import java.util.*;

public class Mission08Nicdao
{

   public static void main (String[] args)
   {
      
      Scanner in = new Scanner (System.in);
      
      double numHeight = 0;
      boolean hasErrorHeight = false;
      
      double numWeight = 0;
      boolean hasErrorWeight = false;
      
      double total = 0;

      //Get height in inches
      System.out.println("Enter height in inches:");
      do 
      {
         //My first try 
         try 
         {
            hasErrorHeight = false;
            
            numHeight = in.nextDouble();
            
           while (numHeight <= 0)
           {
               System.out.println("Invalid inches value. Must be positive.");
               System.out.println("Re-enter height in inches:"); 
               numHeight = in.nextDouble();
           }
           
         }
         
         //My first catch
         catch (InputMismatchException e)
         {
            //Flush the buffer
            in.nextLine();
            
            System.out.println("Invalid inches value. Must be a decimal number.");
            System.out.println("Re-enter height in inches:");
            
            hasErrorHeight = true;
         }
      } while (hasErrorHeight);
      
      //Get weight in pounds
      System.out.println("Enter weight in pounds");
      do
      {
         //My second try
         try
         {
            hasErrorWeight = false;
            
            numWeight = in.nextDouble();
            
           while (numWeight <= 0)
           {
               System.out.println("Invalid pounds value. Must be positive.");
               System.out.println("Re-enter weight in pounds:");
               numWeight = in.nextDouble();
           }
         }
         
         //My second catch
         catch (InputMismatchException error)
         {
            //Flush the buffer
            in.nextLine();
            
            System.out.println("Invalid pounds value. Must be a decimal number.");
            System.out.println("Re-enter weight in pounds:");
            
            hasErrorWeight = true;
         }
      } while (hasErrorWeight);
      
      //Get the total height and weight to figure out the bmi
      System.out.println("Height = " + numHeight + "\"");
      System.out.println("Weight = " + numWeight + " pounds");
      total = (704 * numWeight) / (numHeight * numHeight);
      System.out.printf("Body mass index = %.1f" , total);
           
   }

}