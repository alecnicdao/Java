/****************
Alastair Nicdao
Final Exam
4/24/18
****************/

import java.util.*;

public class Roulette
{
   public static double betOnce(Scanner reader, double num){
      Random rand = new Random(); 
      double result = 0.00;
      
      System.out.println("Enter a number 1 - 3");
      int numBet = reader.nextInt();
      
      int randomValue = rand.nextInt(36) + 1;
      if(numBet == 1){
         if (randomValue >= 1 && randomValue <= 18)
         {  
            System.out.println("Win");
            result = num * 2;
         }
         else {
            System.out.println("lose");
            return 0;
         }
      }
      else if(numBet == 2)
      {
         if (randomValue >= 19 && randomValue <= 36)
         {
            System.out.println("Win");
            result = num * 2;
         }
         else{
            System.out.println("Lose");
            return 0;
         }
      }
      else if(numBet == 3)
      {  
         System.out.println("Guess the random number: ");
         int guess = reader.nextInt();
         if (guess == randomValue)
         {
            System.out.println("Win");
            result = num * 2;
         }
         else{
            System.out.println("Lose");
            return 0;
         }
      }   
      return result;
   }
}
