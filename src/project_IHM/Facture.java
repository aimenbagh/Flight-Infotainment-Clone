package project_IHM;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;

public class Facture {
	public static JButton  Payment1, Payment2, Payment3;
	public static JToggleButton facture;

	static JLabel d5;

	JPanel CENTERFacture = new JPanel(new BorderLayout());
	JPanel CENTERFacture1 = new JPanel();
	JPanel CENTERFacture2 = new JPanel(new GridLayout(2, 0, 10, 10));
	JPanel CENTERFacture21 = new JPanel(new GridLayout(0, 3, 10, 10));

	public Facture(JFrame fen, JPanel CENTER1, JPanel CENTER2, JPanel CENTER3, JPanel CENTER4, JPanel CENTER5,
			JPanel CENTER6, JPanel CENTER7,JPanel CENTER8, GridBagConstraints c) {
		facture = new JToggleButton("Facture");
		Payment1 = new JButton("Payement par carte crédit");
		Payment2 = new JButton("Payement par espèce");
		Payment3 = new JButton("Payement par chèque");

		d5 = new JLabel("TOTAL : 65$");

		DefaultTableModel factur = new DefaultTableModel(18, 2);
		factur.setColumnIdentifiers(new String[] { "projet", "prix" });

		JTable factur1 = new JTable(factur);
		JScrollPane factur2 = new JScrollPane(factur1);

		factur.setValueAt("Bouteille d'eau", 0, 0);
		factur.setValueAt("25$", 0, 1);

		factur.setValueAt("Soupe", 1, 0);
		factur.setValueAt("40$", 1, 1);

		CENTERFacture1.add(factur2, c);

		CENTERFacture21.add(Payment1, c);
		CENTERFacture21.add(Payment2, c);
		CENTERFacture21.add(Payment3, c);

		CENTERFacture2.add(d5, c);
		CENTERFacture2.add(CENTERFacture21, c);
		CENTERFacture.add(CENTERFacture1, BorderLayout.CENTER);
		CENTERFacture.add(CENTERFacture2, BorderLayout.SOUTH);
		facture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
            	ButtonManager.showButton(Facture.facture,Accueil.accueil,Map.map,Divertissement.divertissement,Service.service);

				PanelManager.showPanel(CENTER4, CENTER1, CENTER2, CENTER3, CENTER5, CENTER6, CENTER7,CENTER8);

				CENTER4.add(CENTERFacture, c);

			}

		});

		Payment1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(fen, "Paiement par carte de crédit effectué avec succès!");
			}
		});
		Payment2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(fen,
						"Paiement par espèce enregistré.\n Veuillez effectuer le paiement à notre bureau.");
			}
		});
		Payment3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(fen,
						"Paiement par espèce enregistré.\n Veuillez effectuer le paiement à notre bureau.");
			}
		});

	}

}
