

    /*Create a program that calculates an RPG Character's battle stats based on the character's physical stats.
    The physical and battle stat can be anything you wish provided it meets these criteria:

        The physical stats (Strength, Dexterity, Spirit etc ...) will be entered by the user
        The battle stats (damage, armor, mana capacity, spell strength ...) will be calculated based on the physical stats.

     We will continue to expand on this program throughout the year, so give it some thought. There should be some complexity.

     The program should run using dialog boxes and the output should show ALL the character's stats including a name.
     */
    import javax.swing.JOptionPane;
 public class RPGCharacter{

     public static void main(String [] args) {
         int name;
         String input;
         int strength;
         int energy;
         int dexterity;
         int spirit;

         input = JOptionPane.showInputDialog("Enter Character's Name:");
         name = Integer.parseInt(input);

         input = JOptionPane.showInputDialog("Enter Strength:");
         strength = Integer.parseInt(input);

         input = JOptionPane.showInputDialog("Enter Energy:");
         energy = Integer.parseInt(input);

         input = JOptionPane.showInputDialog("Enter Dexterity:");
         dexterity = Integer.parseInt(input);

         input = JOptionPane.showInputDialog("Enter Spirit:");
         spirit = Integer.parseInt(input);

         JOptionPane.showMessageDialog(null, "Character: " + name + "\n" + "Total Strength: " + strength + "\n" + "Total Energy: " + energy + "\n" + "Total Dexterity: " + dexterity + "\n" + "Total Spirit: " + spirit);



     }
    }



