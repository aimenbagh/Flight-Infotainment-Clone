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

public class GameChild {
	public static JButton game;
	public static JToggleButton game1;

	public GameChild(JPanel CENTERChild1, JPanel CENTERChild2, JPanel CENTERChild3, JPanel CENTERChild4, JPanel CENTER7,
			JPanel CENTER6, JPanel NORTHChild, JPanel CENTERChild) {

		ImageIcon gameIcon = new ImageIcon(
				"src\\project_IHM\\img\\game.png");
		Image gameImage = gameIcon.getImage();

		BackgroundPanel Imagegame = new BackgroundPanel(gameImage, CENTERChild3);

		ImageIcon gameIcon1 = new ImageIcon(
				"src\\project_IHM\\img\\games.png");
		ImageIcon gameIcon2 = new ImageIcon(
				"src\\project_IHM\\img\\games (1).png");

		game = new JButton(gameIcon1);
		game1 = new JToggleButton(gameIcon2);
		game.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NORTHChild.add(MoviesChild.movies1);
				NORTHChild.add(MusiqueChild.musique1);
				NORTHChild.add(GameChild.game1);
				NORTHChild.add(BookChild.book1);
				NORTHChild.setBackground(Color.BLACK);
            	ButtonManager.showButton(GameChild.game1,BookChild.book1,MusiqueChild.musique1,MoviesChild.movies1);

				 PanelManager.showPanel(CENTER7, CENTER6);
			        CENTER7.add(NORTHChild, BorderLayout.NORTH);
					CENTER7.add(CENTERChild, BorderLayout.CENTER);

			        PanelManager.showPanel(CENTERChild3, CENTERChild1, CENTERChild2, CENTERChild4);

				CENTERChild3.add(Imagegame);
				}
		});

		game1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NORTHChild.add(MoviesChild.movies1);
				NORTHChild.add(MusiqueChild.musique1);
				NORTHChild.add(GameChild.game1);
				NORTHChild.add(BookChild.book1);
				NORTHChild.setBackground(Color.BLACK);
            	ButtonManager.showButton(GameChild.game1,BookChild.book1,MusiqueChild.musique1,MoviesChild.movies1);

				 PanelManager.showPanel(CENTER7, CENTER6);
			        CENTER7.add(NORTHChild, BorderLayout.NORTH);
					CENTER7.add(CENTERChild, BorderLayout.CENTER);

			        PanelManager.showPanel(CENTERChild3, CENTERChild1, CENTERChild2, CENTERChild4);

				CENTERChild3.add(Imagegame);
				}
		});
	}

}
