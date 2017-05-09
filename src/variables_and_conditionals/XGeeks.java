package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

        // 1. Save the superpower for each person in a variable.
	String dannysPower= "ignorant";
	String varnitsPower= "everything";
	String arnavsPower= "invisible";
	String evansPower= "sleeping";
	
	// 2. Ask the user to enter a name. Store their answer in a variable.
	String answer = JOptionPane.showInputDialog("Who's superpower do you want to know?");
        // 3. Show the superpower in a pop-up, depending on the name entered. 
	if (answer.equalsIgnoreCase("Danny"))
	{ JOptionPane.showMessageDialog(null, "Danny is " + dannysPower);}
	if (answer.equalsIgnoreCase("Varnit"))
	
	{ JOptionPane.showMessageDialog(null, "Varnit knows " + varnitsPower );}
	if (answer.equalsIgnoreCase("Arnav"))
	{ JOptionPane.showMessageDialog(null, "Arnav is "+ arnavsPower);}
	if (answer.equalsIgnoreCase("Evan"))
	{ JOptionPane.showMessageDialog(null, "Evan is " + evansPower);}



}
}