package project_IHM;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.Mixer;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Passager {
	static JFrame fen;
	static JButton appel, son, lum, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11;
	static JComboBox<String> langue;
	static JLabel date, heure, siege, destination, duree, arrivee, d;
	static String[] langues = { "Francais", "Arabe", "Anglais", "Espagnol", "Allemand" };
	private static JSlider volumeSlider, luminositySlider;
	static JTextField passe, Conf;

	public static String mdp = null;
	static ImageIcon lumicon = new ImageIcon("src/project_IHM/img/sun.png");
	static ImageIcon sonicon = new ImageIcon("src\\project_IHM\\img\\volume.png");
	static ImageIcon icon = new ImageIcon("src/project_IHM/img/padlock.png");
	static JPanel CENTER7;
	static boolean allow = false;
	static JButton[] buttons;

	public static void main(String[] args) {

		fen = new JFrame();
		fen.setSize(680, 480);
		fen.setTitle("Passager");
		fen.setResizable(false);
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel(new BorderLayout());
		panel.setBorder(new EmptyBorder(5, 10, 5, 10));

		JPanel NORTH = new JPanel(new GridLayout(2, 0, 10, 10));
		JPanel NORTH1 = new JPanel(new GridLayout(0, 6, 10, 10));
		JPanel NORTH1_3 = new JPanel(new GridLayout(0, 2, 10, 10));
		JPanel NORTH2 = new JPanel(new GridLayout(0, 5, 2, 2));
		Border contourBoutons = BorderFactory.createEmptyBorder(2, 2, 2, 2);
		NORTH2.setBorder(contourBoutons);

		JPanel CENTER = new JPanel(new GridBagLayout());
		Border contour = new LineBorder(Color.BLACK, 2);
		CENTER.setBorder(contour);
		JPanel CENTER1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
		JPanel CENTER2 = new JPanel(new GridLayout(3, 2, 5, 5));
		JPanel CENTER3 = new JPanel(new BorderLayout());
		JPanel CENTER4 = new JPanel(new GridBagLayout());
		JPanel CENTER5 = new JPanel(new BorderLayout());
		JPanel CENTER6 = new JPanel(new GridLayout(2, 2, 5, 5));
		JPanel CENTER7 = new JPanel(new BorderLayout());
		JPanel CENTER8 = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));


		JPanel SOUTH = new JPanel(new GridLayout(0, 3));

		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH; // !!
		c.weightx = 1.0; // !!
		c.weighty = 1.0;

		volumeSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
		volumeSlider.setMajorTickSpacing(20);
		volumeSlider.setMinorTickSpacing(10);
		volumeSlider.setPaintTicks(true);
		volumeSlider.setPaintLabels(true);
		volumeSlider.setEnabled(true);
		volumeSlider.setVisible(true);

        //this is for setting the value
		volumeSlider.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider src = (JSlider)e.getSource();
                //if (src.getValueIsAdjusting()) return; //optional
                if (src.getValue() % 5 !=0) return;
                float value = src.getValue() / 100.0f;
                // System.out.println(value);
                try {
                    getVolumeControl().setValue(value);
                    //you can put a click play code here to have nice feedback when moving slider
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        });
		luminositySlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
		luminositySlider.setMajorTickSpacing(20);
		luminositySlider.setMinorTickSpacing(10);
		luminositySlider.setPaintTicks(true);
		luminositySlider.setPaintLabels(true);
		luminositySlider.setVisible(true);

		new Accueil(CENTER1, CENTER2, CENTER3, CENTER4, CENTER5, CENTER6, CENTER7, CENTER8);
		new Divertissement(CENTER1, CENTER2, CENTER3, CENTER4, CENTER5, CENTER6, CENTER7, CENTER8, c);
		new Service(fen, CENTER1, CENTER2, CENTER3, CENTER4, CENTER5, CENTER6, CENTER7, CENTER8, c);
		new Facture(fen, CENTER1, CENTER2, CENTER3, CENTER4, CENTER5, CENTER6, CENTER7, CENTER8, c);
		new Map(CENTER1, CENTER2, CENTER3, CENTER4, CENTER5, CENTER6, CENTER7, CENTER8);

		new Child(CENTER1, CENTER2, CENTER3, CENTER4, CENTER5, CENTER6, CENTER7, CENTER8,NORTH2, c);
		d = new JLabel("Bienvenue:");
		// appel = new JButton("Appeler Hotesse");

		langue = new JComboBox<>(langues);

		ImageIcon sonicon = new ImageIcon("src\\project_IHM\\img\\volume.png");
		son = creerBouton(sonicon, "Volume");

		ImageIcon lumicon = new ImageIcon("src/project_IHM/img/sun.png");
		lum = creerBouton(lumicon, "Luminosité");

		date = new JLabel("Date: " + new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
		heure = new JLabel("Heure: " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
		siege = new JLabel("Siege: 10A");

		destination = new JLabel("Destination: Monaco");
		duree = new JLabel("Duree du vol: 1h30m");
		arrivee = new JLabel("Arrivee prevue: " + calculateArrivalTime());

		ImageIcon accueilIcon = new ImageIcon("src\\project_IHM\\img\\accueil.jpg");
		Image accueilImage = accueilIcon.getImage();

		BackgroundPanel bp = new BackgroundPanel(accueilImage, CENTER1);
		/*
		 * appel.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { JOptionPane.showConfirmDialog(fen, panelson,
		 * " "Appel de l'hotesse", JOptionPane.OK_CANCEL_OPTION,
		 * JOptionPane.PLAIN_MESSAGE, sonicon);
		 * 
		 * :: JOptionPane.showMessageDialog(fen, "Appel de l'hotesse..."); } });
		 */
		Child.child.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				modepasse();
				if (!allow) {
					Child.child.setSelected(!Child.child.getModel().isSelected());
				}
			}
		});
		son.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				afficherson();

			}
		});
		lum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				afficherlum();

			}
		});
		// NORTH
		NORTH1_3.add(lum, c);
		NORTH1_3.add(son, c);

		NORTH1.add(Child.child);
		NORTH1.add(langue);
		NORTH1.add(NORTH1_3, c);
		NORTH1.add(heure);
		NORTH1.add(siege);
		NORTH1.add(date);

		NORTH2.add(Accueil.accueil);
		NORTH2.add(Divertissement.divertissement);
		// NORTH2.add(Child.child);
		NORTH2.add(Service.service);
		NORTH2.add(Facture.facture);
		// NORTH2.add(appel);
		NORTH2.add(Map.map);

		NORTH.add(NORTH1);
		NORTH.add(NORTH2);

		panel.add(NORTH, BorderLayout.NORTH);

		// CENTER
    	ButtonManager.showButton(Accueil.accueil,Map.map,Divertissement.divertissement,Facture.facture,Service.service);

		PanelManager.showPanel(CENTER1, CENTER2, CENTER3, CENTER4, CENTER5, CENTER6, CENTER7, CENTER8);

		CENTER1.add(bp);
		CENTER.add(CENTER1, c);
		CENTER.add(CENTER2, c);
		CENTER.add(CENTER3, c);
		CENTER.add(CENTER4, c);
		CENTER.add(CENTER5, c);
		CENTER.add(CENTER6, c);
		CENTER.add(CENTER7, c);
		CENTER.add(CENTER8, c);

		panel.add(CENTER, BorderLayout.CENTER);

		// SOUTH
		SOUTH.add(duree);
		SOUTH.add(arrivee);
		SOUTH.add(destination);

		panel.add(SOUTH, BorderLayout.SOUTH);

		// FRAME
		fen.add(panel);
		fen.setVisible(true);

		Timer timer = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				heure.setText("Heure: " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
			}
		});
		timer.start();
	}

	public static void addListeners(JTextField field) {

		A1.addActionListener(new MyButtonActionListener(field, "1"));
		A2.addActionListener(new MyButtonActionListener(field, "2"));
		A3.addActionListener(new MyButtonActionListener(field, "3"));
		A4.addActionListener(new MyButtonActionListener(field, "4"));
		A5.addActionListener(new MyButtonActionListener(field, "5"));
		A6.addActionListener(new MyButtonActionListener(field, "6"));
		A7.addActionListener(new MyButtonActionListener(field, "7"));
		A8.addActionListener(new MyButtonActionListener(field, "8"));
		A9.addActionListener(new MyButtonActionListener(field, "9"));
		A10.addActionListener(new MyButtonActionListener(field, " "));
		A11.addActionListener(new MyButtonActionListener(field, "0"));
	}

	public static void modepasse() {
		allow = false;

		// Création d'une boîte de dialogue JOptionPane pour le formulaire
		JPanel motpasse = new JPanel(new GridLayout(2, 0, 5, 5));
		JPanel motpasse1 = new JPanel(new GridLayout(2, 2, 5, 5));
		JPanel motpasse2 = new JPanel(new GridLayout(4, 3, 5, 5));

		buttons = new JButton[] { A1 = new JButton("1"), A2 = new JButton("2"), A3 = new JButton("3"),
				A4 = new JButton("4"), A5 = new JButton("5"), A6 = new JButton("6"), A7 = new JButton("7"),
				A8 = new JButton("8"), A9 = new JButton("9"), A10 = new JButton("C"), A11 = new JButton("0") };

		motpasse1.add(new JLabel("Mot de passe*:"));
		passe = new JTextField();
		motpasse1.add(passe);

		motpasse1.add(new JLabel("Confirmer*:"));
		Conf = new JTextField();
		motpasse1.add(Conf);

		motpasse2.add(A1);
		motpasse2.add(A2);
		motpasse2.add(A3);
		motpasse2.add(A4);
		motpasse2.add(A5);
		motpasse2.add(A6);
		motpasse2.add(A7);
		motpasse2.add(A8);
		motpasse2.add(A9);
		motpasse2.add(A10);
		motpasse2.add(A11);
		motpasse.add(motpasse1);
		motpasse.add(motpasse2);

		passe.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				for (JButton b : buttons) {
					for (ActionListener al : b.getActionListeners()) {
						b.removeActionListener(al);
					}
				}
				addListeners(passe);

			}

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub

			}
		});

		Conf.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				for (JButton b : buttons) {
					for (ActionListener al : b.getActionListeners()) {
						b.removeActionListener(al);
					}
				}
				addListeners(Conf);

			}

			@Override
			public void focusLost(FocusEvent e) {

			}
		});

		// Affichage de la boîte de dialogue JOptionPane
		int result = JOptionPane.showConfirmDialog(fen, motpasse, "Mot de passe", JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE, icon);

		// Traitement des résultats du formulaire
		if (result == JOptionPane.OK_OPTION) {
			if (passe.getText().isEmpty()) {

				JOptionPane.showMessageDialog(fen, "Veuillez remplir les champs obligatoires (Mot de passe).");

			} else if (Conf.getText().isEmpty()) {

				JOptionPane.showMessageDialog(fen, "Veuillez remplir les champs obligatoires (Confirmer).");

			} else if (!Conf.getText().equals(passe.getText())) {

				JOptionPane.showMessageDialog(fen, "Les champs sont pas identiques.");

			} else {
				if (mdp == null) {
					mdp = passe.getText();
					allow = true;
				} else if (mdp.equals(passe.getText())) {
					allow = true;
				}
			}

		}

	}

	public static void afficherlum() {
		JPanel panellum = new JPanel(new GridLayout(1, 1, 5, 5));
		panellum.add(luminositySlider);

		// Affichage de la boîte de dialogue JOptionPane
		JOptionPane.showConfirmDialog(fen, panellum, "Luminosité", JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE, lumicon);

	}

	public static void afficherson() {
		JPanel panelson = new JPanel(new GridLayout(1, 1, 5, 5));
		panelson.add(volumeSlider);

		// Affichage de la boîte de dialogue JOptionPane
		JOptionPane.showConfirmDialog(fen, panelson, "Volume", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
				sonicon);

	}

	private static JButton creerBouton(String texte) {
		JButton bouton = new JButton(texte);
		bouton.setPreferredSize(new Dimension(40, 20));
		return bouton;
	}

	private static JButton creerBouton(ImageIcon icone, String tooltipText) {
		JButton bouton = new JButton(icone);
		bouton.setToolTipText(tooltipText);
		bouton.setContentAreaFilled(false); // Pour enlever la couleur de fond du bouton
		bouton.setBorderPainted(false); // Pour enlever la bordure du bouton
		return bouton;
	}

	private static String calculateArrivalTime() {
		Date now = new Date();
		long arrivalTime = now.getTime() + (1 * 3600 + 30 * 60) * 1000;
		return new SimpleDateFormat("HH:mm").format(new Date(arrivalTime));
	}
	
	/**
	 * @return main sound control object
	 * @throws Exception for any problem
	 */
	private static FloatControl getVolumeControl() throws Exception {
	    try {
	        Mixer.Info mixers[] = AudioSystem.getMixerInfo();
	        for (Mixer.Info mixerInfo : mixers) {
	            Mixer mixer = AudioSystem.getMixer(mixerInfo);
	            mixer.open();

	            //we check only target type lines, because we are looking for "SPEAKER target port"
	            for (Line.Info info : mixer.getTargetLineInfo()) {
	                if (info.toString().contains("SPEAKER")) {
	                    Line line = mixer.getLine(info);
	                    try {
	                        line.open();
	                    } catch (IllegalArgumentException iae) {}
	                    return (FloatControl) line.getControl(FloatControl.Type.VOLUME);
	                }
	            }
	        }
	    } catch (Exception ex) {
	        System.out.println("problem creating volume control object:"+ex);
	        throw ex;
	    }
	    throw new Exception("unknown problem creating volume control object");
	}
	

}
