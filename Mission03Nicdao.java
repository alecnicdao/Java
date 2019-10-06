/****************
Alastair Nicdao
Mission #3
1/23/18
****************/

import java.util.Scanner;
import java.util.Random;

public class Mission03Nicdao
{

   public static void main (String[] args)
   {  
      Scanner in = new Scanner (System.in);
      Random r = new Random ();
      
      int userPick = 0; // A number between 1-100
      int guessResult = r.nextInt(100)+ 1; // A number between 1-100
      int numberOfTries = 0;
      int numberOfWins = 0;
      
      //Play the game while the user decides to continue to say Yes
       
         //Get user selection
         System.out.println("Try and enter a number between 1 and 100.");
       
        do
        
      {  
         userPick = in.nextInt();
         //Check if the input is valid
         while (userPick < 0 || userPick > 100)
         {
            System.out.println("Invalid input. Please try again");
            System.out.println("Try and enter a number between 1 and 100.");
            userPick = in.nextInt();  
         }
         
         //Simulate number guess and increase the count of games/tries
         
         numberOfTries++;
         
         //Check and print the results
         if (userPick > guessResult)
         {
            System.out.println("The number is lower. Try again.");
         }  
         if (userPick < guessResult)
         {
            System.out.println("The number is higher. Try again.");
         }
         if (userPick == guessResult)
         {
            System.out.println("That's correct. Good job! The number was " + guessResult + "." + " It only took you " + numberOfTries + " tries. " );
         }
        
      } while (userPick != guessResult);
                   
   }

}