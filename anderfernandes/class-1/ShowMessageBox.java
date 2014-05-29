import javax.swing.JOptionPane;

public class ShowMessageBox {
	public static void main (String[] args){
		// Display message Welcome to Java! in console
		JOptionPane.showMessageDialog(null, "4 x 40 = " + 4 * 40 + ". That is the result.", "Simple Calculation", JOptionPane.DEFAULT_OPTION);
	}
	
}