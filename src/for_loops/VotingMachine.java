package for_loops;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class VotingMachine {
	public static void main(String[] args) {
		String numberofpeople = JOptionPane
				.showInputDialog("How many people are going to be voting for the president of the universe?");
		int v = Integer.parseInt(numberofpeople);
		int z = 0;
		int y = 0;

		for (int i = 0; i < v; i++) {
			String answer = JOptionPane.showInputDialog(
					"Who should be president of the universe, Dwayne (The Rock) Johnson or Bill Nye the Science Guy?");
			if (answer.equalsIgnoreCase("The Rock")) {
				z += 1;
			}
			if (answer.equalsIgnoreCase("Bill Nye The Science Guy")) {
				y += 1;
			}
		}
		if (z > y) {
			JOptionPane.showMessageDialog(null,
					"Dwayne (The Rock) Johnson is the winner and will inherit everything in existence!!!");
		}
		if (z < y) {
			JOptionPane.showMessageDialog(null,
					"Bill Nye the Science Guy is the winner and will inherit everything in existence!!!");
		}
		if (z == y) {
			JOptionPane.showMessageDialog(null,
					"There is no  winner and no one will inherit everything in existence!!!");
		}

	}
}
