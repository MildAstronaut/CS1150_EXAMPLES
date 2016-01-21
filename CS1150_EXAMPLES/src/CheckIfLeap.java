import javax.swing.JOptionPane;


public class CheckIfLeap {
	public static void main (String[]args){
		
		String yearString = JOptionPane.showInputDialog("Enter a year: ");
		int year = Integer.parseInt(yearString);
		
		boolean b = ((year%4 == 0 && year%100 != 0) || year%400 == 0);
		
		if (b){
			JOptionPane.showMessageDialog(null, "The year: " + year + " is a leap year.");
		} else{
			JOptionPane.showMessageDialog(null, "The year: " + year + " is NOT a leap year.");

			
		}
		
		
	}
}
