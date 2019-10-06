/******************
Alastair Nicdao
Mission #11
3/29/18
******************/

import java.util.*;

public class Mission11Nicdao
{

   public static void main (String[] args)
   {
      Scanner in = new Scanner (System.in);
      String acctName;
      int choice = 0;
      boolean quit = false;
      
      //Welcome the user and ask for name
      System.out.println("Welcome to the Bank of Alastair!");
      System.out.println("Please enter your name to create an account:");
      acctName = in.next();
      
      while (acctName.isEmpty())
      {
         System.out.println("Invalid choice, please try again");
         acctName = in.next();
      }

      //Store the name with the account number
      BankAccount acct = new BankAccount (acctName, 231411);
      
      while (true)
      {
        
         System.out.println("");
         
         System.out.println("Press 1 to make a deposit");
         System.out.println("Press 2 to make a withdrawal");
         System.out.println("Press 3 to get account information");
         System.out.println("Press 4 to quit");
         
        choice = in.nextInt();

        switch (choice) 
        {
            //Get the money to deposit
            case 1: 
                System.out.println("Please enter the amount to deposit:");
                double deposit = in.nextDouble();
                
                while(deposit <= 0)
                {
                    System.out.println("Invalid amount, please try again");
                    deposit = in.nextDouble();
                }

                acct.deposit(deposit);
                System.out.println("Deposited $" + deposit);
                break;
            //Get the money to withdraw
            case 2:
                System.out.println("Please enter the amount of the withdrawal");
                double withdraw = in.nextDouble();
                
                while (withdraw <= 0)
                {
                    System.out.println("Invalid amount, please try again");
                    withdraw = in.nextDouble();
                }
                acct.withdraw(withdraw);
                System.out.println("Withdrew $" + withdraw + ".");
                System.out.println("New balance: $" + acct.getBalance());
                break;
            case 3:
            //Get the name, account number, and the balance
                System.out.println("Name: " + acct.getName());
                System.out.println("Account #: " + acct.getAccountNum());
                System.out.println("Balance: " + acct.getBalance());
                break;
            case 4:
            //End the program if the user wants to quit
                System.out.println("Thank you for your business!");
                return;
            default:
                System.out.println("Invalid choice: " + choice + ". Try again.");
        }         
        
      } 
      
   }
   
}