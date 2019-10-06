/******************
Alastair Nicdao
Mission #2
01/13/2018
******************/

import java.util.Scanner;

public class Mission02Nicdao
{

   public static void main (String[] args)
   {
   
      Scanner in = new Scanner (System.in);
      
      String name = "";
      double limit = 0.0;
      double milesTo = 0.0;
      int mphOver = 0;
      double finalTime = 0.0;
      double finalTimeSpeed = 0.0;
      double minutesSaved = 0.0; 
      
      //Name of the destination
      System.out.println("Please enter your destination:");
      name = in.nextLine();
      
      //Number of miles to the destination 
      System.out.println("How many miles is it to " + name + "?");
      milesTo = in.nextDouble();
      
      //Speed limit
      System.out.println("What is the speed limit?");
      limit = in.nextDouble();
      
      //How many mph over the speed limit you wish to drive (in mph)? 
      System.out.println("How fast do you plan on driving over the speed limit (in mph)?");
      mphOver = in.nextInt();
      
      //The time arriving to destination
      finalTime = milesTo / limit * 60; 
      finalTimeSpeed = milesTo / limit + mphOver * 60;
      minutesSaved = finalTime - finalTimeSpeed;
      
      //Print results 
      System.out.println ("You will arrive in " + name + " " + minutesSaved + " minutes faster by driving " + mphOver + " over the speed limit. "); 
      
   }
   
}