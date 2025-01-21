//Brent Alexander 1-14-25 Chapter 1 Web Assist Assignment 1

import javax.swing.JOptionPane;

public class RandomGuess {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"Before pressing Ok try to guess my number Between 1 and 10");
		JOptionPane.showMessageDialog(null,
				"The Number is" + (1 + (int)(Math.random() * 10)));
		
	}

}
