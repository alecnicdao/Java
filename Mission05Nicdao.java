/**************
Alastair Nicdao
Mission #5
01/10/2018
***************/

import java.util.Scanner;
import java.util.Random;

public class Mission05Nicdao
{

   public static void main (String[] args)
   {
   
      Scanner in = new Scanner (System.in);
      Random r = new Random ();
      
      int numRounds = 0; //Number of rounds the user wants to play
      String userPick = ""; // User picks Rock, Paper, or Scissors
      String cpuPick = ""; // Computers pick of Rock, Paper, or Scissors
      int cpuR = 0; //Temp variable
      int userWins = 0; //User's number of wins
      int cpuWins = 0; // Computer's number of wins
      int rounds = 0; // Number of rounds
      
      //Get the number of rounds that the user wants to play
      System.out.println("Welcome to Rock, Paper, Scissors!");
      System.out.println("Please enter the number of rounds you would like to play: ");
      numRounds = in.nextInt();
      
      //You have to enter an odd number to play the game
      while (numRounds % 2 == 0)
      {
      System.out.println("Sorry, you need to enter an odd number. Please try again:");
      numRounds = in.nextInt();
      }
     
      //Flush the buffer
      in.nextLine();
      
      //Play the game for the number of times the user specified
      for (int i = 1; i <= numRounds; i++) 
      {
      
         System.out.println("Rock, Paper, or Scissors?");
         userPick = in.nextLine();
         
         //Check if that input is valid
         while (!userPick.equalsIgnoreCase ("Rock") && !userPick.equalsIgnoreCase ("Paper") && !userPick.equalsIgnoreCase ("Scissors"))
         {
            System.out.println("Sorry, that is not a valid entry. Please try again.");
            userPick = in.nextLine();
         }
         
         //Check if that input is valid
         while (!userPick.equalsIgnoreCase ("Rock") && !userPick.equalsIgnoreCase ("Paper") && !userPick.equalsIgnoreCase ("Scissors"))
         {
            System.out.println("Sorry, that is not a valid entry. Please try again.");
            userPick = in.nextLine();
         }
         
         //Make a random choice for the computer
         cpuR = r.nextInt(3)+ 1;
         System.out.println("Computer chooses " + cpuPick + "."); 
         
         if (cpuR == 1)
         {
            cpuPick = "Rock";
         }
         
         if (cpuR == 2)
         {
            cpuPick = "Paper";
         }
         if (cpuR == 3)
         {
            cpuPick = "Scissors";
         }
         
         //Decide who wins the round
         if (userPick.equalsIgnoreCase ("Paper") && cpuPick.equalsIgnoreCase ("Rock"))
         {
            System.out.println("You win!");
            userWins++;
            rounds++;
         }
         if (userPick.equalsIgnoreCase ("Rock") && cpuPick.equalsIgnoreCase ("Scissors"))
         {
            System.out.println("You win!");
            userWins++;
            rounds++;
         }
         if (userPick.equalsIgnoreCase("Scissors") && cpuPick.equalsIgnoreCase ("Paper"))
         {
            System.out.println("You win!");
            userWins++;
            rounds++;
         }
         if (cpuPick.equalsIgnoreCase ("Paper") && userPick.equalsIgnoreCase ("Rock"))
         {
            System.out.println("CPU Wins!");
            cpuWins++;
            rounds++;
         }
         if (cpuPick.equalsIgnoreCase ("Rock") && userPick.equalsIgnoreCase ("Scissors"))
         {
            System.out.println("CPU Wins!");
            cpuWins++;
            rounds++;
         }
         if (cpuPick.equalsIgnoreCase ("Scissors") && userPick.equalsIgnoreCase ("Paper"))
         {
            System.out.println("CPU Wins!");
            cpuWins++;
            rounds++;
         }
         if (cpuPick.equalsIgnoreCase ("Rock") && userPick.equalsIgnoreCase ("Rock"))
         {
            System.out.println("It's a tie");
         }
         if (cpuPick.equalsIgnoreCase ("Paper") && userPick.equalsIgnoreCase ("Paper"))
         {
            System.out.println("It's a tie");
         }
         if (cpuPick.equalsIgnoreCase ("Scissors") && userPick.equalsIgnoreCase ("Scissors"))
         {
            System.out.println("It's a tie");
         }
         
      } //end for
      
      System.out.println();
      
      //Print results
      System.out.println("User wins: " + userWins);
      System.out.println("Computer wins: " + cpuWins);
      
      if (userWins > cpuWins)
      {
         System.out.println("User wins the game!");
      }
      if (userWins < cpuWins)
      {
         System.out.println("Computer wins the game!");
      }
      
   }
   
}