import javax.swing.JOptionPane;

public class AirlineRegistration {
	public static void main(String[] args) {
		String lastName = JOptionPane.showInputDialog("What is your last name?");
		String firstName = JOptionPane.showInputDialog("What is your first name?");
		String birthdayMonth = JOptionPane.showInputDialog("What is your birthday month?");
		String birthdayDay = JOptionPane.showInputDialog("What is your birthday day?");
		String birthdayYear = JOptionPane.showInputDialog("What is your birthday year?");
		String rowNumber = JOptionPane.showInputDialog("What is your row number?");
		String seatNumber = JOptionPane.showInputDialog("What is your seat number?");
		JOptionPane.showMessageDialog(null, lastName + ", " + firstName + birthdayMonth + "/" + birthdayDay + "/" + birthdayYear+ "Row" + ": " + rowNumber+ "Seat" + ": " + seatNumber);
		

	}

}
