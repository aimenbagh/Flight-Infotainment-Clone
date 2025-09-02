package project_IHM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class MyButtonActionListener implements ActionListener {
	private JTextField field;
	private String charToAdd;

	public MyButtonActionListener(JTextField field, String charToAdd) {
		this.field = field;
		this.charToAdd = charToAdd;
	}

	public void actionPerformed(ActionEvent e) {
		if (charToAdd == " ") {
			field.setText("");
		} else {
			field.setText(field.getText() + charToAdd);
		}

		/*
		 * if (i == 0) { passe.setText(passe.getText() + characterToAdd); } else if (i
		 * == 1) { Conf.setText(Conf.getText() + characterToAdd); }
		 */
	}

}
