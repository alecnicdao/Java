/******************
Alastair Nicdao
Mission #10
3/27/18
******************/

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors
{
   public String getUserChoice ()
   {
      Scanner scanner = new Scanner(System.in);
      
      String userChoice;
      
      System.out.println("Please choose between Rock, Paper, or Scissors");
            
      userChoice = scanner.next().toLowerCase();
      
      if (!userChoice.equals("rock") && 
          !userChoice.equals("paper") && 
          !userChoice.equals("scissors"))
      {
         System.out.println("Sorry, \"" + userChoice + "\" is not a valid entry.");
         return getUserChoice();
      }
      
      return userChoice;
   }
   
   public String getCPUChoice ()
   {
   
      Random rand = new Random();
      int getCPUR = rand.nextInt((2) + 1);
      String choices[] = { "rock", "paper", "scissors" };
      
      return choices[getCPUR];
   }
  
   public String pickWinner(String userChoice, String CpuChoice) 
   {
   
      if (userChoice.equals(CpuChoice))
         return "Tie";
      
   
      if (userChoice.equals("rock") && CpuChoice.equals("paper"))
         return "Computer";
      if (userChoice.equals("paper") && CpuChoice.equals("scissors"))
         return "Computer";
      if (userChoice.equals("scissors") && CpuChoice.equals("rock"))
         return "Computer";
      
      return "User";
   }
   
}