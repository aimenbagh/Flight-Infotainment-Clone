package project_IHM;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;


public class Musique {

	public static JToggleButton musique;
	//private static JEditorPane editormusiqu;

	public Musique(JPanel CENTERDivertissement1, JPanel CENTERDivertissement2, JPanel CENTERDivertissement3,
			JPanel CENTERDivertissement4, JPanel CENTERDivertissement5, JPanel CENTERDivertissement6, JPanel CENTER5,
			JPanel CENTER2, JPanel NORTHDivertissement, JPanel CENTERDivertissement) {

		musique = new JToggleButton("Musique");
		
		/*
		editormusiqu = new JEditorPane();
		editormusiqu.setEditable(false);
		editormusiqu.setPreferredSize(new Dimension(680, 480));
		*/
		
		ImageIcon musiqueIcon = new ImageIcon("src\\project_IHM\\img\\music.png");
		Image musiqueImage = musiqueIcon.getImage();

		BackgroundPanel Imagemusique = new BackgroundPanel(musiqueImage, CENTERDivertissement3);
		
		
		musique.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NORTHDivertissement.add(Google.google);
				NORTHDivertissement.add(News.news);
				NORTHDivertissement.add(Musique.musique);
				NORTHDivertissement.add(Movies.movies);
				NORTHDivertissement.add(Game.game);
				NORTHDivertissement.add(Book.book);
				
            	ButtonManager.showButton(Musique.musique,Book.book,Google.google,News.news,Movies.movies,Game.game);

				PanelManager.showPanel(CENTER5, CENTER2);
				CENTER5.add(NORTHDivertissement, BorderLayout.NORTH);
				CENTER5.add(CENTERDivertissement, BorderLayout.CENTER);
				/*	
			 	try {
					// Load Google website content into JEditorPane
					editormusiqu.setPage(new URL("https://music.youtube.com"));
				} catch (IOException ex) {
					ex.printStackTrace(); // Handle the exception appropriately
				}

				JScrollPane scrollPane = new JScrollPane(editormusiqu);
				scrollPane.setPreferredSize(new Dimension(680, 480)); // Set preferred size for the scroll pane
				 */
				
				
				PanelManager.showPanel(CENTERDivertissement3, CENTERDivertissement1, CENTERDivertissement2,
						CENTERDivertissement4, CENTERDivertissement5, CENTERDivertissement6);
				
				CENTERDivertissement3.add(Imagemusique);

			}
		});
	}
}
