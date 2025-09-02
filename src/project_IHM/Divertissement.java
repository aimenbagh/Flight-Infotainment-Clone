package project_IHM;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Divertissement {

	static JToggleButton divertissement, movies, musique, google, news, game, book;

	public Divertissement(JPanel CENTER1, JPanel CENTER2, JPanel CENTER3, JPanel CENTER4, JPanel CENTER5,
			JPanel CENTER6, JPanel CENTER7, JPanel CENTER8, GridBagConstraints c) {
		divertissement = new JToggleButton("Divertissement");

		divertissement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonManager.showButton(Divertissement.divertissement, Accueil.accueil, Map.map, Facture.facture,
						Service.service, Google.google, News.news, Musique.musique, Movies.movies, Game.game,
						Book.book);

				PanelManager.showPanel(CENTER2, CENTER1, CENTER3, CENTER4, CENTER5, CENTER6, CENTER7, CENTER8);

				CENTER2.add(Google.google);
				CENTER2.add(News.news);
				CENTER2.add(Musique.musique);
				CENTER2.add(Movies.movies);
				CENTER2.add(Game.game);
				CENTER2.add(Book.book);

			}
		});

		JPanel NORTHDivertissement = new JPanel(new GridLayout(0, 6, 5, 5));

		Border contourBoutons = BorderFactory.createEmptyBorder(2, 2, 2, 2);
		NORTHDivertissement.setBorder(contourBoutons);

		JPanel CENTERDivertissement = new JPanel(new GridBagLayout());
		Border contour = new LineBorder(Color.BLACK, 2);
		CENTERDivertissement.setBorder(contour);
		JPanel CENTERDivertissement1 = new JPanel();
		JPanel CENTERDivertissement2 = new JPanel();
		JPanel CENTERDivertissement3 = new JPanel();
		JPanel CENTERDivertissement4 = new JPanel();
		JPanel CENTERDivertissement5 = new JPanel();
		JPanel CENTERDivertissement6 = new JPanel();

		new Movies(CENTERDivertissement1, CENTERDivertissement2, CENTERDivertissement3, CENTERDivertissement4,
				CENTERDivertissement5, CENTERDivertissement6, CENTER5, CENTER2, NORTHDivertissement,
				CENTERDivertissement);
		new Musique(CENTERDivertissement1, CENTERDivertissement2, CENTERDivertissement3, CENTERDivertissement4,
				CENTERDivertissement5, CENTERDivertissement6, CENTER5, CENTER2, NORTHDivertissement,
				CENTERDivertissement);
		new Google(CENTERDivertissement1, CENTERDivertissement2, CENTERDivertissement3, CENTERDivertissement4,
				CENTERDivertissement5, CENTERDivertissement6, CENTER5, CENTER2, NORTHDivertissement,
				CENTERDivertissement);
		new News(CENTERDivertissement1, CENTERDivertissement2, CENTERDivertissement3, CENTERDivertissement4,
				CENTERDivertissement5, CENTERDivertissement6, CENTER5, CENTER2, NORTHDivertissement,
				CENTERDivertissement);
		new Game(CENTERDivertissement1, CENTERDivertissement2, CENTERDivertissement3, CENTERDivertissement4,
				CENTERDivertissement5, CENTERDivertissement6, CENTER5, CENTER2, NORTHDivertissement,
				CENTERDivertissement);
		new Book(CENTERDivertissement1, CENTERDivertissement2, CENTERDivertissement3, CENTERDivertissement4,
				CENTERDivertissement5, CENTERDivertissement6, CENTER5, CENTER2, NORTHDivertissement,
				CENTERDivertissement);

		CENTERDivertissement.add(CENTERDivertissement1, c);
		CENTERDivertissement.add(CENTERDivertissement2, c);
		CENTERDivertissement.add(CENTERDivertissement3, c);
		CENTERDivertissement.add(CENTERDivertissement4, c);
		CENTERDivertissement.add(CENTERDivertissement5, c);
		CENTERDivertissement.add(CENTERDivertissement6, c);

		CENTERDivertissement1.setVisible(false);
		CENTERDivertissement2.setVisible(false);
		CENTERDivertissement3.setVisible(false);
		CENTERDivertissement4.setVisible(false);
		CENTERDivertissement5.setVisible(false);
		CENTERDivertissement6.setVisible(false);

	}

}
