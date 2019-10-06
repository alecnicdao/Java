/******************
Alastair Nicdao
Mission #13
4/13/18
******************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Mission13Nicdao
{
   private JFrame main;
   private JLabel lblInstruct;
   private JTextField txtInput;
   private String[] solution = new String[5];
   
   private int colorNum = 0;
   
   //Constructor
   public Mission13Nicdao ()
   {
      //Get user to play the memory game
      main = new JFrame ("Memory Game");
      main.setSize(400,200);
      main.setDefaultCloseOperation(main.EXIT_ON_CLOSE);
      main.setLayout(new FlowLayout());
      
      //Get color number 1
      lblInstruct = new JLabel("Enter color number 1:");
      txtInput = new JTextField(15);
      
      txtInput.addActionListener(new GameListener());
      
      main.add(lblInstruct);
      main.add(txtInput);
      
      randomizeColors();
      
      main.setVisible(true);
   }
   private void randomizeColors ()
   {
      Random r = new Random ();
      
      String[] listOfColors = {"blue", "green", "purple", "pink", "red", "yellow", "white", "black", "silver", "orange"};
      
      for (int i = 0; i < solution.length; i++)
      {
         solution[i] = listOfColors[r.nextInt(listOfColors.length)];
      }
      
      //Get message to the user
      JOptionPane.showMessageDialog(null, "How good is your memory? Try to memorize these colors:\n\n" + solution[0] + ", " +
         solution[1] + ", " + solution[2] + ", " + solution[3] + ", " + solution[4]);
   }
   
   //Add action
   private class GameListener implements ActionListener
   {
      //Get the user to enter color
      public void actionPerformed (ActionEvent e)
      {
         String guess = txtInput.getText();
         
         if (guess.equalsIgnoreCase(solution[colorNum]))
         {
            colorNum++;
            
            if (colorNum < 5)
            {
               lblInstruct.setText("Enter color number #" + (colorNum + 1) + ": ");
               txtInput.setText("");
            }
            //If the user gets the all the colors right
            if (colorNum >= 5)
            {
               lblInstruct.setText("Congratulations - your memory is perfect!");
               txtInput.setVisible(false);
            }   
         }
         //If the user gets the wrong color
         else
         {
            lblInstruct.setText("Sorry. wrong color. Eat more antioxidants.");
            txtInput.setVisible(false);
         }
      }
      
   }
   
}//end of class