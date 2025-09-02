package project_IHM;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToggleButton;

public class Service {
	static JButton appel, Valider, Annuler;
	static JToggleButton service;

	static JLabel d1, d2, d3;
	private JTable service1, service2, service3;
	JPanel CENTERService = new JPanel(new GridLayout(3, 2, 5, 5));
	JPanel CENTERService1 = new JPanel(new GridBagLayout());
	JPanel CENTERService2 = new JPanel(new GridBagLayout());
	JPanel CENTERService3 = new JPanel(new GridBagLayout());
	JPanel SOUTHService = new JPanel(new GridLayout(0, 2, 5, 5));
	private String[][] Boisson = { { "Bouteille d'eau", "2.99$" }, { "Jus d'orange", "3.99$" },
			{ "Coka cola", "4.99$" }, { "Lait", "5.99$" }, { "Café", "6.99$" },

	};
	private String[][] Plat = { { "Salade verte", "2.99$" }, { "Gratin", "3.99$" }, { "Soupe", "4.99$" },
			{ "Humburger", "5.99$" }, { "Pizza", "6.99$" },

	};
	private String[][] confort = { { "Des bouchons d'oreille", "2.99$" }, { "Un masque", "3.99$" },
			{ "Un coussin lombaire", "4.99$" }, { "Une couverture polaire", "5.99$" }, { "Un coussin", "6.99$" },

	};

	public Service(JFrame fen, JPanel CENTER1, JPanel CENTER2, JPanel CENTER3, JPanel CENTER4, JPanel CENTER5,
			JPanel CENTER6, JPanel CENTER7, JPanel CENTER8, GridBagConstraints c) {
		service = new JToggleButton("Service");
		// appel = new JButton("Appeler Hotesse");
		Valider = new JButton("Valider");
		Annuler = new JButton("Annuler");

		d1 = new JLabel("boisson:");
		d2 = new JLabel("plats:     ");
		d3 = new JLabel("confort:");
		String[] service12 = { "Type de boisson", "Prix", "Commander" };
		Object[][] boissonCheckbox = new Object[Boisson.length][3];
		for (int i = 0; i < Boisson.length; i++) {
			boissonCheckbox[i][0] = Boisson[i][0];
			boissonCheckbox[i][1] = Boisson[i][1];
			boissonCheckbox[i][2] = Boolean.FALSE;
		}

		service1 = new JTable(boissonCheckbox, service12);
		service1.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(new JCheckBox()));
		service1.getColumnModel().getColumn(2).setCellRenderer(new CheckBoxRenderer());
		JScrollPane service13 = new JScrollPane(service1);

		String[] service22 = { "Type de Plat", "Prix", "Commander" };
		Object[][] PlatCheckbox = new Object[Plat.length][3];
		for (int i = 0; i < Plat.length; i++) {
			PlatCheckbox[i][0] = Plat[i][0];
			PlatCheckbox[i][1] = Plat[i][1];
			PlatCheckbox[i][2] = Boolean.FALSE;
		}

		service2 = new JTable(PlatCheckbox, service22);
		service2.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(new JCheckBox()));
		service2.getColumnModel().getColumn(2).setCellRenderer(new CheckBoxRenderer());
		JScrollPane service23 = new JScrollPane(service2);

		String[] service32 = { "        ", "Prix", "Commander" };
		Object[][] confortCheckbox = new Object[confort.length][3];
		for (int i = 0; i < confort.length; i++) {
			confortCheckbox[i][0] = confort[i][0];
			confortCheckbox[i][1] = confort[i][1];
			confortCheckbox[i][2] = Boolean.FALSE;
		}

		service3 = new JTable(confortCheckbox, service32);
		service3.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(new JCheckBox()));
		service3.getColumnModel().getColumn(2).setCellRenderer(new CheckBoxRenderer());
		JScrollPane service33 = new JScrollPane(service3);

		CENTERService1.add(d1);
		CENTERService1.add(service13, c);

		CENTERService2.add(d2);
		CENTERService2.add(service23, c);

		CENTERService3.add(d3);
		CENTERService3.add(service33, c);

		CENTERService.add(CENTERService1);
		CENTERService.add(CENTERService2);
		CENTERService.add(CENTERService3);

		SOUTHService.add(Annuler);
		SOUTHService.add(Valider);
		service.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonManager.showButton(Service.service, Accueil.accueil, Map.map, Divertissement.divertissement,
						Facture.facture);

				PanelManager.showPanel(CENTER3, CENTER1, CENTER2, CENTER4, CENTER5, CENTER6, CENTER7, CENTER8);
				CENTER3.add(CENTERService, BorderLayout.CENTER);
				CENTER3.add(SOUTHService, BorderLayout.SOUTH);
			}
		});
		/*
		 * appel.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { PanelManager.showPanel(CENTER3, CENTER1,
		 * CENTER2, CENTER4, CENTER5, CENTER6, CENTER7);
		 * 
		 * CENTER3.add(CENTERService, BorderLayout.CENTER);
		 * CENTER3.add(SOUTHService,BorderLayout.SOUTH); } });
		 */
		Valider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(fen, "Votre commande est validée!");

			}
		});

		Annuler.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Remettre toutes les cases à cocher à false
				for (int i = 0; i < service1.getRowCount(); i++) {
					service1.setValueAt(Boolean.FALSE, i, 2);
				}
				for (int i = 0; i < service2.getRowCount(); i++) {
					service2.setValueAt(Boolean.FALSE, i, 2);
				}
				for (int i = 0; i < service3.getRowCount(); i++) {
					service3.setValueAt(Boolean.FALSE, i, 2);
				}
			}
		});

	}

}
