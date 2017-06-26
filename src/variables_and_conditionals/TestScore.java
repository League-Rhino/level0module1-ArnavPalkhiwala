package variables_and_conditionals;

import javax.swing.JOptionPane;

public class TestScore {
public static void main(String[] args) {
String percent=JOptionPane.showInputDialog("What percent did you get?");
int value = Integer.parseInt(percent);
if (value>=97) {
JOptionPane.showMessageDialog(null, "Great job!! You got an A+");
}
if (value>=97) {
JOptionPane.showMessageDialog(null, "Good job!! You got an A");
}
































}
}
