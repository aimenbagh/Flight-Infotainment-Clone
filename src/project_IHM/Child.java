package project_IHM;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JToggleButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Child {

	static JToggleButton child;

	public Child(JPanel CENTER1, JPanel CENTER2, JPanel CENTER3, JPanel CENTER4, JPanel CENTER5, JPanel CENTER6,
			JPanel CENTER7, JPanel CENTER8, JPanel NORTH2, GridBagConstraints c) {
		child = new JToggleButton("Mode Enfant");
		child.setMargin(new Insets(0, 0, 0, 0));

		child.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean selected = child.getModel().isSelected();

				if (Passager.allow) {
					//System.out.println("T2");
					// AbstractButton abstractButton = (AbstractButton)e.getSource();

					if (selected) {
						PanelManager.showPanel(CENTER6, CENTER1, CENTER2, CENTER3, CENTER4, CENTER5, CENTER7, CENTER8,NORTH2);

						CENTER6.add(MoviesChild.movies);
						CENTER6.add(MusiqueChild.musique);
						CENTER6.add(GameChild.game);
						CENTER6.add(BookChild.book);
						CENTER6.setBackground(Color.BLACK);

					} else {
						PanelManager.showPanel(CENTER1, CENTER2, CENTER3, CENTER4, CENTER5, CENTER6, CENTER7, CENTER8,NORTH2);
						CENTER1.add(Accueil.bp);

						NORTH2.setVisible(true);
					}

				}
				Passager.allow = false;
			}
		});

		JPanel NORTHChild = new JPanel(new GridLayout(0, 4, 5, 5));

		Border contourBoutons = BorderFactory.createEmptyBorder(2, 2, 2, 2);
		NORTHChild.setBorder(contourBoutons);

		JPanel CENTERChild = new JPanel(new GridBagLayout());
		Border contour = new LineBorder(Color.BLACK, 2);
		CENTERChild.setBorder(contour);
		JPanel CENTERChild1 = new JPanel();
		JPanel CENTERChild2 = new JPanel();
		JPanel CENTERChild3 = new JPanel();
		JPanel CENTERChild4 = new JPanel();

		new MoviesChild(CENTERChild1, CENTERChild2, CENTERChild3, CENTERChild4, CENTER7, CENTER6, NORTHChild,
				CENTERChild);
		new MusiqueChild(CENTERChild1, CENTERChild2, CENTERChild3, CENTERChild4, CENTER7, CENTER6, NORTHChild,
				CENTERChild);
		new GameChild(CENTERChild1, CENTERChild2, CENTERChild3, CENTERChild4, CENTER7, CENTER6, NORTHChild,
				CENTERChild);
		new BookChild(CENTERChild1, CENTERChild2, CENTERChild3, CENTERChild4, CENTER7, CENTER6, NORTHChild,
				CENTERChild);

		MoviesChild.movies.setBackground(Color.WHITE);
		MoviesChild.movies.setBorderPainted(false);
		MusiqueChild.musique.setBackground(Color.WHITE);
		MusiqueChild.musique.setBorderPainted(false);
		GameChild.game.setBackground(Color.WHITE);
		GameChild.game.setBorderPainted(false);
		BookChild.book.setBackground(Color.WHITE);
		BookChild.book.setBorderPainted(false);

		MoviesChild.movies1.setBackground(Color.WHITE);
		MoviesChild.movies1.setBorderPainted(false);
		MusiqueChild.musique1.setBackground(Color.WHITE);
		MusiqueChild.musique1.setBorderPainted(false);
		GameChild.game1.setBackground(Color.WHITE);
		GameChild.game1.setBorderPainted(false);
		BookChild.book1.setBackground(Color.WHITE);
		BookChild.book1.setBorderPainted(false);
		CENTERChild.add(CENTERChild1, c);
		CENTERChild.add(CENTERChild2, c);
		CENTERChild.add(CENTERChild3, c);
		CENTERChild.add(CENTERChild4, c);

		CENTERChild1.setVisible(false);
		CENTERChild2.setVisible(false);
		CENTERChild3.setVisible(false);
		CENTERChild4.setVisible(false);

	}

}
