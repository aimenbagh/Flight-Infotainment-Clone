package project_IHM;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class Game {
	public static JToggleButton game;

	public Game(JPanel CENTERDivertissement1, JPanel CENTERDivertissement2, JPanel CENTERDivertissement3,
			JPanel CENTERDivertissement4, JPanel CENTERDivertissement5, JPanel CENTERDivertissement6, JPanel CENTER5,
			JPanel CENTER2, JPanel NORTHDivertissement, JPanel CENTERDivertissement) {

		game = new JToggleButton("Jeux");

		ImageIcon gameIcon = new ImageIcon("src\\project_IHM\\img\\game.png"); 
		Image gameImage = gameIcon.getImage();
        
		BackgroundPanel Imagegame = new BackgroundPanel(gameImage, CENTERDivertissement5);		
		
		game.addActionListener(new ActionListener() {
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
            	ButtonManager.showButton(Game.game,Book.book,Google.google,News.news,Musique.musique,Movies.movies);

				PanelManager.showPanel(CENTERDivertissement5, CENTERDivertissement1, CENTERDivertissement2,
						CENTERDivertissement3, CENTERDivertissement4, CENTERDivertissement6);
				 CENTERDivertissement5.add(Imagegame);
				
			}
		});
	}

}
