package project_IHM;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class MoviesChild {
	public static JButton movies;
	public static JToggleButton movies1;

	
	public MoviesChild(JPanel CENTERChild1, JPanel CENTERChild2, JPanel CENTERChild3, JPanel CENTERChild4,
			JPanel CENTER7, JPanel CENTER6, JPanel NORTHChild, JPanel CENTERChild) {

		ImageIcon moviesIcon = new ImageIcon("src\\project_IHM\\img\\moviechild.jpg.png");
		Image moviesImage = moviesIcon.getImage();

		BackgroundPanel Imagemovies = new BackgroundPanel(moviesImage, CENTERChild1);

		ImageIcon moviesIcon1 = new ImageIcon(
				"src\\project_IHM\\img\\video-player (4).png");

		ImageIcon moviesIcon2 = new ImageIcon(
				"src\\\\project_IHM\\\\img\\\\video-player (1).png");

		movies = new JButton(moviesIcon1);
		movies1 = new JToggleButton(moviesIcon2);

		movies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NORTHChild.add(MoviesChild.movies1);
				NORTHChild.add(MusiqueChild.musique1);
				NORTHChild.add(GameChild.game1);
				NORTHChild.add(BookChild.book1);
				NORTHChild.setBackground(Color.BLACK);
            	ButtonManager.showButton(MoviesChild.movies1,GameChild.game1,BookChild.book1,MusiqueChild.musique1);

				PanelManager.showPanel(CENTER7, CENTER6);
		        CENTER7.add(NORTHChild, BorderLayout.NORTH);
				CENTER7.add(CENTERChild, BorderLayout.CENTER);

		        PanelManager.showPanel(CENTERChild1, CENTERChild2, CENTERChild3, CENTERChild4);
				CENTERChild1.add(Imagemovies);
				}
		});
		movies1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NORTHChild.add(MoviesChild.movies1);
				NORTHChild.add(MusiqueChild.musique1);
				NORTHChild.add(GameChild.game1);
				NORTHChild.add(BookChild.book1);
				NORTHChild.setBackground(Color.BLACK);
            	ButtonManager.showButton(MoviesChild.movies1,GameChild.game1,BookChild.book1,MusiqueChild.musique1);

				PanelManager.showPanel(CENTER7, CENTER6);
		        CENTER7.add(NORTHChild, BorderLayout.NORTH);
				CENTER7.add(CENTERChild, BorderLayout.CENTER);

		        PanelManager.showPanel(CENTERChild1, CENTERChild2, CENTERChild3, CENTERChild4);
				CENTERChild1.add(Imagemovies);
			}
		});
	}

}
