/*******************
Alastair Nicdao
Mission #4
1/30/18
*******************/

import java.util.Scanner;

public class Mission04Nicdao
{

   public static void main (String[] args)
   {
   
      Scanner in = new Scanner (System.in);
      
      //This is the users word input
      String userWord = "";
      //This is the pig latin word
      String latinWord = "";
      
      //This is a temp character holder
      char ch = ' '; 
      
      //Get Pig Latin word from the user
      System.out.println("Welcome to the Pig Latin Translator!"); 
      System.out.println();
      System.out.println("Please enter a word:");
      userWord = in.nextLine();
      
      //Check word, correct word, and make it into the pig latin word
      do
      {
         //Get the characters to be Pig latin
         ch = userWord.charAt(0);
         ch = Character.toLowerCase(ch);
         
         //If the word is a vowel
         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
         {
            System.out.println("The translation word is: " + userWord + "way");
         }
         
         //If the word is a consonant
         else 
         {
         
            for (int i = 1; i < userWord.length(); i++)
            {
            
               ch = userWord.charAt(i);
               ch = Character.toLowerCase(ch);
               
               if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
               {
                  System.out.println("The translation word is: " + userWord.substring(i) + userWord.substring(0,i) + "ay");
                  break;
               }
               
            }
                     
         } 
      
         //Allow user to quit or enter another word to be corrected
         System.out.println("Enter another word to be translated (or press Q to quit):");
         userWord = in.nextLine();
      
      } while (!userWord.equalsIgnoreCase("Q"));
  
   }
   
}

