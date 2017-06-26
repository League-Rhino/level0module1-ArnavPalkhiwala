
package variables_and_conditionals;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("When is your birthday? Just the month.");
		if (birthday.equalsIgnoreCase("April")) {
			JOptionPane.showMessageDialog(null, "You are an Aries and you will be rich soon.");
		} else if (birthday.equalsIgnoreCase("May")) {
			JOptionPane.showMessageDialog(null, ("You are a Taurus and you are a very kind person."));
		} else if (birthday.equalsIgnoreCase("June")) {
			JOptionPane.showMessageDialog(null, ("You are a Gemini and you will get everything you want in life."));
		} else if (birthday.equalsIgnoreCase("July")) {
			JOptionPane.showMessageDialog(null, ("You are a Cancer and you will one day become famous."));
		} else if (birthday.equalsIgnoreCase("August")) {
			JOptionPane.showMessageDialog(null, ("You are a Leo and you are extremely clever."));
		} else if (birthday.equalsIgnoreCase("September")) {
			JOptionPane.showMessageDialog(null, ("You are a Virgo and you are selfless."));
		} else if (birthday.equalsIgnoreCase("October")) {
			JOptionPane.showMessageDialog(null, ("You are a Libra and you are very popular."));
		} else if (birthday.equalsIgnoreCase("November")) {
			JOptionPane.showMessageDialog(null, ("You are a Scorpio and you can be anything you desire."));
		} else if (birthday.equalsIgnoreCase("December")) {
			JOptionPane.showMessageDialog(null, ("You are a Sagittarius and you are mean to helpless people."));
		} else if (birthday.equalsIgnoreCase("January")) {
			JOptionPane.showMessageDialog(null, ("You are a Capricorn and you are very selfish."));
		} else if (birthday.equalsIgnoreCase("Feburary")) {
			JOptionPane.showMessageDialog(null, ("You are an Aquarious and you are good-looking."));
		} else if (birthday.equalsIgnoreCase("March")) {
			JOptionPane.showMessageDialog(null, ("You are a Pisces and you are a very athletic."));
		}
	}
}
