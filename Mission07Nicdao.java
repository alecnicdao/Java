/***************
Alastair Nicdao
Mission #7
02/20/2018
***************/

import java.util.Scanner;
import java.util.Random;

public class Mission07Nicdao
{

   public static void main (String[] args)
   {
      Scanner in = new Scanner (System.in);
      Random r = new Random();
   
      int[] tally = new int[13];
      
      tally [2] = 0;
      tally [3] = 0;
      tally [4] = 0;
      tally [5] = 0;
      tally [6] = 0;
      tally [7] = 0;
      tally [8] = 0;
      tally [9] = 0;
      tally [10] = 0;
      tally [11] = 0;
      tally [12] = 0;
      
      int userPick = 0;
      int numberRolls = 0;
      int total = 0;
      int numberAsterisks = 0;
      
      //Get user to play the dice rolling game
      System.out.println("Welcome to the dice throwing simulator!");
      System.out.println();
      System.out.println("How many dice rolls would you like to simulate?");
      System.out.println();
      userPick = in.nextInt();
      
      //Simulate the roll of the die for the amount of times
      for (int i = 0; i <= userPick; i++)
      {
         //"Roll" the dice
         total = (r.nextInt(6) + 1) + (r.nextInt(6) + 1);
         tally[total]++;
      }  
      
      System.out.println("DICE ROLLING SIMULATION RESULTS");
      System.out.println("Each \"*\" represents 1% of the total number of rolls. ");
      System.out.println("Total number of rolls = " + userPick);
      System.out.println();
      
      //Print results/Calculate the number of asterisks
      for (int i = 2; i < tally.length; i++)
      {
         numberAsterisks = (int) ((100 * tally[i] / userPick));
         System.out.print(i + ": ");
         
         for (int j = 0; j < numberAsterisks; j++)
         {
            System.out.print("*");
         }
         
         System.out.println();
      }
      
         System.out.println();
         System.out.println("Thank you for using the dice throwing simulator. Goodbye!");
   }

}