package project_IHM;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class Movies {
	public static JToggleButton movies;

	public Movies(JPanel CENTERDivertissement1, JPanel CENTERDivertissement2, JPanel CENTERDivertissement3,
			JPanel CENTERDivertissement4, JPanel CENTERDivertissement5, JPanel CENTERDivertissement6, JPanel CENTER5,
			JPanel CENTER2, JPanel NORTHDivertissement, JPanel CENTERDivertissement) {

		movies = new JToggleButton("Films");

		ImageIcon moviesIcon = new ImageIcon("src\\project_IHM\\img\\movies.jpg");
		Image moviesImage = moviesIcon.getImage();

		BackgroundPanel Imagegoogle = new BackgroundPanel(moviesImage, CENTERDivertissement4);

		movies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NORTHDivertissement.add(Google.google);
				NORTHDivertissement.add(News.news);
				NORTHDivertissement.add(Musique.musique);
				NORTHDivertissement.add(Movies.movies);
				NORTHDivertissement.add(Game.game);
				NORTHDivertissement.add(Book.book);
				PanelManager.showPanel(CENTER5,CENTER2);
				CENTER5.add(NORTHDivertissement, BorderLayout.NORTH);
				CENTER5.add(CENTERDivertissement, BorderLayout.CENTER);
            	ButtonManager.showButton(Movies.movies,Google.google,News.news,Musique.musique,Game.game,Book.book);

				PanelManager.showPanel(CENTERDivertissement4, CENTERDivertissement1, CENTERDivertissement2,
						CENTERDivertissement3, CENTERDivertissement5, CENTERDivertissement6);
				CENTERDivertissement4.add(Imagegoogle);

				

			}
		});
	}

}
