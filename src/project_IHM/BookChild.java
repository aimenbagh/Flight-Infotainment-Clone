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

public class BookChild {
	public static JButton book;
	public static JToggleButton book1;

	public BookChild(JPanel CENTERChild1, JPanel CENTERChild2, JPanel CENTERChild3, JPanel CENTERChild4, JPanel CENTER7,
			JPanel CENTER6, JPanel NORTHChild, JPanel CENTERChild) {

		ImageIcon bookIcon = new ImageIcon("src\\project_IHM\\img\\bookchild.png");
		Image bookImage = bookIcon.getImage();

		BackgroundPanel Imagebook = new BackgroundPanel(bookImage, CENTERChild4);

		ImageIcon bookIcon1 = new ImageIcon("src\\\\project_IHM\\\\img\\\\books (1).png");
		ImageIcon bookIcon2 = new ImageIcon("src\\project_IHM\\img\\books (2).png");

		book = new JButton(bookIcon1);
		book1 = new JToggleButton(bookIcon2);

		book.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NORTHChild.add(MoviesChild.movies1);
				NORTHChild.add(MusiqueChild.musique1);
				NORTHChild.add(GameChild.game1);
				NORTHChild.add(BookChild.book1);
				NORTHChild.setBackground(Color.BLACK);
            	ButtonManager.showButton(BookChild.book1,GameChild.game1,MusiqueChild.musique1,MoviesChild.movies1);

		        PanelManager.showPanel(CENTER7, CENTER6);
		        CENTER7.add(NORTHChild, BorderLayout.NORTH);
				CENTER7.add(CENTERChild, BorderLayout.CENTER);

		        PanelManager.showPanel(CENTERChild4, CENTERChild1, CENTERChild2, CENTERChild3);

				CENTERChild4.add(Imagebook);

			}
		});
		book1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NORTHChild.add(MoviesChild.movies1);
				NORTHChild.add(MusiqueChild.musique1);
				NORTHChild.add(GameChild.game1);
				NORTHChild.add(BookChild.book1);
				NORTHChild.setBackground(Color.BLACK);
            	ButtonManager.showButton(BookChild.book1,GameChild.game1,MusiqueChild.musique1,MoviesChild.movies1);

		        PanelManager.showPanel(CENTER7, CENTER6);
		        CENTER7.add(NORTHChild, BorderLayout.NORTH);
				CENTER7.add(CENTERChild, BorderLayout.CENTER);

		        PanelManager.showPanel(CENTERChild4, CENTERChild1, CENTERChild2, CENTERChild3);

				CENTERChild4.add(Imagebook);

			}
		});
	}

}
