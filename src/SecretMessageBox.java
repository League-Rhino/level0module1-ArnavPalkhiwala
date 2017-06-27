// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */
 
public class SecretMessageBox {
	public static void main(String[] args) {
	// 0. Make a main method and put steps 1-5 inside it
	
	// 1. Set the passcode in a String variable
		String secret = "10";
		int z = Integer.parseInt(secret);
	// 2. Using a pop-up, ask for a secret message and store it in a variable
		String message = JOptionPane.showInputDialog("What is the secret message?");
		int x = Integer.parseInt(message);
	// 3. Ask your friend for the passcode and store it in a variable
		String passcode = JOptionPane.showInputDialog("What is the passcode?");
		int y = Integer.parseInt(secret);
	// 4. If the passcode matches, show the secret message
		if(y == x) {
		JOptionPane.showMessageDialog(null, secret);}
		
	// 5. If the passcode does not match, pop-up "INTRUDER!!"
		else if(y != x) {
		JOptionPane.showMessageDialog(null, "Intruder!!!!!!!!!!!!!!!!!");
		}
		
	// [optional] 6. Have your friend also enter a username, and make sure it is correct before releasing the secret message.
 
}
}
 

