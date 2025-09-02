package project_IHM;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;

public class News {

	public static JToggleButton news;
    //private static JEditorPane editorgoogle;

	public News(JPanel CENTERDivertissement1, JPanel CENTERDivertissement2, JPanel CENTERDivertissement3,
			JPanel CENTERDivertissement4, JPanel CENTERDivertissement5, JPanel CENTERDivertissement6, JPanel CENTER5,
			JPanel CENTER2, JPanel NORTHDivertissement, JPanel CENTERDivertissement) {

		news = new JToggleButton("Actualité");
		
        /*
		editorgoogle = new JEditorPane();
        editorgoogle.setEditable(false);
        editorgoogle.setPreferredSize(new Dimension(680, 480)); // Set preferred size for the editor pane
		*/
		
		ImageIcon newsIcon = new ImageIcon("src\\project_IHM\\img\\news.png");
		Image newsImage = newsIcon.getImage();

		BackgroundPanel Imagenews = new BackgroundPanel(newsImage, CENTERDivertissement2);
		
		news.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NORTHDivertissement.add(Google.google);
				NORTHDivertissement.add(News.news);
				NORTHDivertissement.add(Musique.musique);
				NORTHDivertissement.add(Movies.movies);
				NORTHDivertissement.add(Game.game);
				NORTHDivertissement.add(Book.book);
				
				NORTHDivertissement.add(Google.google);
				NORTHDivertissement.add(News.news);
				NORTHDivertissement.add(Musique.musique);
				NORTHDivertissement.add(Movies.movies);
				NORTHDivertissement.add(Game.game);
				NORTHDivertissement.add(Book.book);

            	ButtonManager.showButton(News.news,Book.book,Google.google,Musique.musique,Movies.movies,Game.game);

				PanelManager.showPanel(CENTER5, CENTER2);
				CENTER5.add(NORTHDivertissement, BorderLayout.NORTH);
				CENTER5.add(CENTERDivertissement, BorderLayout.CENTER);
				
				/*
				try {
	                    // Load Google website content into JEditorPane
	                    editorgoogle.setPage(new URL("http://news.google.com/?output=rss"));
	                } catch (IOException ex) {
	                    ex.printStackTrace(); // Handle the exception appropriately
	                }
	                
	                JScrollPane scrollPane = new JScrollPane(editorgoogle);
	                scrollPane.setPreferredSize(new Dimension(680, 480)); // Set preferred size for the scroll pane
	            */
							
				
				PanelManager.showPanel(CENTERDivertissement2, CENTERDivertissement1, CENTERDivertissement3,
						CENTERDivertissement4, CENTERDivertissement5, CENTERDivertissement6);
					        
				CENTERDivertissement2.add(Imagenews);
			}
		});
	}

}
