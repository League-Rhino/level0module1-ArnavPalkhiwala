package variables_and_conditionals;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Highlowgame {
	public static void main(String[] args) {
		Random randal = new Random();
		int v = randal.nextInt(101);
		int x = 0;
		System.out.println(v);
		for (int i = 0; i < 1000; i++) {

			String number = JOptionPane.showInputDialog("Guess a number between 1 and 100" + "...");
			x += 1;
			int value = Integer.parseInt(number);
			if (value > v) {
				JOptionPane.showMessageDialog(null, "The number is too high....");
			} else if (value < v) {
				JOptionPane.showMessageDialog(null, "The number is too low....");
			} else if (value == v) {
				JOptionPane.showMessageDialog(null, "The number is correct....");
				i = 1000;
			}
		}
		JOptionPane.showMessageDialog(null, "It took you " + x + " tries to figure this out!");

	}
}
