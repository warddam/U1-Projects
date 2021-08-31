




    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */


    import javax.swing.JOptionPane;

    public class Sales {

    public static void main(String [] args ) {

      String input;
      int quantity;
      int price;
      int discount;
      int salestax;

      double subtotal;
      double totalcost;
      double taxtotal;

      input = JOptionPane.showInputDialog("Enter Quantity");
      quantity = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter Price");
        price = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter Discount");
        discount = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter Sales Tax");
        salestax = Integer.parseInt(input);

        subtotal=(price * quantity) - discount;
        taxtotal=Math.round(subtotal * salestax)/10;
        totalcost= subtotal + taxtotal;

        JOptionPane.showMessageDialog(null, "Total Cost:$" + subtotal + "\n" + "Tax Total:$" + taxtotal + "\n" + "Total Cost:$" + totalcost);




    }
}
