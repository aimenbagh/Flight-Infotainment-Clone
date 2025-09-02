package project_IHM;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class Map {
    static JToggleButton map;
    static BackgroundPanel bp;

    public Map(JPanel CENTER1, JPanel CENTER2, JPanel CENTER3, JPanel CENTER4, JPanel CENTER5, JPanel CENTER6,
            JPanel CENTER7,JPanel CENTER8) {
    	map = new JToggleButton("Map");
    	
        ImageIcon mapIcon = new ImageIcon("src\\project_IHM\\img\\map.jpg");
        Image mapImage = mapIcon.getImage();

        bp = new BackgroundPanel(mapImage, CENTER8);

        map.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ButtonManager.showButton(Map.map,Accueil.accueil,Divertissement.divertissement,Facture.facture,Service.service);

                PanelManager.showPanel(CENTER8, CENTER1, CENTER2, CENTER3, CENTER4, CENTER5, CENTER6,CENTER7);
                CENTER8.add(bp);
            }
        });

    }
}
