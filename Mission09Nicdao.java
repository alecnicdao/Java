/*****************
Alastair Nicdao
Mission #9
3/13/18
*****************/

import java.io.*;
import java.util.*;

public class Mission09Nicdao
{

   public static void main (String[] args)
   {
   
      Scanner in = new Scanner (System.in);
      File myFavoriteFile;
      PrintWriter fileOutput; 
      Scanner fileInput;
      
      String userPick = "";
      String userIn = "";
      String holder = "";
      char ch = ' ';
       
      //Get the name of the file to encrypt
      try
      {
         System.out.println("Please enter the name of the file:");
         userIn = in.nextLine();
         
         myFavoriteFile = new File (userIn);
         fileInput = new Scanner (myFavoriteFile);
         
         //Encrypt the file
         System.out.println("Would you like to encrypt or decrypt?:");
         userPick = in.nextLine();
         
         fileOutput = new PrintWriter (userPick + "ed.txt");
         
         if (userPick.equalsIgnoreCase("encrypt"))
         {
            
            while (fileInput.hasNextLine())
            {
               holder = fileInput.nextLine();
               
               for (int i = 0; i < holder.length(); i++)
               {
                  ch = holder.charAt(i);
                  if((ch >= 'a' && ch <= 'z') || (ch >= 'A' & ch <= 'z'))
                  {
                     ch++;
                  }
                  
                  fileOutput.print(ch);
                  
               }
               
               fileOutput.println();
               
            }
            
            //Get file to the encrypted.txt
            fileOutput.close();
            System.out.println("File has been encrypted to Encrypted.txt");
         
         }
      
         //Get the name of the file to decrypt
         if (userPick.equalsIgnoreCase ("decrypt"))
         {
            while (fileInput.hasNextLine())
            {
               holder = fileInput.nextLine();
               
               for(int i = 0; i < holder.length(); i++)
               {
                  ch = holder.charAt(i);
                  if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'z'))
                  {
                     ch--;
                  }
                  
                  fileOutput.print(ch);
               }
               
               fileOutput.println();
            }
            
            //Get file to the decrypted.txt
            fileOutput.close();
            System.out.println("File has been decrypted to Decrypted.txt");
         }
      
      }
      //Check to see if there is an error
      catch (Exception f)
      {
         System.out.println("Sorry there was an error!");
      }  
      
   }
   
}