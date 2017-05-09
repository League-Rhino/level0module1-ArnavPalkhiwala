import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PizzaShop {
public static void main(String[] args) throws IOException {
JOptionPane.showMessageDialog(null, "Welcome to Arnav's Pizza Shop... ");
JOptionPane.showMessageDialog(null, "What drinks would you like?" );
String water= JOptionPane.showInputDialog("Water is free, please type the quantity of each item");
String soda= JOptionPane.showInputDialog("Soda is $2.00, please type the quantity of each item");
String beer= JOptionPane.showInputDialog("Beer is $10.00,please type the quantity of each item");
String wine= JOptionPane.showInputDialog("Wine is $15.00, please type the quantity of each item");
JOptionPane.showMessageDialog(null, "You have ordered " + water+ " waters, " + soda +" soda(s), "+ beer+ " beer(s),"+  " and" +wine +" glass(es) of wine." );
JOptionPane.showMessageDialog(null, "Here are your drinks...");
JOptionPane.showMessageDialog(null, "It is now time for the appetizers: ");;
String cesearSalad= JOptionPane.showInputDialog("We have a Cesear Salad for $7.00, please type the quantity of each item");
String houseSalad= JOptionPane.showInputDialog("House Salad for $5.00, please type the quantity of each item");
String breadsticks= JOptionPane.showInputDialog("And Cheesy breadsticks for $4.00, please type the quantity of each item");
JOptionPane.showMessageDialog(null, "You have ordered "+ cesearSalad +" Cesear Salad(s) "+ houseSalad+ " House Salad(s) and " + breadsticks + " Order of the Breadsticks.");
String refills= JOptionPane.showInputDialog("Would you like any refills on drinks?");
String answer = null;
if (answer.equalsIgnoreCase("Yes"))
{ JOptionPane.showMessageDialog(null, "Sorry, we are out!");}

















}

private static File newURL(Object https) {
	// TODO Auto-generated method stub
	return null;
}
}
