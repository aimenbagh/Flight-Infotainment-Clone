package project_IHM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

public class Google {
    static JToggleButton google;
    //private static JEditorPane editorgoogle;

    public Google(JPanel CENTERDivertissement1, JPanel CENTERDivertissement2, JPanel CENTERDivertissement3,
                  JPanel CENTERDivertissement4, JPanel CENTERDivertissement5, JPanel CENTERDivertissement6, JPanel CENTER5,
                  JPanel CENTER2, JPanel NORTHDivertissement, JPanel CENTERDivertissement) {

        google = new JToggleButton("Google");
       
        /*
        editorgoogle = new JEditorPane();
        editorgoogle.setEditable(false);
        editorgoogle.setPreferredSize(new Dimension(680, 480)); // Set preferred size for the editor pane
		*/
        
		ImageIcon googleIcon = new ImageIcon("src\\project_IHM\\img\\google.png");
		Image googleImage = googleIcon.getImage();

		BackgroundPanel Imagegoogle = new BackgroundPanel(googleImage, CENTERDivertissement1);
		
        google.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NORTHDivertissement.add(Google.google);
                NORTHDivertissement.add(News.news);
                NORTHDivertissement.add(Musique.musique);
                NORTHDivertissement.add(Movies.movies);
                NORTHDivertissement.add(Game.game);
                NORTHDivertissement.add(Book.book);
            	ButtonManager.showButton(Google.google,News.news,Musique.musique,Movies.movies,Game.game,Book.book);

                PanelManager.showPanel(CENTER5,CENTER2);
                CENTER5.add(NORTHDivertissement, BorderLayout.NORTH);
                CENTER5.add(CENTERDivertissement, BorderLayout.CENTER);
                
                /*try {
                    // Load Google website content into JEditorPane
                    editorgoogle.setPage(new URL("https://www.google.com"));
                } catch (IOException ex) {
                    ex.printStackTrace(); // Handle the exception appropriately
                }
                
                JScrollPane scrollPane = new JScrollPane(editorgoogle);
                scrollPane.setPreferredSize(new Dimension(680, 480)); // Set preferred size for the scroll pane
                */
				
                
                PanelManager.showPanel(CENTERDivertissement1, CENTERDivertissement2, CENTERDivertissement3,
						CENTERDivertissement4, CENTERDivertissement5, CENTERDivertissement6);
                
                CENTERDivertissement1.add(Imagegoogle);
            }
        });
  
    
    }
    
}
