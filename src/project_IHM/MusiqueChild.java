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

public class MusiqueChild {

	public static JButton musique;
	public static JToggleButton musique1;

	
	public MusiqueChild(JPanel CENTERChild1, JPanel CENTERChild2, JPanel CENTERChild3, JPanel CENTERChild4,
			JPanel CENTER7, JPanel CENTER6, JPanel NORTHChild, JPanel CENTERChild) {

		ImageIcon musiqueIcon = new ImageIcon("src\\project_IHM\\img\\musicChild.png");
		Image musiqueImage = musiqueIcon.getImage();

		BackgroundPanel Imagemusique = new BackgroundPanel(musiqueImage, CENTERChild2);

		ImageIcon musiqueIcon1 = new ImageIcon("src\\project_IHM\\img\\music-note.png");

		ImageIcon musiqueIcon2 = new ImageIcon("src\\project_IHM\\img\\music-note (1).png");

		musique = new JButton(musiqueIcon1);
		musique1 = new JToggleButton(musiqueIcon2);
		musique.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				NORTHChild.add(MoviesChild.movies1);
				NORTHChild.add(MusiqueChild.musique1);
				NORTHChild.add(GameChild.game1);
				NORTHChild.add(BookChild.book1);
				NORTHChild.setBackground(Color.BLACK);
            	ButtonManager.showButton(MusiqueChild.musique1,MoviesChild.movies1,GameChild.game1,BookChild.book1);

				PanelManager.showPanel(CENTER7, CENTER6);
				CENTER7.add(NORTHChild, BorderLayout.NORTH);
				CENTER7.add(CENTERChild, BorderLayout.CENTER);

				PanelManager.showPanel(CENTERChild2, CENTERChild1, CENTERChild3, CENTERChild4);
				CENTERChild2.add(Imagemusique);

			}
		});
		musique1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				NORTHChild.add(MoviesChild.movies1);
				NORTHChild.add(MusiqueChild.musique1);
				NORTHChild.add(GameChild.game1);
				NORTHChild.add(BookChild.book1);
				NORTHChild.setBackground(Color.BLACK);
            	ButtonManager.showButton(MusiqueChild.musique1,MoviesChild.movies1,GameChild.game1,BookChild.book1);

				PanelManager.showPanel(CENTER7, CENTER6);
				CENTER7.add(NORTHChild, BorderLayout.NORTH);
				CENTER7.add(CENTERChild, BorderLayout.CENTER);

				PanelManager.showPanel(CENTERChild2, CENTERChild1, CENTERChild3, CENTERChild4);
				CENTERChild2.add(Imagemusique);

			}
		});
	}
}
