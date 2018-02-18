/* KnightDriver.java
    Andrew Wood - COP3252

    Asks the user to input attributes for the knight using dialog boxes and then
    displays the knight attributes with another dialog box.
 */

import javax.swing.JOptionPane;

public class KnightDriver
{
    public static void main (String[] args)
    {
        //Creates a knight object with default constructor
        Knight knight = new Knight();

        //Creates a stars object with default constructor
        Stars stars = new Stars();

        //Prompts the user to enter the name of the knight, then sets the name.
        String name = JOptionPane.showInputDialog(null,"What is the knight's name?","Knight Name",JOptionPane.PLAIN_MESSAGE);
        knight.setName(name);

        //Prompts the user to enter the health of the knight, then sets the health; note - the string return value is converted to an Int.
        int health = Integer.parseInt(JOptionPane.showInputDialog(null,"What is the knight's health value?","Health",JOptionPane.PLAIN_MESSAGE));
        knight.setHealth(health);

        //Prompts the user to enter the number of Battles, then sets the battle value.
        int battles = Integer.parseInt(JOptionPane.showInputDialog(null,"How many battles has the knight had?","Battles",JOptionPane.PLAIN_MESSAGE));
        knight.setBattles(battles);

        //Prompts the user to enter the age, then sets the age value.
        int age = Integer.parseInt(JOptionPane.showInputDialog(null,"How old is the knight?","Age",JOptionPane.PLAIN_MESSAGE));
        knight.setAge(age);

        //Prompts the user to enter the gold value, then sets the gold value
        int gold = Integer.parseInt(JOptionPane.showInputDialog(null,"How much gold has the knight pillaged?","Gold",JOptionPane.PLAIN_MESSAGE));
        knight.setGold(gold);

        //Prompts the user to enter the row value for the stars, then sets the row value in the Stars object
        int rows = Integer.parseInt(JOptionPane.showInputDialog(null,"How many rows of stars is the knight observing?","Star Rows",JOptionPane.PLAIN_MESSAGE));
        stars.setRows(rows);

        //Prompts the user to enter the column value for the stars, then sets the column value in the Stars object
        int columns = Integer.parseInt(JOptionPane.showInputDialog(null,"How many columns of stars is the knight observing?","Star Columns",JOptionPane.PLAIN_MESSAGE));
        stars.setColumns(columns);

        StringBuilder starArray = new StringBuilder();  //initialize starArray to empty string
        int numRows = stars.getRows();
        int numCols = stars.getColumns();
        int rowCounter = 0;
        int colCounter = 0;

        //put the star array into a string object that will subsequently be passed to the dialog as an argument
        while (rowCounter != numRows)
        {
            if ((rowCounter % 2) != 0) //if we're on an odd row
            {
                starArray.append(" "); //add a space to the line
            }
            while (colCounter != numCols)
            {
                starArray.append("* ");
                ++colCounter;
            }
            colCounter = 0; //reset column counter
            starArray.append("\n"); //add newline
            ++rowCounter; //increment row counter
        }

        //Begin the process for outputting the results to a new dialog box
        JOptionPane.showMessageDialog(null,"Knight Name: " + knight.getName()
                + "\nKnight Health: " + knight.getHealth() + "\nKnight Battles: " + knight.getBattles()
                + "\nKnight Age: " + knight.getAge() + "\nKnight Gold: $" + knight.getGold()
                + "\n" + starArray,"Knight Summary",JOptionPane.INFORMATION_MESSAGE);
    }
}